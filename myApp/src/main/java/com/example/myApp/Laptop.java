package com.example.myApp;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component 
@Primary          // this make Laptop object as a default for the Dev class to use it
public class Laptop implements Computer {

    @Override
    public  void compile(){
        System.out.println("Compiling 404 bugs");
    }
}
