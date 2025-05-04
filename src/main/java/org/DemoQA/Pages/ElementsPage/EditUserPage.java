package org.DemoQA.Pages.ElementsPage;

import org.openqa.selenium.By;

public class EditUserPage extends WebTablesPage{

    private final By editID = By.xpath("//input[@id='age']");
    private final By editSalary = By.xpath("//input[@id='salary']");
    private final By editFirstName = By.xpath("//input[@id='firstName']");
    private final By editLastName = By.xpath("//input[@id='lastName']");
    private final By editEmail = By.xpath("//input[@id='userEmail']");
    private final By editDepartment = By.xpath("//input[@id='department']");
    private final By submitButton = By.xpath("//button[@id='submit']");

    public void setEditID(String idEdit){
        setText(editID, idEdit);
    }

    public void setEditSalary(String salaryEdit){
        setText(editSalary, salaryEdit);
    }

    public void setEditFirstName(String firstNameEdit){
        setText(editFirstName, firstNameEdit);
    }

    public void setEditLastName(String lastNameEdit){
        setText(editLastName, lastNameEdit);
    }

    public void setEditEmail(String emailEdit){
        setText(editEmail, emailEdit);
    }

    public void setEditDepartment(String departmentEdit){
        setText(editDepartment, departmentEdit);
    }

    public void clickOnSubmitButton(){
        javaScriptUtilities.scrollIntoElements(submitButton);
        javaScriptUtilities.clickJSElement(submitButton);
    }
}
