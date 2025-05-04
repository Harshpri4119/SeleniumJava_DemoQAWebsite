package org.DemoQA.Tests;

import org.testng.annotations.Test;

public class HomePageTest extends BaseTest {

    @Test
    public void formPage(){
        homePage.goToFormPage();
    }

    @Test
    public void widgetPage(){
        homePage.gotToWidgetPage();
    }

    @Test
    public void elementPage(){
        homePage.goToElementsPage();
    }
}
