package com.company.sapriko.dao;

import com.company.sapriko.entity.Account;
import com.company.sapriko.model.AccountInfo;
import com.company.sapriko.model.PaginationResult;

public interface AccountDAO {

    Account findAccount(String userName);

    AccountInfo findAccountInfo(String code) ;

    void save(AccountInfo accountInfo);

    PaginationResult<AccountInfo> queryAccounts(int page, int maxResult,
                                                int maxNavigationPage, String likeName);
}