package com.company.sapriko.dao;

import com.company.sapriko.entity.Product;
import com.company.sapriko.model.PaginationResult;
import com.company.sapriko.model.ProductInfo;

public interface ProductDAO {

    Product findProduct(String code);

    ProductInfo findProductInfo(String code) ;

    PaginationResult<ProductInfo> queryProducts(int page,
                                                       int maxResult, int maxNavigationPage  );
    PaginationResult<ProductInfo> queryProducts(int page, int maxResult,
                                                       int maxNavigationPage, String likeName);
    void save(ProductInfo productInfo);
}