package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.SeleniumHelper;

import java.io.IOException;

public class CustomerDetailsPage extends SeleniumHelper {

    public String foreName="//div/label[contains(text(),'First name')]/following-sibling::div//input[@name='firstName' and @id='cqCustomerDetailsFirstName']";
    public String lastName="//div/label[contains(text(),'Last name')]/following-sibling::div//input[@name='lastName' and @id='cqCustomerDetailsLastName']";
    public String organisationName="//div/label[contains(text(),'Organisation name *')]/following-sibling::div//input[@name='billingCompany' and @id='cqCustomerDetailsOrganization']";
    public String titleDropdown="//input[@name='titleCode' and @id='cqCustomerDetailsTitle']/following-sibling::span/descendant::i";
    public String selectTitle="//div/ul/li/span[contains(text(),'Ms')]";
    public String countryDropdown="//input[@name='billingCountryIdIsoCode' and @id='cqCustomerDetailsCountry']/following-sibling::span/descendant::i";
    public String enterEmail="//div/label[contains(text(),'Email address')]/following-sibling::div//input[@name='email' and @id='cqCustomerDetailsEmailAddress']";
    public String selectCountryCode="//input[@id='cqCustomerDetailsCountryCode']";
    public String enterPhone="//input[@name='phoneCountryCode' and @id='cqCustomerDetailsCountryCode']/following::div//input[@name='phone' and @id='cqCustomerDetailsPhone']";
    public String jobDropdown="//input[@name='jobRoleName' and @id='cqCustomerDetailsJobRole']/following-sibling::span/descendant::i";
    public String selectJobRole="//div/ul/li/span[contains(text(),'I work in quality control')]";
    public String selectCheckbox="//span[@class='el-checkbox__input outline']/span/following-sibling::input[@type='checkbox' and @name='allowedToContact']";
    public String saveButton="//span//input[@name='allowedToContact']/following:: button[@id='cqCustomerDetailsSaveBtn']";
    public String customerDetail="//span[contains(text(),' Step 4: Customer details ')]";
    public String customerPageCheckbox="//label[@id='cqCustomerDetailsPolicy']";
    public String selectCountryName="//input[@id='cqCustomerDetailsCountry']";
    public String userFirstName="TEST USER 001";
    public String userLastName="TESTING";
    public String organisation="LGC GENOMICS";
    public String emailId="lgctestuser001@gmail.com";
    public String phoneNumber="1234567890";

    JavascriptExecutor executor = (JavascriptExecutor) driver;

    public void verifyCustomerPage()  {
        Assert.assertTrue(getWebElementByXpath(customerDetail).isDisplayed());
    }

    public void enterDetails() throws InterruptedException, IOException {
        Thread.sleep(1000);
//        act.moveToElement(new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(getWebElementByXpath(titleDropdown)))).click().perform();
          hoverToWbElementAndClick(titleDropdown);
        Thread.sleep(3000);
        act.moveToElement(new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(getWebElementByXpath(selectTitle)))).sendKeys(Keys.ENTER).perform();

        WebElement firstName=getWebElementByXpath(foreName);
        firstName.sendKeys(userFirstName);

        WebElement lastname=getWebElementByXpath(lastName);
        lastname.sendKeys(userLastName);

        WebElement companyName=getWebElementByXpath(organisationName);
        companyName.sendKeys(organisation);
        Thread.sleep(2000);
        executor.executeScript("window.scrollBy(0,250)");
        Thread.sleep(2000);
        hoverToWbElementAndClick(countryDropdown);
        Thread.sleep(3000);

        //---------enter Country Name--------------//
        WebElement country=getWebElementByXpath(selectCountryName);
        country.click();
        country.sendKeys("United Kingdom");
        country.sendKeys(Keys.ENTER);

        //---------------enter Email---------------------//
        WebElement enterMail=getWebElementByXpath(enterEmail);
        enterMail.sendKeys(emailId);
        Thread.sleep(2000);

        //------------enter Phone code--------------//
        WebElement countryCode=getWebElementByXpath(selectCountryCode);
        countryCode.click();
        countryCode.sendKeys("+44");
        countryCode.sendKeys(Keys.ENTER);

        //--------------enter phone number--------------//
        WebElement enterPhon=getWebElementByXpath(enterPhone);
        enterPhon.sendKeys(phoneNumber);
        System.out.println("Phone number added");

        WebElement element = getWebElementByXpath(jobDropdown);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        Thread.sleep(500);

        hoverToWbElementAndClick(jobDropdown);
        Thread.sleep(3000);
        act.moveToElement(new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath(selectJobRole)))).sendKeys(Keys.ENTER).perform();
        Thread.sleep(2000);
        hoverToWbElementAndClick(customerPageCheckbox);
        Thread.sleep(3000);
    }

    public void clickSaveContinue() throws InterruptedException, IOException {
        WebElement saveBtn=getWebElementByXpath(saveButton);
        Thread.sleep(2000);
        System.out.println();
        saveBtn.click();
        Thread.sleep(2000);
    }
}
