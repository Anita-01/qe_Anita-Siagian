package starter.stepdefinitions.viewmessage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;
import starter.viewmessage.ViewMessage;

public class ViewMessageSteps {
    @Steps
    ViewMessage viewMessage;

    @Given("I am on message page")
    public void onMessagePage(){
        viewMessage.onMessagePage();
    }

    @And("I click the message of someone")
    public void ClickTheMessage(){
        viewMessage.ClickTheMessage();
    }

    @Then("I am see the message")
    public void SeeTheMessage(){
        viewMessage.SeeTheMessage();
    }
}
