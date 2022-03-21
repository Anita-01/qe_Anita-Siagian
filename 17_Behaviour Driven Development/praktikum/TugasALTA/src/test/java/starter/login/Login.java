package starter.login;

import net.thucydides.core.annotations.Step;

public class Login {
    @Step("I am on login page")
    public void onTheLoginPage(){
        System.out.println("I am on login page");
    }

    @Step("I enter my username and password correctly")
    public void EnterUsernamePassword(){
        System.out.println("I enter my username and password correctly");
    }

    @Step("I click login button")
    public void ClickLoginButton(){
        System.out.println("I click login button");
    }

    @Step("I am on the dashboard page")
    public void onTheDashboardPage(){
        System.out.println("I am on the dashboard page");
    }
}
