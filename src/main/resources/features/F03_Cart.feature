@smoke
Feature: F03_Cart| Logged user browsing super market and add items to the cart
  Background: User logged in successfully using valid credentials and want to shopping
  Scenario: User could select items from super market and add it to the cart

    Given User goes to home page
    And User hovers to SuperMarket
    And User selects Bakery
    When User adds first item to the cart "TODO"
    And User adds second item to the cart "Lino"
    And User goes to Cart page
    Then User checks for items availability
    And User check for price accuracy