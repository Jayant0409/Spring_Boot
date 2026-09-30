package com.example;

public class Dev {
    
    // private Laptop laptop;


    // private int age;
    

  //    getter Injection 
  // public int getAge() {
  //   return age;
  // }


  //   Constructor Injection     ->    we pass the values in these setter from the spring.xml file     using constructor-args tag
  //   public Dev(Laptop laptop) {
  //   this.laptop = laptop;
  // }

  //     public Dev(int age) {
  //   this.age= age;
  // }

    //  setter Injection     ->    we pass the values in these setter from the spring.xml file using property tag
    // public void setAge(int age) {
    //   this.age = age;
    // }
    
       //  Constructor injenction 
  // public Dev(){
  //   System.out.println("Constructor of Dev class");
  // }


    // public void setLaptop(Laptop laptop) {
    //     this.laptop = laptop;
    //   }

    //   public Laptop getLaptop() {
    //   return laptop;
    // }

    
    
      public void build(){
          System.out.println("Working on awesome Project in Dev ");
          // laptop.compile();
          com.compile();

      }

          private Computer com;

      public Computer getCom() {
        return com;
      }

      public void setCom(Computer com) {
        this.com = com;
      }
  }
