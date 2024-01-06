package com.ucsc.automation.selenium;

import com.ucsc.automation.util.TestNGUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class OdelEx extends TestNGUtil {

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
    public void searchCapsAndHatsForWomen() throws InterruptedException {

        driver.get("https://odel.lk/home");

//        Actions actions = new Actions(driver);
//        WebElement webElement = driver.findElement(By.xpath("//div/a[text()='WOMEN']"));
//        actions.moveToElement(webElement).perform();
        new Actions(driver).moveToElement(driver.findElement(By.xpath("//div/a[text()='WOMEN']"))).perform();
        Thread.sleep(3000);

        driver.findElement(By.xpath("//a[text()='Caps & Hats' and contains(@href, '/women')]")).click();
        driver.findElement(By.xpath("//button[@id='brand_filter_button']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//label[text()='ODEL']")).click();
        Thread.sleep(3000);
    }

}
