package starter.viewprofile;

import net.thucydides.core.annotations.Step;

public class ViewProfile {
    @Step("I am on Profile Page")
    public  void onProfilePage(){
        System.out.println("I am on Profile Page");
    }
    @Step("I click button click profile")
    public void onClickButton(){
        System.out.println("I click button click profile");

    }

    @Step("I am see my profile")
    public void Profile(){
        System.out.println("I am see my profile");

    }

}
