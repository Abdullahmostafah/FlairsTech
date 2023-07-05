package com.example.StepDefinition;

import com.example.Pages.P01_Register;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class D01_registerStepDef {
    P01_Register register = new P01_Register();


    @Given("User goes to home page")
    public void User_goes_to_homepage(){
         register.homePage();
    }
    @And ("User closes popup")
    public void User_closes_popup()
    {
        register.closePopup().click();
    }

    @And("User clicks on Account")
    public void User_clicks_on_Account(){
        register.accountButton().click();
    }

    @And("User clicks on sign in")
    public void User_clicks_on_sign_in(){
        register.signinButton().click();
    }

    @When("^User enters email address \"(.*)\"$")
    public void User_enters_email_address(String email){
    register.emailAddress().sendKeys(email);
    }

    @And ("User clicks on first continue")
    public void User_clicks_on_first_continue() throws InterruptedException {
        Thread.sleep(1000);
        register.firstContinueButton().click();
    }

    @And ("^User fills password \"(.*)\"$")
    public void User_fills_password_field (String password){
        register.passwordField().sendKeys(password);
    }

    @And ("^User fills confirm password \"(.*)\"$")
    public void User_fills_confirm_password_field(String confirmPassword) throws InterruptedException {
        register.confirmPasswordField().sendKeys(confirmPassword);
        Thread.sleep(1500);
    }

    @And ("^User enters first name \"(.*)\" and last name \"(.*)\" and \"(.*)\"$")
    public void User_enters_first_name_and_last_name(String firstName, String lastName, String phoneNumber){
    register.firstNameField().sendKeys(firstName);
    register.lastNameField().sendKeys(lastName);
    register.phoneNumberField().sendKeys(phoneNumber);
    }

    @And ("User selects gender \"M\"")
    public void User_selects_gender(){
        register.selectGender();
    }

    @And ("^User selects birthdate \"(.*)\"$")
    public void user_selects_birthdate(String birthDate){
        register.selectBirthdate().sendKeys(birthDate);
    }

    @And ("User accepts terms and conditions")
    public void User_accepts_terms_and_conditions(){
        register.acceptTC().click();
    }


    @Then ("User logout from his account")
    public void User_logout_from_his_account(){
        register.logoutButton();
    }

    @And ("User clicks on second continue")
    public void User_clicks_on_second_continue () throws InterruptedException {
        Thread.sleep(500);
        register.secondContinueButton().click();
    }
@And ("User clicks on third continue")
    public void User_clicks_on_third_continue(){
        register.thirdContinueButton().click();
    }
    @And ("User clicks on fourth continue")
    public void User_clicks_on_fourth_continue(){
        register.fourthContinueButton().click();
    }
}
