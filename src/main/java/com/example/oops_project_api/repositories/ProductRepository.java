package com.example.oops_project_api.repositories;

import com.example.oops_project_api.Models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product, Long> {
    @Override
    Optional<Product> findById(Long id);

    Product save(Product product);
}

