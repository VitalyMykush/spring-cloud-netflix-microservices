package com.example.movieapi;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class SomeController {

    @Value("${some}")
    private String some;


    @GetMapping
    public String getSome(){
        return some;
    }
}
