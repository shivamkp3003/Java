package com.cloudthat.orderService.model;

import com.cloudthat.orderService.entity.OrderStatus;
import jakarta.persistence.Entity;
import lombok.*;

import java.time.Instant;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OrderModel {
    private Long id;
    private Long productId;
    private Long amount;
    private Long quantity;
    private OrderStatus orderStatus;
    private Instant orderDate;
}
