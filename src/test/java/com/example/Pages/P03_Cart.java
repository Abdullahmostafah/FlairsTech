package com.example.Pages;

import com.example.StepDefinition.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;

public class P03_Cart {
   public void hoverMarket(){
       Actions actions = new Actions(Hooks.driver);
       WebElement superMarket = Hooks.driver.findElement(By.xpath("//body/div[@id='jm']/main[1]/div[1]/div[1]/div[1]/div[1]/a[1]"));
       actions.moveToElement(superMarket).perform();
   }

   public WebElement bakeryTab(){
     return   Hooks.driver.findElement(By.xpath("//a[contains(text(),'Bakery')]"));
   }

public void firstItemtoCart() throws InterruptedException {
    Hooks.driver.findElement(By.xpath("//h3[contains(text(),'TODO Brownies Cake - Pack of 8')]")).click();
    Hooks.driver.findElement(By.xpath("//*[@id=\"add-to-cart\"]/button")).click();
    Thread.sleep(3000);
    Hooks.driver.navigate().back();
}
public void secondItemtoCart() throws InterruptedException {
    Hooks.driver.findElement(By.xpath("//h3[contains(text(),'Brownies - 350 G')]")).click();
    Hooks.driver.findElement(By.xpath("//*[@id=\"add-to-cart\"]/button")).click();
    Thread.sleep(3000);
}

public WebElement cartButton(){
       return Hooks.driver.findElement(By.xpath("/html/body/div[1]/header/section/div[2]/a"));
}

public void itemsAssertion(){
       SoftAssert soft = new SoftAssert();
    String actualTODO = Hooks.driver.findElement(By.xpath("//h3[contains(text(),'TODO Brownies Cake - Pack of 8')]")).getText();
    String expectedTODO = "TODO Brownies Cake - Pack of 8";
    soft.assertEquals(actualTODO,expectedTODO,"TODO not exists");
    System.out.println(actualTODO);

    String actualLino = Hooks.driver.findElement(By.xpath("//h3[contains(text(),'Brownies - 350 G')]")).getText();
    String expectedLino = "Lino Oat Brownies - 350 G";
    System.out.println(actualLino);
    soft.assertEquals(actualLino,expectedLino,"Lino not exists");
    soft.assertAll();
}

public void priceAssertion(){
    SoftAssert soft = new SoftAssert();
    String actualCost = Hooks.driver.findElement(By.xpath("//*[@id=\"jm\"]/main/div/div[2]/div/article/div[1]/p[2]")).getText();
    System.out.println(actualCost);
    String expectedCost = "EGP 108.95";
    soft.assertEquals(actualCost,expectedCost,"Actual cost not equals expected cost");
    soft.assertAll();
}


}
