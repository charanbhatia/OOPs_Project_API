package com.example.oops_project_api.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
//@AllArgsConstructor
public class Product {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @jakarta.persistence.Id
    private Long Id;
    private String title;
    private  String description;
    private Double price;
    @ManyToOne
    private Category category;
    private  String image;

}
