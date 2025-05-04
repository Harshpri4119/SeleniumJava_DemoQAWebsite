package org.DemoQA.Pages.FormPage;

import org.DemoQA.Pages.DemoQA_HomePage;
import org.DemoQA.Pages.JavaScriptExceutions.JavaScriptUtilities;
import org.openqa.selenium.By;

public class DemoQA_FormPage extends DemoQA_HomePage {

    private final By practiceFormMenuItem = By.xpath("//li[@id='item-0']//span[text()='Practice Form']");
    JavaScriptUtilities javaScriptUtilities = new JavaScriptUtilities();

    public void clickOnWriteForm(){
        javaScriptUtilities.scrollIntoElements(practiceFormMenuItem);
        javaScriptUtilities.clickJSElement(practiceFormMenuItem);
    }
}
