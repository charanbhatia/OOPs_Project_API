package com.example.oops_project_api.Services;

import com.example.oops_project_api.Exception.Productnotfound;
import com.example.oops_project_api.Models.Category;
import com.example.oops_project_api.Models.Product;
import com.example.oops_project_api.repositories.CategoryRepository;
import com.example.oops_project_api.repositories.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class SelfProductService implements ProductService{
    CategoryRepository categoryRepository;
    private ProductRepository productRepository;

    SelfProductService(ProductRepository productRepository, CategoryRepository categoryRepository){
        this.productRepository = productRepository;
        this.categoryRepository = categoryRepository;
    }
    @Override
    public Product getProductById(Long id) {
        Optional<Product> productOptional = productRepository.findById(id);
        if(productOptional.isEmpty()){
            throw new Productnotfound(id, "Product not found");
        }
        return productOptional.get();

    }

    @Override
    public List<Product> getAllProducts() {
        return null;
    }

    @Override
    public Product creatproduct(Product product) {
        Category category = new Category();
        Category savedcategory = null;
        if(category.getId() == null){
            product.setCategory(categoryRepository.save(category));
        }

        Product product1 = productRepository.save(product);
        Optional<Category> optionalCategory = categoryRepository.findById(category.getId());
        product1.setCategory(optionalCategory.get());
        return product1;
    }
}
