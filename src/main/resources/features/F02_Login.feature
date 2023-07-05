@smoke
Feature: F02_Login | users could use login functionality to use their accounts
  Background: user has an account

  Scenario: User could login with valid data successfully
    Given User goes to home page
    And User clicks on Account
    And User clicks on sign in
    When User enters email address "abdullah9216@hotmail.com"
    And User clicks on first continue
    And User fills password "@Bdullah1234"
    And User clicks on fifth continue
    Then User goes to home page

