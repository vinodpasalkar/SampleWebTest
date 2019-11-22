package net.webtestautomation.definitions;

import net.webtestautomation.tests.OnlinePurchaseTests;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class OnlinePurchaseStepDefinitions {

    @Steps
    OnlinePurchaseTests onlinePurchaseTests;

    @Given("I am on retail site")
    public void initializeActionWhenDevice(){
        onlinePurchaseTests.gotoSite();
    }

    @When("I add $Summer dresses to the cart")
    public void addDressesToCart(String dressType){
        onlinePurchaseTests.addDressesToCart(dressType);
    }

    @When("I press $proceedtocheckout button")
    public void pressButton(String buttonType){
        onlinePurchaseTests.pressButton(buttonType);
    }

    @Then("$SignIn page should be displayed successfully")
    public void verifyPage(String pageType){ onlinePurchaseTests.verifyPage(pageType); }

}
