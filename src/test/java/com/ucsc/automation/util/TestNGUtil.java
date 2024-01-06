package com.ucsc.automation.util;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

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

        /**
         * Make page load timeout as 5 seconds.
         * So, page should load within 5 seconds.
         */
//        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

//        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(200));
    }

    @AfterTest
    public void afterTest(){
        driver.close();//close the current tab of web driver
        driver.quit();// close the whole browser
    }
}
