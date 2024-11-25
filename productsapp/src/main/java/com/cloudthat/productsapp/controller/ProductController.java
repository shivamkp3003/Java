package com.cloudthat.productsapp.controller;

import com.cloudthat.productsapp.model.ApiResponse;
import com.cloudthat.productsapp.model.ProductModel;
import com.cloudthat.productsapp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping("/api/products")
    public ResponseEntity<ApiResponse> getAllProducts(){
        List<ProductModel> products = productService.getProducts();
        return new ResponseEntity<ApiResponse>(new ApiResponse(true,"products fetched successfully",products), HttpStatus.OK);
    }

    @PostMapping("/api/products")
    public ResponseEntity<ApiResponse> createProduct(@RequestBody ProductModel productModel){
        ProductModel createdProduct = productService.createProduct(productModel);
        return new ResponseEntity<ApiResponse>(new ApiResponse(true,"product created successfully",createdProduct), HttpStatus.CREATED);
    }

    @PutMapping("/api/products/{productId}")
    public ResponseEntity<ApiResponse> updateProduct(@PathVariable("productId") Long productId, @RequestBody ProductModel productModel){
        ProductModel updatedProduct = productService.updateProduct(productId, productModel);
        return new ResponseEntity<ApiResponse>(new ApiResponse(true,"product updated successfully",updatedProduct), HttpStatus.OK);
    }

    @DeleteMapping("/api/products/{productId}")
    public ResponseEntity<ApiResponse> deleteProduct(@PathVariable("productId") Long productid){
        productService.deleteProduct(productid);
        return new ResponseEntity<ApiResponse>(new ApiResponse(true,"product deleted successfully",""), HttpStatus.OK);
    }

    @GetMapping("/api/products/{productId}")
    public ResponseEntity<ApiResponse> getSingleProduct(@PathVariable("productId") Long productId){
        ProductModel product = productService.getProduct(productId);
        return new ResponseEntity<ApiResponse>(new ApiResponse(true,"product fetched successfully",product), HttpStatus.OK);
    }

    // /api/products/123
    // /api/products/name?productName=onion
    @GetMapping("/api/products/name")
    public ResponseEntity<ApiResponse> getProductByName(@RequestParam("productName") String productName){
        List<ProductModel> products = productService.getProductByName(productName);
        return new ResponseEntity<ApiResponse>(new ApiResponse(true,"product fetched successfully",products), HttpStatus.OK);
    }
}
