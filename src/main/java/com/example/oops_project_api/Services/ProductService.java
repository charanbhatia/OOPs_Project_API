package com.example.oops_project_api.Services;

import com.example.oops_project_api.Models.Product;

import java.util.List;

public interface ProductService {
    Product getProductById(Long id);

    List<Product> getAllProducts();

    Product creatproduct(Product product);
}
