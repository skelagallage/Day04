package com.ucsc.automation.util;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class TestNGUtil {

    protected static WebDriver driver;

    @BeforeTest
    public void beforeTest(){
        //        WebDriver driver = new ChromeDriver();
        ChromeOptions options = new ChromeOptions();
        /**
         * If you need to run the test using headless mode
         * uncomment below line
         */
//        options.addArguments("--headless=new");
        driver = WebDriverManager.chromedriver().capabilities(options).create();
        driver.manage().window().maximize();
    }

    @AfterTest
    public void afterTest(){
        driver.close();//close the current tab of web driver
        driver.quit();// close the whole browser
    }
}
