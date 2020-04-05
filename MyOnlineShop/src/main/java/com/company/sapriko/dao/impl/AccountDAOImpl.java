package com.company.sapriko.dao.impl;

import com.company.sapriko.model.AccountInfo;
import com.company.sapriko.model.PaginationResult;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import com.company.sapriko.dao.AccountDAO;
import com.company.sapriko.entity.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

// Transactional for Hibernate
@Component
@Service
@Transactional
public class AccountDAOImpl implements AccountDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public Account findAccount(String userName ) {
        Session session = sessionFactory.getCurrentSession();
        Criteria crit = session.createCriteria(Account.class);
        crit.add(Restrictions.eq("userName", userName));
        return (Account) crit.uniqueResult();
    }

    @Override
    public AccountInfo findAccountInfo(String code) {
        Account account = this.findAccount(code);
        if (account == null) {
            return null;
        }
        return new AccountInfo(account.getUserName(), account.getPassword(), account.isActive(), account.getUserRole());
    }

    @Override
    public void save(AccountInfo accountInfo) {
        String code = accountInfo.getUserRole();

        Account account = null;

        boolean isNew = false;
        if (code != null) {
            account = this.findAccount(code);
        }
        if (account == null) {
            isNew = true;
            account = new Account();
        }
        account.setUserName(accountInfo.getUserName());
        account.setPassword(accountInfo.getPassword());
        account.setActive(accountInfo.isActive());
        account.setUserRole(accountInfo.getUserRole());

        if (isNew) {
            this.sessionFactory.getCurrentSession().persist(account);
        }
        // If error in DB, Exceptions will be thrown out immediately
        this.sessionFactory.getCurrentSession().flush();
    }

    @Override
    public PaginationResult<AccountInfo> queryAccounts(int page, int maxResult, int maxNavigationPage,
                                                       String likeName) {
        String sql = "Select new " + AccountInfo.class.getName() //
                + "(p.userName, p.password, p.active, p.userRole) " + " from "//
                + Account.class.getName() + " p ";
        if (likeName != null && likeName.length() > 0) {
            sql += " Where lower(p.userName) like :likeName ";
        }
        //
        Session session = sessionFactory.getCurrentSession();

        Query query = session.createQuery(sql);
        if (likeName != null && likeName.length() > 0) {
            query.setParameter("likeName", "%" + likeName.toLowerCase() + "%");
        }
        return new PaginationResult<AccountInfo>(query, page, maxResult, maxNavigationPage);
    }
}