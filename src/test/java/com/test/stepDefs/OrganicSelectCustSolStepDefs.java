package com.test.stepDefs;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pages.OrgSolSelectPage;
import utils.Constants;
import utils.SeleniumHelper;

public class OrganicSelectCustSolStepDefs extends SeleniumHelper {
        OrgSolSelectPage orgSolSelectPage=new OrgSolSelectPage();

        @Given("I navigate to the LGC WEBSITE URL")
        public void iNavigateToTheLGCWEBSITEURL() {
            driver.get(Constants.LGC_WEBSITE_URL);
        }
        @And("I select Organic Order")
        public void iSelectOrganicOrder() {

            orgSolSelectPage.selectOrganic();
        }
}

