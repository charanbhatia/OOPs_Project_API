package com.example.oops_project_api.Exception;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Productnotfound extends RuntimeException{
    private Long id;
    public Productnotfound(Long id, String error){
        super(error);
        this.id = id;
    }
}
