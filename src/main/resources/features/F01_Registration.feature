@smoke
Feature: F01_Registration | users could register with new accounts

  Scenario: User could register with valid data successfully
    Given User goes to home page
    And User closes popup
    And User clicks on Account
    And User clicks on sign in
    When User enters email address "abdullah9216@hotmail.com"
    And User clicks on first continue
    And User fills password "@Bdullah1234"
    And User fills confirm password "@Bdullah1234"
    And User clicks on second continue
    And User enters first name "Abdullah" and last name "Mostafa" and "01223344556"
    And User clicks on third continue
    And User selects gender "M"
    And User selects birthdate "02-27-1992"
    And User accepts terms and conditions
    And User clicks on fourth continue
    Then User logout from his account