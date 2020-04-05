package com.company.sapriko.dao.impl;

import com.company.sapriko.dao.DepositoryDAO;
import com.company.sapriko.entity.Depository;
import com.company.sapriko.model.DepositoryInfo;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import com.company.sapriko.model.PaginationResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


// Transactional for Hibernate
@Component
@Service
@Transactional
public class DepositoryDAOImpl implements DepositoryDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public Depository findProduct(int depository_id) {
        Session session = sessionFactory.getCurrentSession();
        Criteria crit = session.createCriteria(Depository.class);
        crit.add(Restrictions.eq("depository_id", depository_id));
        return (Depository) crit.uniqueResult();
    }

    @Override
    public DepositoryInfo findProductInfo(int depository_id) {
        Depository depository = this.findProduct(depository_id);
        if (depository == null) {
            return null;
        }
        return new DepositoryInfo(depository.getDepository_id(), depository.getGoods(), depository.getQuantity(), depository.getProvider());
    }

    @Override
    public void save(DepositoryInfo depositoryInfo) {

        int depository_id = depositoryInfo.getDepository_id();

        Depository depository;

        boolean isNew = false;
        depository = this.findProduct(depository_id);

        if (depository == null) {
            isNew = true;
            depository = new Depository();
        }
        depository.setDepository_id(depository_id);
        depository.setGoods(depositoryInfo.getGoods());
        depository.setQuantity(depositoryInfo.getQuantity());
        depository.setProvider(depositoryInfo.getProvider());

        if (isNew) {
            this.sessionFactory.getCurrentSession().persist(depository);
        }
        // If error in DB, Exceptions will be thrown out immediately
        this.sessionFactory.getCurrentSession().flush();
    }

    @Override
    public PaginationResult<DepositoryInfo> queryProducts(int page, int maxResult, int maxNavigationPage,
                                                       String likeName) {
        String sql = "Select new " + DepositoryInfo.class.getName() //
                + "(p.depository_id, p.goods, p.quantity, p.provider) " + " from "//
                + Depository.class.getName() + " p ";
        if (likeName != null && likeName.length() > 0) {
            sql += " Where lower(p.goods) like :likeName ";
        }
        sql += " order by p.goods desc ";
        //
        Session session = sessionFactory.getCurrentSession();

        Query query = session.createQuery(sql);
        if (likeName != null && likeName.length() > 0) {
            query.setParameter("likeName", "%" + likeName.toLowerCase() + "%");
        }
        return new PaginationResult<DepositoryInfo>(query, page, maxResult, maxNavigationPage);
    }

    @Override
    public PaginationResult<DepositoryInfo> queryProducts(int page, int maxResult, int maxNavigationPage) {
        return queryProducts(page, maxResult, maxNavigationPage, null);
    }
}