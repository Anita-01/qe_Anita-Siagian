package starter.stepdefinitions.viewprofile;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;
import starter.viewprofile.ViewProfile;
public class ViewProfileSteps {
    @Steps
    ViewProfile viewProfile;

    @Given("I am on Profile Page ")
    public void onProfilePage() {
    viewProfile.onProfilePage();
    }

    @And("I click button click profile")
    public void onClickButton(){
     viewProfile.onClickButton();

    }

    @Then("I am see my profile")
    public void Profile(){
        viewProfile.Profile();

    }



}
