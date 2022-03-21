package starter.findjob;

import net.thucydides.core.annotations.Step;

public class FindJob {
    @Step("I am on homepage page")
    public void onHomePage() {
        System.out.println("I am on HomePage");
    }

    @Step("I am click button homepage")
    public void onClickButton() {
        System.out.println("I am click button homepage");
    }

    @Step("I am find job page")
    public void findJobPage() {
        System.out.println("I am find job page");
    }

    @Step("I am click Free Job Posting")
    public void freeJobPosting() {
        System.out.println("I am click Free Job Posting");
    }

    @Step("I am write a form job posting")
    public void writeFormJob() {
        System.out.println("I am write a form job posting");
    }

    @Step("I click button submit")
    public void buttonSubmit() {
        System.out.println("I click button submit");
    }

}
