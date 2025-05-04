package org.DemoQA.Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FormPageTest extends BaseTest {

    String firstName = "Harsha";
    String lastName = "Vardhan";
    String email = "Kanakagirih@gmail.com";
    String mobileNumber = "9182203017";
    String dateOfBirth = "16 Dec 1997";
    String subjects = "English";
    String currentAddress = "Hyderabad";
    String state = "NCR";
    String city = "Delhi";


    @Test
    public void writeForm(){
        homePage.goToFormPage();
        formPage.clickOnWriteForm();
        writeForm.setFirstName(firstName);
        writeForm.setLastName(lastName);
        writeForm.setEmail(email);
        writeForm.maleGender();
//        writeForm.setMobileNumber(mobileNumber);
//        writeForm.setDateOfBirth(dateOfBirth);
//        writeForm.setSubjects(subjects);
        writeForm.checkSportHobby();
        writeForm.checkReadingHobby();
        writeForm.checkMusicHobby();
        boolean readingCheckboxSelected = writeForm.isReadingCheckBoxSelected();
        Assert.assertTrue(readingCheckboxSelected, "Yes Reading CheckBox is Selected");

//        writeForm.setCurrentAddress(currentAddress);
//        writeForm.setState(state);
//        writeForm.setCity(city);
    }
}
