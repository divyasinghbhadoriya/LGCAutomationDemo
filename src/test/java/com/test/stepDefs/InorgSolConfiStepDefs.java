package com.test.stepDefs;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import pages.OrgSolConfigurationPage;
import pages.DeliveryInfoPage;
import pages.InorgSolConfigurationPage;
import utils.SeleniumHelper;

import java.io.IOException;

public class InorgSolConfiStepDefs extends SeleniumHelper {
    InorgSolConfigurationPage inorgSolConfigurationPage = new InorgSolConfigurationPage();
    OrgSolConfigurationPage orgSolConfigurationPage = new OrgSolConfigurationPage();
    DeliveryInfoPage deliveryInfoPage = new DeliveryInfoPage();


    @And("I click on Add element Button")
    public void iClickOnAddElementButton() throws InterruptedException {
        inorgSolConfigurationPage.clickOnAddElementBtn();
    }

    @And("I select elements from the periodic table")
    public void iSelectElementsFromThePeriodicTable() throws InterruptedException {
        inorgSolConfigurationPage.clickOnPeriodicTableElements();
    }

    @And("I click on Add to Component List button")
    public void iClickOnAddToComponentListButton() {
        inorgSolConfigurationPage.clickOnAddToComponentListBtn();
    }
    @And("I select packaging type,volume,units,analytical technique")
    public void iSelectPackagingTypeVolumeUnitsAnalyticalTechnique() throws InterruptedException {
        orgSolConfigurationPage.selectConfigureCustomSolution();
    }

    @Then("I verify Delivery information page is displayed")
    public void iVerifyDeliveryInformationPageIsDisplayed() {
        deliveryInfoPage.verifyDeliveryInformationPageDisplayed();
    }

    @And("I enter billing address details in the Delivery information page")
    public void iEnterBillingAddressDetailsInTheDeliveryInformationPage() throws InterruptedException, IOException {
        deliveryInfoPage.enterBillingAddressDetails();
    }

    @Then("I verify Configure custom solution section displayed")
    public void iVerifyConfigureCustomSolutionSectionDisplayed() {
        inorgSolConfigurationPage.verifyConfigurecustomSolutionSectionDisplayed();
    }

    @Then("I click on Elements section displayed")
    public void iClickOnElementsSectionDisplayed() {
        Assert.assertTrue(getWebElementByXpath("//h3[contains(text(),'Elements')]").isDisplayed());
    }
}
