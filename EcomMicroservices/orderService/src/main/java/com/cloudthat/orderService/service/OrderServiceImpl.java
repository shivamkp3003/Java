package com.cloudthat.orderService.service;

import com.cloudthat.orderService.entity.Order;
import com.cloudthat.orderService.external.client.ProductService;
import com.cloudthat.orderService.model.OrderModel;
import com.cloudthat.orderService.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Instant;

@Service
public class OrderServiceImpl implements OrderService{

    @Autowired
    ProductService productService;

    @Autowired
    OrderRepository orderRepository;

    @Override
    public long placeOrder(OrderModel orderRequest) {
        productService.reduceQuantity(orderRequest.getProductId(), orderRequest.getQuantity());

        Order order = Order.builder()
                .amount(orderRequest.getAmount())
                .orderStatus(orderRequest.getOrderStatus())
                .productId(orderRequest.getProductId())
                .orderDate(Instant.now())
                .quantity(orderRequest.getQuantity())
                .build();

        Order placedOrder = orderRepository.save(order);

        return placedOrder.getId();
    }

    @Override
    public OrderModel getOrderDetails(long orderId) {
        return null;
    }
}
