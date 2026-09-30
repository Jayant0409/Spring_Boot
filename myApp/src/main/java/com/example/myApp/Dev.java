package com.example.myApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Dev {
    
      @Autowired
     @Qualifier(("desktop"))        //  Now desktop object/bean is injected
      public Computer com;

    public void build(){
  
         com.compile();
        System.out.println("Working on awesome Project");
    }
    
}
