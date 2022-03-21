package starter.stepdefinitions.login;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.login.Login;

public class LoginSteps {
    @Steps
    Login login;

    @Given("I am on login page")
    public void onTheLoginPage(){
        login.onTheLoginPage();
    }
    @When("I enter my username and password correctly")
    public void enterUsernamePassword(){
        login.EnterUsernamePassword();
    }

    @And("I click login button")
    public void ClickButtonLogin(){
        login.ClickLoginButton();
    }

    @Then("I am on the dashboard page")
    public void onTheDashboardPage(){
        login.onTheDashboardPage();
    }
}


