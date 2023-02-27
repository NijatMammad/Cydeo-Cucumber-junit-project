package com.cydeo.step_definitions;

import io.cucumber.java.en.Then;

import java.util.List;

public class DataTables2_StepDefinitions {


    public class DataTables_StepDefinitions {
        @Then("user should see below list")
        public void user_should_see_below_list(List<String> petsILove){
            System.out.println("petsILove = " + petsILove);

            System.out.println(petsILove.get(1));
        }



    }
}
