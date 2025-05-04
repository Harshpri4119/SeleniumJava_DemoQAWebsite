package org.DemoQA.Pages;


import org.DemoQA.Pages.JavaScriptExceutions.JavaScriptUtilities;
import org.openqa.selenium.By;

public class DemoQA_HomePage extends DemoQA_BasePage{

    private final By formPage = By.xpath("//div[@class='category-cards']//h5[text()='Forms']");
    private final By widgetPage = By.xpath("//div[@class='category-cards']//h5[text()='Widgets']");
    private final By elementPage = By.xpath(("//div[@class='category-cards']//h5[text()='Elements']"));

    JavaScriptUtilities javaScriptUtilities = new JavaScriptUtilities();

    public void goToFormPage(){
        javaScriptUtilities.scrollIntoElements(formPage);
        clickElement(formPage);
    }

    public void gotToWidgetPage(){
        javaScriptUtilities.scrollIntoElements(widgetPage);
        clickElement(widgetPage);
    }

    public void goToElementsPage(){
        javaScriptUtilities.scrollIntoElements(elementPage);
        javaScriptUtilities.clickJSElement(elementPage);
    }




}
