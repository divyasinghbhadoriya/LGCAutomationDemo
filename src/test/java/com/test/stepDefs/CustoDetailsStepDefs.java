package com.test.stepDefs;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.CustomerDetailsPage;

import java.io.IOException;

public class CustoDetailsStepDefs {
    CustomerDetailsPage custinfopg=new CustomerDetailsPage();

    @Then("I navigate to Customer Details Page")
    public void iNavigateToCustomerDetailsPage() {
        custinfopg.verifyCustomerPage();
    }

    @And("I enter Customer Details")
    public void iEnterCustomerDetails() throws InterruptedException, IOException {
        custinfopg.enterDetails();
    }
    @When("I click on Save & Continue button")
    public void iClickOnSaveContinueButton() throws IOException, InterruptedException {
        custinfopg.clickSaveContinue();
    }

}
