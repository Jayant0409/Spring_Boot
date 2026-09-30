package com.example.DemoApp;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;



  @RestController
public class HelloController {

     @GetMapping("/")
    public static String sayhello(){
        return "Hello, how are you";
   
    }
    
}
