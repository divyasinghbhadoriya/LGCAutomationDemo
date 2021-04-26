package com.test.stepDefs;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.CustomerDetailsPage;
import pages.DeliveryInfoPage;

import java.io.IOException;

public class DelivryInfoStepDefs {
    DeliveryInfoPage deliveryInfoPage=new DeliveryInfoPage();

    @Then("I validate the Delivery Information Page")
    public void iValidateTheDeliveryInformationPage() {
        deliveryInfoPage.verifyDeliveryInformationPageDisplayed();
    }
    @And("I enter Delivery Details")
    public void iEnterDeliveryDetails() throws InterruptedException, IOException {
        deliveryInfoPage.enterBillingAddressDetails();

    }

}
