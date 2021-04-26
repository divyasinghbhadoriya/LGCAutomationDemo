package com.test.stepDefs;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.AdditionalNotesPage;
import pages.ViewSummaryPage;
import utils.SeleniumHelper;

import java.io.IOException;

public class ViewSummaryStepDefs extends SeleniumHelper {
    ViewSummaryPage viewsummarypg=new ViewSummaryPage();

    @When("I click the View Summary Button")
    public void iClickTheViewSummaryButton() throws InterruptedException {
        viewsummarypg.clickSaveAndViewSummaryBtn();

    }

    @Then("I get navigated to the customer information summary page")
    public void iGetNavigatedToTheCustomerInformationSummaryPage() throws IOException, InterruptedException {
        viewsummarypg.verifyCustomerSummary();
    }
}
