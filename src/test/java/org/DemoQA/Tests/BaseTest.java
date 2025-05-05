package org.DemoQA.Tests;

import org.DemoQA.Pages.*;
import org.DemoQA.Pages.ElementsPage.DemoQA_ElementsPage;
import org.DemoQA.Pages.ElementsPage.EditUserPage;
import org.DemoQA.Pages.ElementsPage.WebTablesPage;
import org.DemoQA.Pages.FormPage.DemoQA_FormPage;
import org.DemoQA.Pages.FormPage.WriteForm;
import org.DemoQA.Pages.JavaScriptExceutions.JavaScriptUtilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {

    protected WebDriver driver;
    protected DemoQA_BasePage basePage;
    protected DemoQA_HomePage homePage;
    protected DemoQA_FormPage formPage;
    protected JavaScriptUtilities javaScriptUtilities;
    protected DemoQA_ElementsPage elementsPage;
    protected WebTablesPage webTablesPage;
    protected WriteForm writeForm;
    protected EditUserPage editUserPage;
    protected String url = "https://demoqa.com/";

    @BeforeClass
    public void setUpDriver(){
        basePage = new DemoQA_BasePage();
        homePage = new DemoQA_HomePage();
        formPage = new DemoQA_FormPage();
        writeForm = new WriteForm();
        elementsPage = new DemoQA_ElementsPage();
        webTablesPage = new WebTablesPage();
        editUserPage = new EditUserPage();
        javaScriptUtilities = new JavaScriptUtilities();


        driver = new ChromeDriver();

        basePage.setDriver(driver);
        javaScriptUtilities.setUtilityDriver(driver);
        driver.manage().window().maximize();
        driver.get(url);
    }



    @AfterClass
    public void tearDown(){
        basePage.delay(5000); // reduced the delay from 10s to 5s
        driver.quit();
    }
}
