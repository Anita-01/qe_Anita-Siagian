package starter.stepdefinitions.findjob;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;
import starter.findjob.FindJob;

public class FindJobSteps {
    @Steps
    FindJob findJob;

    @Given("I am on homepage page")
    public void onHomePage(){
        findJob.onHomePage();
    }

    @And("I am click button homepage")
    public void onClickButton(){
        findJob.onClickButton();
    }

    @Then("I am find job page")
    public void findJobPage(){
        findJob.findJobPage();
    }

    @And("I am click Free Job Posting")
    public void freeJobPosting(){
        findJob.freeJobPosting();
    }

    @Then("I am write a form job posting")
    public void writeFormJob(){
        findJob.writeFormJob();
    }

    @And("I click button submit")
    public void buttonSubmit(){
        findJob.buttonSubmit();
    }





}

