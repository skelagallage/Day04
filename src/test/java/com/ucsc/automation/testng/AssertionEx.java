package com.ucsc.automation.testng;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionEx {

    @Test
    public void softAssertion(){
        SoftAssert softAssert = new SoftAssert();
        System.out.println("Soft A");
        System.out.println("Soft B");
        softAssert.assertEquals("Sanath", "Kaushalya");
        System.out.println("Soft C");
        softAssert.assertAll();
    }

    @Test
    public void hardAssertion(){
        System.out.println("Hard A");
        System.out.println("Hard B");
        Assert.assertTrue(false);
        System.out.println("Hard C");
    }
}
