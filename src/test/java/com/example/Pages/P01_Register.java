package com.example.Pages;

import com.example.StepDefinition.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P01_Register {
    public void homePage(){
        Hooks.driver.navigate().to("https://www.jumia.com.eg/");
    }

public WebElement closePopup(){
    return Hooks.driver.findElement(By.xpath("//body/div[@id='jm']/div[@id='pop']/div[1]/section[1]/button[1]"));
}

public WebElement accountButton(){
    return Hooks.driver.findElement(By.xpath("//*[text()= 'Account']"));
}

public WebElement signinButton(){
    return Hooks.driver.findElement(By.xpath("//*[@rel='nofollow']"));
}

public WebElement emailAddress(){
    return Hooks.driver.findElement(By.id("input_identifierValue"));
}

public WebElement firstContinueButton(){
    return Hooks.driver.findElement(By.xpath("//*[@type='submit']"));
}
    public WebElement secondContinueButton(){
        return Hooks.driver.findElement(By.xpath("//body/div[1]/div[4]/form[1]/div[1]/div[1]/div[5]/div[1]/button[1]/span[3]"));
    }
    public WebElement thirdContinueButton(){
        return Hooks.driver.findElement(By.xpath("//body/div[1]/div[4]/form[1]/div[1]/div[2]/div[5]/div[1]/button[1]/span[3]"));
    }
    public WebElement fourthContinueButton(){
        return Hooks.driver.findElement(By.xpath("//body/div[1]/div[4]/form[1]/div[1]/div[3]/div[1]/div[3]/div[2]/button[1]/span[3]"));
    }
public WebElement passwordField(){
    return Hooks.driver.findElement(By.name("password"));
}

public WebElement confirmPasswordField(){
return Hooks.driver.findElement(By.xpath("//*[@aria-labelledby='confirm-password']"));
}

public WebElement firstNameField(){
    return Hooks.driver.findElement(By.id("input_first_name"));
}

public WebElement lastNameField(){
    return Hooks.driver.findElement(By.id("input_last_name"));
}

public WebElement phoneNumberField(){
    return Hooks.driver.findElement(By.name("phone[number]"));
}

public void selectGender(){
    Hooks.driver.findElement(By.id("gender")).click();
    Hooks.driver.findElement(By.xpath("//*[@data-value= 'M']")).click();
}

public  WebElement selectBirthdate(){
        return Hooks.driver.findElement(By.id("input_birth_date"));
}

public WebElement acceptTC(){
        return Hooks. driver.findElement(By.id("acceptTC"));
}

public void logoutButton(){
    Hooks.driver.findElement(By.xpath("//header/section[1]/div[2]/div[1]/label[1]")).click();
    Hooks.driver.findElement(By.xpath("//button[contains(text(),'Logout')]")).click();
}

}