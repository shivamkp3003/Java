package com.cloudthat.orderService.external.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name="PRODUCT-SERVICE")
public interface ProductService {
    @PutMapping("/api/products/reduceQuantity/{id}")
    public ResponseEntity<Void> reduceQuantity(@PathVariable("id") Long productId, @RequestParam Long quantity);
}
