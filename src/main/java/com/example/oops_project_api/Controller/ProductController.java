package com.example.oops_project_api.Controller;

import com.example.oops_project_api.Models.Product;
import com.example.oops_project_api.Services.FakeStoreProductService;
import com.example.oops_project_api.Services.ProductService;
import com.example.oops_project_api.dtos.Expectiondtos;
import com.example.oops_project_api.dtos.FakeStoreProductdtos;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
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

//        ResponseEntity<Product> responseEntity = null;
//        Product product = null;
//        try{
//            product = fakeStoreProductService.getProductById(id);
//            responseEntity = new ResponseEntity<>(product, HttpStatus.OK);
//            System.out.println("hello");
//            return responseEntity;
//        }
//        catch (RuntimeException exception){
//            Expectiondtos expectiondtos = new Expectiondtos();
//            expectiondtos.setError("Something went wrong");
//
//            ResponseEntity<Expectiondtos> response= new ResponseEntity<>(expectiondtos, HttpStatus.NOT_FOUND);
//            return response;
//        }

        return fakeStoreProductService.getProductById(id);

    }
    @GetMapping()
    public List<Product>getAllProducts(){
        return fakeStoreProductService.getAllProducts();
    }
}
