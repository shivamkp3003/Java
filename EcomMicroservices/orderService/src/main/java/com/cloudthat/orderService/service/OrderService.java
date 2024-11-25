package com.cloudthat.orderService.service;

import com.cloudthat.orderService.model.OrderModel;

public interface OrderService {
    long placeOrder(OrderModel orderRequest);

    OrderModel getOrderDetails(long orderId);
}
