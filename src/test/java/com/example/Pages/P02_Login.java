package com.example.Pages;

import com.example.StepDefinition.Hooks;
import io.cucumber.java.en.And;
import com.example.StepDefinition.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P02_Login {
    public WebElement fifthContinueButton(){
        return Hooks.driver.findElement(By.xpath("//body/div[1]/div[4]/form[1]/div[1]/div[4]/div[2]/button[1]/span[3]"));
    }

}
