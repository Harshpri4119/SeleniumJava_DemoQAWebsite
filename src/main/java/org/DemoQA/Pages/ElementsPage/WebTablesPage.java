package org.DemoQA.Pages.ElementsPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class WebTablesPage extends DemoQA_ElementsPage {



    public void clickOnEditUser(String email){
        By edit = By.xpath("//div[text()='"+ email +"']//following::span[@title='Edit']");

        javaScriptUtilities.scrollIntoElements(edit);
        javaScriptUtilities.clickJSElement(edit);

    }

    public void clickOnDeleteUser(String email){
        By delete = By.xpath("//div[text()='"+ email +"']//following::span[@title='Delete']");

        javaScriptUtilities.scrollIntoElements(delete);
        javaScriptUtilities.clickJSElement(delete);

    }


    public void clickOnAddUser(){

    }

    public void clickOnSearch(String text){

    }
}
