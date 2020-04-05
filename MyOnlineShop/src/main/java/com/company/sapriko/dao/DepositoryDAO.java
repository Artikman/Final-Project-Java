package com.company.sapriko.dao;

import com.company.sapriko.entity.Depository;
import com.company.sapriko.model.PaginationResult;
import com.company.sapriko.model.DepositoryInfo;

public interface DepositoryDAO {

    Depository findProduct(int depository_id);

    DepositoryInfo findProductInfo(int depository_id) ;

    PaginationResult<DepositoryInfo> queryProducts(int page,
                                                int maxResult, int maxNavigationPage  );
    PaginationResult<DepositoryInfo> queryProducts(int page, int maxResult,
                                                int maxNavigationPage, String likeName);
    void save(DepositoryInfo depositoryInfo);
}