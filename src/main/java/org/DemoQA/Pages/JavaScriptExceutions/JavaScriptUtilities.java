package org.DemoQA.Pages.JavaScriptExceutions;

import org.DemoQA.Pages.DemoQA_BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScriptUtilities extends DemoQA_BasePage {

    public void setUtilityDriver(WebDriver driver ){
        driver = DemoQA_BasePage.driver;
    }

    public void scrollIntoElements(By locator){
        WebElement element = driver.findElement(locator);
        String jsScript = "arguments[0].scrollIntoView();";

        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript(jsScript, element);

    }

    public void clickJSElement(By locator){

        WebElement element = driver.findElement(locator);
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        javascriptExecutor.executeScript("arguments[0].click();", element);
    }
}
