package com.example.oops_project_api.Controller;

import com.example.oops_project_api.Models.Product;
import com.example.oops_project_api.Services.FakeStoreProductService;
import com.example.oops_project_api.dtos.FakeStoreProductdtos;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    private FakeStoreProductService fakeStoreProductService;

    ProductController(FakeStoreProductService fakeStoreProductService){
        this.fakeStoreProductService = fakeStoreProductService;
    }



    @GetMapping("/{id}")
    public Product getproductById(@PathVariable("id") Long id){

        return fakeStoreProductService.getProductById(id);
    }
    @GetMapping()
    public List<Product>getAllProducts(){
        return fakeStoreProductService.getAllProducts();
    }
}
