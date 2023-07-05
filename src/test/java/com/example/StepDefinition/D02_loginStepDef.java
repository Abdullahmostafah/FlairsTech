package com.example.StepDefinition;

import com.example.Pages.P02_Login;
import io.cucumber.java.en.And;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class D02_loginStepDef {

    P02_Login login = new P02_Login();
    @And("User clicks on fifth continue")
    public void User_clicks_on_fifth_continue(){
        login.fifthContinueButton().click();
    }
}
