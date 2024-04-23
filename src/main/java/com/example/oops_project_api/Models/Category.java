package com.example.oops_project_api.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Category {
    @jakarta.persistence.Id
    private Long Id;
    private String title;
    private  String description;
}
