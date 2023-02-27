package com.cydeo.step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class Hooks {
    @Before

    public void setupMethode(){
        System.out.println("---> @Before: running before each scenario");
    }
    @After
    public void teardownMethod(){
        System.out.println("---> @After: running after each scenario");
    }
    @BeforeStep
    public void setUpStep(){
        System.out.println("---> @BeforeStep: running before each step");
    }
    @AfterStep
    public void teardownStep(){
       System.out.println("---> @AfterStep: running after each step");
    }

}
