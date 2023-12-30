package com.ucsc.automation.testng;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ParallelEx {

    long startTime = 0;

    @BeforeTest
    public void getStartTime(){
        startTime = System.currentTimeMillis();
    }

    @AfterTest
    public void calcExecutionTime(){
        System.out.println("Execution time in " +
                "milliseconds is : " +
                (System.currentTimeMillis()
                        - startTime));
    }

    @Test
    public void method1() throws InterruptedException {
        for(int i=0; i<5; i++){
            Thread.sleep(4000);
            System.out.println("I'm from method1 with iterator number : " + i);
        }
    }

    @Test
    public void method2() throws InterruptedException {
        for(int i=0; i<5; i++){
            Thread.sleep(1000);
            System.out.println("I'm from method2 with iterator number : " + i);
        }
    }

    @Test
    public void method3() throws InterruptedException {
        for(int i=0; i<5; i++){
            Thread.sleep(3000);
            System.out.println("I'm from method3 with iterator number : " + i);
        }
    }
}
