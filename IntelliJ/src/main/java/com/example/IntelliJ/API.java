package com.example.IntelliJ;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class API {

    @GetMapping("abc")
    public String sayhello(){
        return "HEllo baby" ;
    }

}
