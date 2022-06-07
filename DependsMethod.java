package com.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsMethod {
    @Test(priority=1)
    public void createUser(){
        System.out.println("createUser...user created successfully");
        Assert.fail();
    }
    @Test(priority=3, dependsOnMethods="createUser")
    public void deleteUser(){
        System.out.println("deleteUser...");
    }
}
