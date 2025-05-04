package org.DemoQA.Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class ElementPageTest extends BaseTest{

    String editID = "19";
    String editEmail = "Kanakagirih@gmail.com";
    String firstName = "Harsha Vardhan";

    String deleteUser = editEmail;


    @Test (priority = 1)
    public void clickOnWebTableEdit_Test(){
        homePage.goToElementsPage();
        elementsPage.clickOnWebTableElement();

    }

    @Test (priority = 2)
    public void editUser_Test()  {
//        homePage.goToElementsPage();
//        elementsPage.clickOnWebTableElement();

        webTablesPage.clickOnEditUser("alden@example.com");
        editUserPage.setEditID(editID);
        editUserPage.setEditEmail(editEmail);
        editUserPage.clickOnSubmitButton();

        List<WebElement> elements = driver.findElements(By.xpath("//div[@role='gridcell']"));
        String printElements;

//        for(WebElement element : elements){
//            printElements = element.getText();
//
//            Assert.assertTrue(printElements.contains(editEmail), editEmail + " is Displayed");
//
//        }

    }

    @Test (priority = 3)
    public void deleteUser_Test() {

        webTablesPage.wait(5000);

        webTablesPage.clickOnDeleteUser(deleteUser);

        List<WebElement> elements = driver.findElements(By.xpath("//div[@role='gridcell']"));
        String printElements;

        for(WebElement element : elements){
            printElements = element.getText();

            Assert.assertFalse(printElements.contains(deleteUser), deleteUser + " is Deleted");

        }

    }
}
