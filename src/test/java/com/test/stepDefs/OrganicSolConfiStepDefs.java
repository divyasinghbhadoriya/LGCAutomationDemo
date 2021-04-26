package com.test.stepDefs;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.OrgSolConfigurationPage;

import java.io.IOException;

public class OrganicSolConfiStepDefs {
    OrgSolConfigurationPage olgcpg=new OrgSolConfigurationPage();

    @And("I click on Continue button")
    public void iClickOnContinueButton() throws InterruptedException {
        olgcpg.clickOnContinueBtn();
    }
    @And("I browse select the excel file into the Add component")
    public void iBrowseSelectTheExcelFileIntoTheAddComponent() throws IOException, InterruptedException {
        olgcpg.uploadFile();
    }

    @And("I select packaging type,volume,units,quality level")
    public void iSelectPackagingTypeVolumeUnitsQualityLevel() throws IOException, InterruptedException {
        olgcpg.selectOptions();
    }

    @And("I click on Add to Components button")
    public void iClickOnAddToComponentsButton() throws InterruptedException {
        olgcpg.clickAddToComponent();
    }

    @When("I set concentration for the components")
    public void iSetConcentrationForTheComponents() throws InterruptedException {
        olgcpg.setConcentration();
    }
    @Then("I verify Component section is displayed")
    public void iVerifyComponentSectionIsDisplayed() {
        olgcpg.verifyComponentSectionDisplayed();
    }
}
