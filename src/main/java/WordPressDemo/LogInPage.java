package WordPressDemo;

import org.openqa.selenium.By;

import static WordPressDemo.BasePage.driver;

/**
 * Created by Dell on 25/04/2017.
 */
public class LogInPage extends Utils {


    public void userShouldAbleToLoginWithValidCredentials(String Email, String Password){
        //Fill in login Details
        typeText(By.id("f509"),Email);
        typeText(By.id("f510"),Password);
        //Click on login
        clickOnElement(By.xpath("//button[@id='f512']"));
        driver.navigate().refresh();

    }

    public void userShouldNavigateToLostPassword(){

    }
}
