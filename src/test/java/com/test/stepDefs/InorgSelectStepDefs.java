package com.test.stepDefs;

import cucumber.api.java.en.And;
import pages.InorgSolSelectPage;
import utils.SeleniumHelper;

public class InorgSelectStepDefs extends SeleniumHelper {
    InorgSolSelectPage inorgSolSelectnPage = new InorgSolSelectPage();

    @And("I select Inorganic Order")
    public void iSelectInorganicOrder() throws InterruptedException {
        inorgSolSelectnPage.selectInorganic();
    }

}
