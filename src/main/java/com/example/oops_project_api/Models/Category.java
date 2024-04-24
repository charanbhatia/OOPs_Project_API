package com.example.oops_project_api.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Category {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @jakarta.persistence.Id
    private Long Id;
    private String title;
    private  String description;
}
