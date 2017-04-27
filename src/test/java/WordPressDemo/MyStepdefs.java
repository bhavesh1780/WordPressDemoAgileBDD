package WordPressDemo;

import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;

/**
 * Created by Dell on 25/04/2017.
 */
public class MyStepdefs extends BasePage {

    HomePage homePage = new HomePage();
    RegistrationPage registrationPage = new RegistrationPage();
    LogInPage logInPage = new LogInPage();


    @Given("^User is on home page wordpress$")
    public void userIsOnHomePageWordpress()  {
        homePage.userIsOnHomePage();
        Assert.assertTrue(driver.findElement(By.xpath("//h3[contains(.,'New Features')]")).getText().contains("NEW FEATURES"), "User is not on WordPress Homepage yet");

    }

    @When("^User click on Signin$")
    public void User_click_on_Signin() {
        homePage.userShouldClickOnSignIn();
        Assert.assertTrue(driver.findElement(By.linkText("Create an account!")).getText().contains("Create an account!"),"User is not Navigated to My Account PAge");

    }

    @When("^User types in valid \"([^\"]*)\" and \"([^\"]*)\"$")
    public void User_types_in_valid_and(String Email, String Password) {
        logInPage.userShouldAbleToLoginWithValidCredentials(Email,Password);


    }

    @When("^Click on login$")
    public void Click_on_login() {

    }

    @Then("^User should able to login successfully and use all functionality$")
    public void User_should_able_to_login_successfully_and_use_all_functionality() {

    }




//    @Given("^User is on Homepage$")
//    public void userIsOnHomepage() {
//        homePage.userIsOnHomePage();
//
//    }
//
//    @When("^User navigate to My Account$")
//    public void User_navigate_to_My_Account() {
//        homePage.userShouldNavigateToMyAccount();
//
//    }
//
//    @When("^Select Create an account$")
//    public void Select_Create_an_account() {
//        logInPage.userShouldNavigateToCreateAnAccount();
//        Assert.assertTrue(driver.findElement(By.linkText("User registration")).getText().contains("User registration"),"User is not Navigated to Registration Page");
//
//    }
//
//    @When("^Enter all details to create an account$")
//    public void Enter_all_details_to_create_an_account() {
//       registrationPage.userShouldAbleToRegisterSuccessfully();
//       Assert.assertTrue(Utils.getTextFromElement(By.xpath("//div[@id='WMessage']/div[2]/div")).contains("Successfully sent email!"));
//       Assert.assertTrue(Utils.getTextFromElement(By.xpath("//div[@id='WMessage']/div[3]/div")).contains("Users Successfully Created"));
//    }
}
