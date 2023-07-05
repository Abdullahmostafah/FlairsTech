package com.example.StepDefinition;

import com.example.Pages.P03_Cart;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class D03_cartStepDef {

    P03_Cart cart = new P03_Cart();
    @And("User hovers to SuperMarket")
    public void User_hovers_to_SuperMarket(){
    cart.hoverMarket();
    }

    @And ("User selects Bakery")
    public void User_selects_Bakery(){
        cart.bakeryTab().click();
    }

    @When("User adds first item to the cart \"TODO\"")
    public void User_adds_first_item_to_the_cart() throws InterruptedException {
         cart.firstItemtoCart();
    }


    @And ("User adds second item to the cart \"Lino\"")
    public void User_adds_second_item_to_the_cart() throws InterruptedException {
    cart.secondItemtoCart();
    }

    @And ("User goes to Cart page")
    public void User_goes_to_Cart_page(){
        cart.cartButton().click();
    }

    @Then("User checks for items availability")
    public void User_checks_for_items_availability(){
        cart.itemsAssertion();
    }
    @And ("User check for price accuracy")
    public void User_check_for_price_accuracy (){
        cart.priceAssertion();
    }


}
