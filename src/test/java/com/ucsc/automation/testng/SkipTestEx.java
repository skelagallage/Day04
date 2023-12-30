package com.ucsc.automation.testng;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class SkipTestEx {

    @Test(enabled = false)
    public void method1() {
        System.out.println("I'm from method1");
    }

    @Test
    public void method2() {
        System.out.println("I'm from method2 - A");
        if (false)
            throw new SkipException("Reason1");
        System.out.println("I'm from method2 - B");
        if (true)
            throw new SkipException("Reason2");
        System.out.println("I'm from method2 - C");
    }
}
