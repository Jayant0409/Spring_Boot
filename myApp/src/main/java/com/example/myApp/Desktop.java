package com.example.myApp;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary         // this make desktop object as a default for the Dev class to use it
public class Desktop implements Computer {

    public void compile(){
        System.out.println("this is from Desktop class");
    }


    
}
