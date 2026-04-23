package com.demoqa.tests;

import com.demoqa.core.TestBase;
import com.demoqa.pages.HomePage;
import com.demoqa.pages.SidePanel;
import com.demoqa.pages.forms.PracticeFormPage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PracticeFormTests extends TestBase {

    PracticeFormPage practiceForm;

    @BeforeEach
    public void precondition(){
        new HomePage(driver).getForms();
        new SidePanel(driver).getPracticeForm();
       practiceForm = new PracticeFormPage(driver);
    }
    @Test
    public void createAccountPositiveTest(){
        practiceForm.enterPersonalData("Jon","Morgan","morgan@gmail.com","1234567890")
                .selectGender("Male")
                .typeOfDate("16 Aug 1987")
                .addSubject(new String[]{"Maths","English"})
               .selectHobby(new String[]{"Sports","Music"})
               .uploadFile("/Users/kristinatomas/Tools/1.png")
               .enterState("NCR")
                .enterCity("Delhi")
               .submit()
                .verifySuccessRegistration("Thanks for submitting the form")
                ;
    }

}
