package com.example.oops_project_api.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
//@AllArgsConstructor
public class Product {
    @jakarta.persistence.Id
    private Long Id;
    private String title;
    private  String description;
    private Double price;
    @ManyToOne
    private Category category;
    private  String image;

}
