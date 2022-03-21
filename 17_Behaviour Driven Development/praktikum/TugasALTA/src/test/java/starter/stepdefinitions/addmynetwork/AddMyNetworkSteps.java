package starter.stepdefinitions.addmynetwork;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;
import starter.mynetwork.AddMyNetwork;

public class AddMyNetworkSteps {
    @Steps
    AddMyNetwork addMyNetwork;

    @Given("I am on My Network page")
    public void onTheMyNetworkPage(){
        addMyNetwork.onTheMyNetworkPage();
    }

    @Then("Choose one account")
    public void ChooseAccount(){
        addMyNetwork.ChooseAccount();
    }

    @And("I click connect button")
    public void ClickConnectButton(){
        addMyNetwork.ClickConnectButton();
    }
}
