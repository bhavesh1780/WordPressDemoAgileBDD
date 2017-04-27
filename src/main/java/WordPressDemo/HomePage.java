package WordPressDemo;


import org.openqa.selenium.By;

import static WordPressDemo.BasePage.driver;

/**
 * Created by Dell on 24/04/2017.
 */
public class HomePage extends Utils{

    public void userIsOnHomePage(){
        driver.get("http://wordpress.demo.joobi.co");

    }

    public void userShouldClickOnSignIn(){
        //Click on signin on Homepage
        clickOnElement(By.xpath("//div[@class='stdWidget wdgt_124']/a"));


    }
}
