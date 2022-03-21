package starter.stepdefinitions.forgotpassword;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.forgotpassword.ForgotPassword;


public class ForgotPasswordSteps {
    @Steps
    ForgotPassword forgotPassword;


    @Given("I am on forgot password page")
    public void onTheForgotPasswordPage()
    {
        forgotPassword.onTheForgotPasswordPage();
    }
    @When("I enter my email or number phone is correct")
    public void enterEmail(){
        forgotPassword.enterEmail();

    }

    @And("I click forgot button")
    public void ClickButtonForgot(){
        forgotPassword.ClickButtonForgot();

    }

}




