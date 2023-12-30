package com.ucsc.automation.testng;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParamsEx {

    @Test
    @Parameters({"fname", "age"})
    public void studentDetail(@Optional("Kaushalya")
                                  String fname,
                              @Optional("35") int age){
        System.out.println("Name is "+ fname +
                " and age is " + age);
    }
}
