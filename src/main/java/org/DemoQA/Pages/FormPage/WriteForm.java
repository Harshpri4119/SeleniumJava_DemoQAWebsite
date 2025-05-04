package org.DemoQA.Pages.FormPage;

import org.openqa.selenium.By;

public class WriteForm extends DemoQA_FormPage  {


    private final By firstName = By.xpath("//input[@id='firstName']");
    private final By lastName = By.xpath("//input[@id='lastName']");
    private final By email = By.xpath("//input[@id='userEmail']");
    private final By femaleGender = By.xpath("//input[@id='gender-radio-2']");
    private final By maleGender = By.xpath("//input[@id='gender-radio-1']");
    private final By otherGender = By.xpath("//input[@id='gender-radio-3']");
    private final By mobileNumber = By.xpath("//input[@id='userNumber']");
    private final By dateOfBirth = By.xpath("//input[@id='dateOfBirthInput']");
    private final By subjects = By.xpath("//input[@id='subjectsInput']");
    private final By sportHobby = By.xpath("//input[@id='hobbies-checkbox-1']");
    private final By readingHobby = By.xpath("//input[@id='hobbies-checkbox-2']");
    private final By musicHobby = By.xpath("//input[@id='hobbies-checkbox-3']");
    private final By currentAddress = By.xpath("//textarea[@id='currentAddress']");
    private final By state = By.xpath("//input[@id='react-select-3-input']");
    private final By city = By.xpath("//input[@id='react-select-4-input']");

    public void setFirstName(String firstNameText){
        setText(firstName, firstNameText);
    }

    public void setLastName(String lastNameText){
        setText(lastName, lastNameText);
    }

    public void setEmail(String emailText){
        setText(email, emailText);
    }

    public void femaleGender(){
        javaScriptUtilities.scrollIntoElements(femaleGender);
        javaScriptUtilities.clickJSElement(femaleGender);
    }

    public void maleGender(){
        javaScriptUtilities.scrollIntoElements(maleGender);
        javaScriptUtilities.clickJSElement(maleGender);
    }

    public void otherGender(){
        javaScriptUtilities.scrollIntoElements(otherGender);
        javaScriptUtilities.clickJSElement(otherGender);
    }

    public void setMobileNumber(String phoneNumber){
        setText(mobileNumber, phoneNumber);
    }

    public void setDateOfBirth(String dateOfBirthText){
        setText(dateOfBirth, dateOfBirthText);
    }

    public void setSubjects(String subjectsText){
        setText(subjects, subjectsText);
    }

    public void checkSportHobby(){

        if(!findElement(sportHobby).isSelected()){
            javaScriptUtilities.scrollIntoElements(sportHobby);
            javaScriptUtilities.clickJSElement(sportHobby);

        }

    }

    public void checkReadingHobby(){

        if(!findElement(readingHobby).isSelected()){
            javaScriptUtilities.scrollIntoElements(readingHobby);
            javaScriptUtilities.clickJSElement(readingHobby);
        }

    }

    public void checkMusicHobby(){

        if(!findElement(musicHobby).isSelected()){
            javaScriptUtilities.scrollIntoElements(musicHobby);
            javaScriptUtilities.clickJSElement(musicHobby);
        }
    }

    public void unCheckSportHobby(){

        if(findElement(sportHobby).isSelected()){
            javaScriptUtilities.scrollIntoElements(sportHobby);
            javaScriptUtilities.clickJSElement(sportHobby);
        }
    }

    public void unCheckReadingHobby(){

        if(findElement(readingHobby).isSelected()){
            javaScriptUtilities.scrollIntoElements(readingHobby);
            javaScriptUtilities.clickJSElement(readingHobby);
        }

    }

    public void unCheckMusicHobby(){

        if(findElement(musicHobby).isSelected()){
            javaScriptUtilities.scrollIntoElements(musicHobby);
            javaScriptUtilities.clickJSElement(musicHobby);
        }
    }

    public void setCurrentAddress(String currentAddressText){
        setText(currentAddress, currentAddressText);
    }

    public void setState(String stateText){
        setText(state, stateText);
    }

    public void setCity(String cityText){
        setText(city, cityText);
    }

    public boolean isSportsCheckBoxSelected(){
        return findElement(sportHobby).isSelected();
    }

    public boolean isReadingCheckBoxSelected(){
        return findElement(readingHobby).isSelected();
    }

    public boolean isMusicCheckBoxSelected(){
        return findElement(musicHobby).isSelected();
    }

    public boolean isMaleGenderSelected(){
        return findElement(maleGender).isSelected();
    }

    public boolean isFemaleGenderSelected(){
        return findElement(femaleGender).isSelected();
    }

    public boolean isOtherGenderSelected(){
        return findElement(otherGender).isSelected();
    }
}