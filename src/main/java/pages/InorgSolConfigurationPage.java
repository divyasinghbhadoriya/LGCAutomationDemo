package pages;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import utils.SeleniumHelper;

public class InorgSolConfigurationPage extends SeleniumHelper {
    final String addElementBtn="//button//h3[text()='Add elements']";
    final String liElement="//li//div[text()='Li']";
    final String naElement="//li//div[text()='Na']";
    final String kElement="//li//div[text()='K']";
    final String rbElement="//li//div[text()='Rb']";
    final String addToComponentListBtn="//button[@id='cqSelectPeriodicTableElementsBtn']";
    final String confCustSolHeader="//span[contains(text(),'Configure custom solution')]";


    public void clickOnAddElementBtn() throws InterruptedException {
        Thread.sleep(2000);
        act.moveToElement(getWebElementByXpath(addElementBtn)).click().perform();
        Thread.sleep(1000);
    }
    public void clickOnPeriodicTableElements() throws InterruptedException {
        getWebElementByXpath(liElement).click();
        getWebElementByXpath(naElement).click();
        getWebElementByXpath(kElement).click();
        getWebElementByXpath(rbElement).click();
    }

    public void clickOnAddToComponentListBtn() {
        getWebElementByXpath(addToComponentListBtn).click();
    }

    public void verifyConfigurecustomSolutionSectionDisplayed(){
        Assert.assertTrue(getWebElementByXpath(confCustSolHeader).isDisplayed());
    }
}
