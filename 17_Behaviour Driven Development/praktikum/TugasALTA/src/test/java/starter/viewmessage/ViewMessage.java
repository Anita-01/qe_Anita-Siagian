package starter.viewmessage;

import net.thucydides.core.annotations.Step;

public class ViewMessage {

    @Step("I am on message page")
    public void onMessagePage(){
        System.out.println("I am on message page");
    }

    @Step("I click the message of someone")
    public void ClickTheMessage(){
        System.out.println("I click the message of someone");
    }

    @Step("I am see the message")
    public void SeeTheMessage(){
        System.out.println("I am see the message");
    }
}
