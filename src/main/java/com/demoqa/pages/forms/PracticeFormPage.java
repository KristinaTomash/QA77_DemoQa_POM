package com.demoqa.pages.forms;

import com.demoqa.core.BasePage;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PracticeFormPage extends BasePage {
    public PracticeFormPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(id = "firstName")
    WebElement firstName;

    @FindBy(id = "lastName")
    WebElement lastName;

    @FindBy(id = "userEmail")
    WebElement userEmail;

    @FindBy(id = "userNumber")
    WebElement userNumber;

    public PracticeFormPage enterPersonalData(String name, String surName,
                                              String email, String phone) {

        typeWithJS(firstName,name,0,300);
        typeWithJS(lastName,surName,0,100);
        typeWithJS(userEmail,email,0,100);
        typeWithJS(userNumber,phone,0,300);
        return this;
    }
    @FindBy(css = "[for='gender-radio-1']")
WebElement male;
    @FindBy(css = "[for='gender-radio-2']")
WebElement female;
    @FindBy(css = "[for='gender-radio-3']")
WebElement other;

    public PracticeFormPage selectGender(String gender) {
        if (gender.equals("Male")){
            click(male);
        }else if (gender.equals("Female")){
            click(female);
        } else {
            click(other);
        }

        return this;
    }
@FindBy(id = "dateOfBirthInput")
WebElement dateOfBirthInput;
    public PracticeFormPage typeOfDate(String date) {
        click(dateOfBirthInput);

        String os = System.getProperty("os.name");
        System.out.println("My os -->" + os);

        if (os.startsWith("Mac")){
            dateOfBirthInput.sendKeys(Keys.COMMAND,"a");
        }else {
            dateOfBirthInput.sendKeys(Keys.CONTROL,"a");
        }
        dateOfBirthInput.sendKeys(date);
        dateOfBirthInput.sendKeys(Keys.ENTER);

        return this;
    }
        @FindBy(id = "subjectsInput")
        WebElement subjectsInput;
    public PracticeFormPage addSubject(String[] subjects) {
        for (int i = 0; i < subjects.length; i++) {
            if (subjects != null){
                typeWithJS(subjectsInput,subjects[i],0,300);
                subjectsInput.sendKeys(Keys.ENTER);
            }
        }

        return this;
    }
    @FindBy(css = "[for='hobbies-checkbox-1']")
    WebElement sports;
    @FindBy(css = "[for='hobbies-checkbox-2']")
    WebElement reading;
    @FindBy(css = "[for='hobbies-checkbox-3']")
    WebElement music;

    public PracticeFormPage selectHobby(String[] hobbies) {
        for (int i = 0; i < hobbies.length; i++) {
            if (hobbies[i].equals("Sports")){
                clickWithJS(sports);
            }if (hobbies[i].equals("Reading")){
                clickWithJS(reading);
            }if (hobbies[i].equals("Music")){
                clickWithJS(music);
            }
        }
        return this;
    }
        @FindBy(id = "uploadPicture")
        WebElement uploadPicture;

    public PracticeFormPage uploadFile(String path) {
        uploadPicture.sendKeys(path);
        return  this;
    }

    @FindBy(id = "react-select-3-input")
    WebElement stateInput;

    public PracticeFormPage enterState(String state) {
        stateInput.sendKeys(state);
        stateInput.sendKeys(Keys.ENTER);
        return this;
    }
    @FindBy(id = "react-select-4-input")
    WebElement cityInput;

    public PracticeFormPage enterCity(String city) {
        cityInput.sendKeys(city);
        cityInput.sendKeys(Keys.ENTER);
        return this;
    }
    @FindBy(id = "submit")
    WebElement submit;
    public PracticeFormPage submit() {
        clickWithJS(submit);
        return this;
    }
@FindBy(id ="example-modal-sizes-title-lg" )
WebElement modelTitle;
    public PracticeFormPage verifySuccessRegistration(String title) {
        Assertions.assertTrue(shouldHaveText(modelTitle,title,10));
        return this;
    }
}
