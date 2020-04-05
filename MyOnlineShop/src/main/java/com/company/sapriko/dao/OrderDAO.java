package com.company.sapriko.dao;

import java.util.List;

import com.company.sapriko.model.CartInfo;
import com.company.sapriko.model.OrderInfo;
import com.company.sapriko.model.PaginationResult;

public interface OrderDAO {

    void saveOrder(CartInfo cartInfo);

    PaginationResult<OrderInfo> listOrderInfo(int page,
                                                     int maxResult, int maxNavigationPage);
    OrderInfo getOrderInfo(String orderId);

    List listOrderDetailInfos(String orderId);
}