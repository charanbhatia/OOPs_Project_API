package com.example.oops_project_api.Models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
//@AllArgsConstructor
public class Product {
    private Long Id;
    private String title;
    private  String description;
    private Double price;
    private Category category;
    private  String image;

}
