package pages;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utils.SeleniumHelper;

import java.io.IOException;

public class DeliveryInfoPage extends SeleniumHelper {
    public String deliveryPage="//span[contains(text(),' Step 5: Delivery information ')]";
    public String addressLineOne="//div/label[contains(text(),'Address line 1 *')]/following::div/input[@id='cqBillingAddressLine1']";
    public String addressLineTwo="//div/label[contains(text(),'Address line 2')]/following::div/input[@id='cqBillingAddressLine2']";
    public String county="//div/label[contains(text(),'County')]/following::div/input[@id='cqBillingAddressCounty']";
    public String city="//div/label[contains(text(),'City')]/following::div/input[@id='cqBillingAddressCity']";
    public String postCode="//div/label[contains(text(),'Post code')]/following::div/input[@id='cqBillingAddressPostCode']";
    public String checkBoxSameBillingAddress="//div[@class='cq-shipping--wrapper outline']/label//span[@class='el-checkbox__inner outline']";
    public String countryxpath="//input[@id='cqBillingAddressCountry']";

    public void enterBillingAddressDetails() throws InterruptedException, IOException {
        WebElement addressLine1=getWebElementByXpath(addressLineOne);
        addressLine1.click();
        addressLine1.sendKeys("19 Douglas Place");

        WebElement addressLine2=getWebElementByXpath(addressLineTwo);
        addressLine2.click();
        addressLine2.sendKeys("Oldbrook");

        //---------enter Country Name--------------//
        WebElement country=getWebElementByXpath(countryxpath);
        country.click();
        country.sendKeys("United Kingdom");
        country.sendKeys(Keys.ENTER);

        getWebElementByXpath(county).click();
        getWebElementByXpath(county).sendKeys("Buckinghamshire");

        getWebElementByXpath(city).click();
        getWebElementByXpath(city).sendKeys("Milton Keynes");

        getWebElementByXpath(postCode).click();
        getWebElementByXpath(postCode).sendKeys("MK6 2XW");

        WebElement element2=getWebElementByXpath(checkBoxSameBillingAddress);
        scrollDownToThePageElement(checkBoxSameBillingAddress);
        act.moveToElement(element2).sendKeys(Keys.ENTER).perform();
    }

    public void verifyDeliveryInformationPageDisplayed(){
        Assert.assertTrue(getWebElementByXpath(deliveryPage).isDisplayed());
    }
}
