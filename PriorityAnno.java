package com.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PriorityAnno {
    //By default methods will execute in alphabetical order
    //Multiple methods with same priority will execute by default in alphabetical order

    @Test(priority = 1)
    public void signup(){
        System.out.println("signup method");
    }
    @Test(priority = 1)
    public void quit(){
        System.out.println("quit method");
    }
    @Test(priority = 2)
    public void login(){
        System.out.println("login method");
    }
    @Test(priority = 3)
    public void abc(){
        System.out.println("abc method");
    }
    @Test(priority = 4,invocationCount = 3)
    public void multipleTimes(){
        System.out.println("multiple times method");
    }
    @Test(priority = 5, dependsOnMethods = "create")
    public void post(){
        System.out.println("post method");
    }
    @Test(priority = 6)
    public void create(){
        System.out.println("create method");
        //Assert.fail();
    }
    @Test(enabled = false)
    public void delete(){
        System.out.println("delete method");
    }
}
