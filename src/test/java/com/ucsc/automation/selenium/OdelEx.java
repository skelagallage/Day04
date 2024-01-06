package com.ucsc.automation.selenium;

import com.ucsc.automation.util.TestNGUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.*;
import org.testng.annotations.Test;

import java.time.Duration;

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

        driver.findElement(By.xpath("//a[text()='Caps & Hats' and contains(@href, '/women')]")).click();

        /**
         * Below two lines of code is waiting 2 seconds to
         * presence of element, before firing the next execution line.
         */
        WebDriverWait explicitWait = new WebDriverWait(driver, Duration.ofSeconds(2));
        explicitWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@id='brand_filter_button']")));

        driver.findElement(By.xpath("//button[@id='brand_filter_button']")).click();

        /**
         * You can customize fluent wait.
         * document : https://www.selenium.dev/selenium/docs/api/java/org/openqa/selenium/support/ui/FluentWait.html
         */
        Wait fluentWait = new FluentWait(driver)
                .withTimeout(Duration.ofSeconds(5))
                .pollingEvery(Duration.ofMillis(500))
                        .ignoring(NoSuchElementException.class);
        fluentWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[text()='ODEL']")));
        driver.findElement(By.xpath("//label[text()='ODEL']")).click();

        Thread.sleep(3000);
    }

}
