package starter.forgotpassword;
import net.thucydides.core.annotations.Step;

public class ForgotPassword {
    @Step("I am on forgot password page")
    public void onTheForgotPasswordPage(){
        System.out.println("I am on forgot password page");
    }

    @Step("I enter my email or number phone is correct")
    public void enterEmail(){
        System.out.println("I enter my email or number phone is correct");
    }

    @Step("I click forgot button")
    public void ClickButtonForgot(){
        System.out.println("I click forgot button");
    }
}
