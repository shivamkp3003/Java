package com.cloudthat.orderService.controller;

import com.cloudthat.orderService.model.ApiResponse;
import com.cloudthat.orderService.model.OrderModel;
import com.cloudthat.orderService.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/orders")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @PostMapping("/placeOrder")
    public ResponseEntity<Long> placeOrder(@RequestBody OrderModel orderRequest) {
        long orderId = orderService.placeOrder(orderRequest);
        return new ResponseEntity<>(orderId, HttpStatus.OK);
    }

    @GetMapping("/{orderId}")
    public ResponseEntity<OrderModel> getOrderDetails(@PathVariable long orderId) {
        OrderModel orderResponse
                = orderService.getOrderDetails(orderId);

        return new ResponseEntity<>(orderResponse,
                HttpStatus.OK);
    }
}
