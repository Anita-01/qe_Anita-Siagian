package starter.mynetwork;


import net.thucydides.core.annotations.Step;

public class AddMyNetwork {


    @Step("I am on My Network page")
    public void onTheMyNetworkPage(){
        System.out.println("I am on My Network page");
    }

    @Step("Choose one account")
    public void ChooseAccount(){
        System.out.println("Choose one account");
    }

    @Step("I click connect button")
    public void ClickConnectButton(){
        System.out.println("I click connect button");
    }
}
