package WordPressDemo;

import org.openqa.selenium.By;

/**
 * Created by Dell on 25/04/2017.
 */
public class RegistrationPage extends Utils {

    public void userShouldAbleToRegisterSuccessfully(){

        //Fill in Required Details to Register
        typeText(By.id("f527"),"Test");
        typeText(By.id("f531"),"Test123");
        String email = "lotus7143"+dateStamp()+"@gmail.com";
        typeText(By.id("f532"),email);
        System.out.println("email");
        typeText(By.id("f533"),"Test1234");
        typeText(By.id("f534"),"Test1234");
        //Click on Register Button
        clickOnElement(By.id("f543"));

    }
}
