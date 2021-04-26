package pages;

import org.junit.Assert;
import utils.SeleniumHelper;

import java.io.IOException;

public class ViewSummaryPage extends SeleniumHelper {
    public String summaryPage="//section[@id='custom-quote']//h1[contains(text(),'Custom solution summary')]";
    public String sendQuoteRequestBtn="//button[@id='cqStepFlowEditStep6']";

    public void clickSaveAndViewSummaryBtn() throws InterruptedException {
        hoverToWbElementAndClick("//button[@id='cqDeliveryInformationBtn']");
        Thread.sleep(2000);
    }

    public void verifyCustomerSummary() throws IOException, InterruptedException {
        Assert.assertTrue(getWebElementByXpath(summaryPage).isDisplayed());
        scrollDownToThePageElement(sendQuoteRequestBtn);
        captureScreenshot();
        Assert.assertTrue(getWebElementByXpath(sendQuoteRequestBtn).isDisplayed());
        System.out.println("Test case Paseed");
    }
}
