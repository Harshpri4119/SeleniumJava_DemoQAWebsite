package org.DemoQA.Pages.ElementsPage;

import org.DemoQA.Pages.DemoQA_HomePage;
import org.DemoQA.Pages.JavaScriptExceutions.JavaScriptUtilities;
import org.openqa.selenium.By;

public class DemoQA_ElementsPage extends DemoQA_HomePage {

    private final By webTableElement = By.xpath("//li[@id='item-3']//span[text()='Web Tables']");
    JavaScriptUtilities javaScriptUtilities = new JavaScriptUtilities();

    public void clickOnWebTableElement(){
        javaScriptUtilities.scrollIntoElements(webTableElement);
        javaScriptUtilities.clickJSElement(webTableElement);
    }
}
