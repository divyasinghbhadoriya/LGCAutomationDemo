package com.test.stepDefs;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.AdditionalNotesPage;

public class AdditionalNotesStepDefs {
    AdditionalNotesPage addnotespg=new AdditionalNotesPage();

    @When("I enter Additional notes regarding Order")
    public void iEnterAdditionalNotesRegardingOrder() throws InterruptedException {
        addnotespg.enterAdditionalNotes();
    }


    @Then("I verify Additional notes section displayed")
    public void iVerifyAdditionalNotesSectionDisplayed() {
        addnotespg.verifyAdditionalNotesSectionDisplayed();
    }
}
