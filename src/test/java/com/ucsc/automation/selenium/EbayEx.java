package com.ucsc.automation.selenium;

import com.ucsc.automation.util.TestNGUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class EbayEx extends TestNGUtil {
//    WebDriver driver;
//
//    @BeforeMethod
//    public void beforeTest(){
//        //        WebDriver driver = new ChromeDriver();
//        driver = WebDriverManager.chromedriver().create();
//        driver.manage().window().maximize();
//    }
//
//    @AfterMethod
//    public void afterTest(){
//        driver.close();//close the current tab of web driver
//        driver.quit();// close the whole browser
//    }

    @Test
    public void searchMobilePhones() throws InterruptedException {

        driver.get("https://www.ebay.com/");
        driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("mobile phone");
        new Select(driver.findElement(By.xpath("//select[@id='gh-cat']"))).selectByVisibleText("Cell Phones & Accessories");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@id='gh-btn']")).click();
    }
}
