package com.example.oops_project_api.Services;

import com.example.oops_project_api.Models.Category;
import com.example.oops_project_api.Models.Product;
import com.example.oops_project_api.dtos.FakeStoreProductdtos;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class FakeStoreProductService implements  ProductService{
    @Override
    public Product getProductById(Long id) {
        RestTemplate restTemplate = new RestTemplate();
        FakeStoreProductdtos fakeStoreProductdtos =
                restTemplate.getForObject("https://fakestoreapi.com/products/" + id, FakeStoreProductdtos.class);

        if (fakeStoreProductdtos == null) {
            return null;
        }
        return convertfakestore(fakeStoreProductdtos);
    }

        public List<Product> getAllProducts(){
            RestTemplate restTemplate = new RestTemplate();
            FakeStoreProductdtos[] fakeStoreProductdtos =
                    restTemplate.getForObject("https://fakestoreapi.com/products" , FakeStoreProductdtos[].class);

            List<Product> products = new ArrayList<>();
            for(FakeStoreProductdtos fakeStoreProductdtos1 : fakeStoreProductdtos){
                products.add(convertfakestore(fakeStoreProductdtos1));
            }
            return products;
        }
    private Product convertfakestore(FakeStoreProductdtos fakeStoreProductdtos){
        Product product = new Product();
        product.setId(fakeStoreProductdtos.getId());
        product.setTitle(fakeStoreProductdtos.getTitle());
        product.setTitle(fakeStoreProductdtos.getTitle());
        product.setDescription(fakeStoreProductdtos.getDescription());
        product.setImage(fakeStoreProductdtos.getImage());
        Category category = new Category();
        category.setDescription(fakeStoreProductdtos.getCategory());
        product.setCategory(category);

        return product;


        }
}
