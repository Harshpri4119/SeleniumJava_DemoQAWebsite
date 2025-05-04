package org.DemoQA.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class DemoQA_BasePage {
    public static WebDriver driver;

    public void setDriver(WebDriver driver){
        DemoQA_BasePage.driver = driver;
    }

    public WebElement findElement(By locator){
        return driver.findElement(locator);
    }

    public void clickElement(By locator){
        findElement(locator).click();
    }

    public void setText(By locator, String text){
        findElement(locator).clear();
        findElement(locator).sendKeys(text);
    }

    public void delay(int milliseconds){
        try{
            Thread.sleep(milliseconds);
        }catch (Exception exception){
            exception.printStackTrace();
        }
    }

    public void wait(int seconds){
        try {
            driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
        }catch (Exception e){
            e.printStackTrace();
        }
    }


}
