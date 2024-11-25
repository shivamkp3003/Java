package com.cloudthat.productService.service;



import com.cloudthat.productService.model.ProductModel;

import java.util.List;

public interface ProductService {
    List<ProductModel> getProducts();

    ProductModel createProduct(ProductModel productModel);

    void deleteProduct(Long productid);

    ProductModel updateProduct(Long productId, ProductModel productModel);

    ProductModel getProduct(Long productId);

    List<ProductModel> getProductByName(String productName);

    ProductModel reduceQuantity(Long productId, Long quantity);
}
