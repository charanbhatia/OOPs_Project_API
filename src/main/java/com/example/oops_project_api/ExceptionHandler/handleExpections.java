package com.example.oops_project_api.ExceptionHandler;

import com.example.oops_project_api.Exception.Productnotfound;
import com.example.oops_project_api.dtos.Expectiondtos;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class handleExpections {
    @ExceptionHandler(ArithmeticException.class)
    public ResponseEntity<Expectiondtos> hanndleArithmeticException(){
        Expectiondtos expectiondtos = new Expectiondtos();
        expectiondtos.setError("Something went wrong");
        expectiondtos.setResolve("Arthemtic Exception");
        ResponseEntity<Expectiondtos> respnse = new ResponseEntity<>(expectiondtos, HttpStatus.BAD_REQUEST);
        return respnse;
    }

    @ExceptionHandler(ArrayIndexOutOfBoundsException.class)
    public ResponseEntity<Expectiondtos> hanndleArrayIndexOutOfBoundsException(){
        Expectiondtos expectiondtos = new Expectiondtos();
        expectiondtos.setError("Something went wrong");
        expectiondtos.setResolve("ArrayIndexOutOfBoundsException");
        ResponseEntity<Expectiondtos> respnse = new ResponseEntity<>(expectiondtos, HttpStatus.BAD_REQUEST);
        return respnse;
    }

//    @ExceptionHandler(Exception.class)
//    public ResponseEntity<Expectiondtos> hanndlegenralException(){
//        Expectiondtos expectiondtos = new Expectiondtos();
//        expectiondtos.setError("Something went wrong");
//        expectiondtos.setResolve("genralException");
//        ResponseEntity<Expectiondtos> respnse = new ResponseEntity<>(expectiondtos, HttpStatus.BAD_REQUEST);
//        return respnse;
//    }

    @ExceptionHandler(Productnotfound.class)
    public ResponseEntity<Expectiondtos> hanndleProductnotfoundException(Productnotfound productnotfound){
        Expectiondtos expectiondtos = new Expectiondtos();
        expectiondtos.setError("Invaild product ID" + " " + productnotfound.getId());
        expectiondtos.setResolve("Productnotfound caught");
        ResponseEntity<Expectiondtos> resopnse = new ResponseEntity<>(expectiondtos, HttpStatus.BAD_REQUEST);
        return resopnse;
    }
}
