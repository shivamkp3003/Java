package com.cloudthat.productService.service;


import com.cloudthat.productService.entity.Product;
import com.cloudthat.productService.exception.ProductServiceCustomException;
import com.cloudthat.productService.model.ProductModel;
import com.cloudthat.productService.repository.ProductRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
@Log4j2
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductRepository productRepository;

    @Override
    public List<ProductModel> getProducts() {
        log.info("inside getProducts...");
        List<Product> productList = productRepository.findAll();
        return productList.stream()
                .map(this::productToProductModel).toList();
    }

    @Override
    public ProductModel createProduct(ProductModel productModel) {
        log.info("Creating a product...");
        Product product = productRepository.save(productModelToProduct(productModel));
        return productToProductModel(product);
    }

    @Override
    public void deleteProduct(Long productid) {
        Product product = productRepository.findById(productid).get();
        productRepository.deleteById(productid);
    }

    @Override
    public ProductModel updateProduct(Long productId, ProductModel productModel) {
        Product productDB = productRepository.findById(productId).get();

        if(Objects.nonNull(productModel.getName()) && !("".equalsIgnoreCase(productModel.getName()))){
            productDB.setName(productModel.getName());
        }

        if(Objects.nonNull(productModel.getQuantity())){
            productDB.setQuantity(productModel.getQuantity());
        }

        if(Objects.nonNull(productModel.getPrice())){
            productDB.setPrice(productModel.getPrice());
        }

        productRepository.save(productDB);

        return productToProductModel(productDB);

    }

    @Override
    public ProductModel getProduct(Long productId) {

        return productRepository.findById(productId)
                .map(this::productToProductModel)
                .orElseThrow(()->new RuntimeException("Product Not Found"));
    }

    @Override
    public List<ProductModel> getProductByName(String productName) {
        List<Product> productList = productRepository.findAllByName(productName);


        return productList.stream().map(this::productToProductModel).toList();

    }

    @Override
    public ProductModel reduceQuantity(Long productId, Long quantity) {
        Product product
                = productRepository.findById(productId)
                .orElseThrow(() -> new ProductServiceCustomException(
                        "Product with given Id not found",
                        "PRODUCT_NOT_FOUND"
                ));

        if(product.getQuantity() < quantity) {
            throw new ProductServiceCustomException(
                    "Product does not have sufficient Quantity",
                    "INSUFFICIENT_QUANTITY"
            );
        }

        product.setQuantity(product.getQuantity() - quantity);
        productRepository.save(product);

        return productToProductModel(product);
    }

    private ProductModel productToProductModel(Product product){
        ProductModel productModel = new ProductModel();
        productModel.setId(product.getId());
        productModel.setName(product.getName());
        productModel.setPrice(product.getPrice());
        productModel.setQuantity(product.getQuantity());
        productModel.setCategory(product.getCategory());
        return productModel;
    }

    private Product productModelToProduct(ProductModel productModel){
        Product product = new Product();
        product.setId(productModel.getId());
        product.setName(productModel.getName());
        product.setPrice(productModel.getPrice());
        product.setQuantity(productModel.getQuantity());
        product.setCategory(productModel.getCategory());
        return product;
    }
}
