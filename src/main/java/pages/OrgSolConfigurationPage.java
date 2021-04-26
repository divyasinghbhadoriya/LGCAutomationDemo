package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.SeleniumHelper;

import java.io.IOException;

public class OrgSolConfigurationPage extends SeleniumHelper {

    final String continueBtnXpath="//button[@id='cqSelectCustomSolutionTypeBtn']";
    final String filePath="C:/12april programming/LGCAutomationDemo/CustomQuoteUpload_15_CAS_Only.xls";
    final String dropdownArrow="//input[@placeholder='This component has multiple matches found. Please select your preferred option:']/following-sibling::span/descendant::i";
    final String packageTypeHeader="//section//div//h3[contains(text(),'Select your packaging type*')]";
    final String packageTitle="//div[@class='configure-solution--setting outline']/div[@role='radiogroup']/ancestor::div/h3[contains(text(),'Select your packaging type*')]";
    final String bottleWithScrewCapPackType="//label[@id='cqOrganicPackaginType2']//span[contains(text(),'Bottle with screw cap')]";
    final String bottleHdpePackType="//label[@id='cqInorganicPackaginType1']//span[contains(text(),'Bottle (HDPE)')]";
    //span[contains(text(),'CERTAN')]/ancestor::label[@role='radio']
    final String unitVolumeHeader="//div//h3[contains(text(),'What unit volume do you need?*')]";
    final String organicUnitVolumeArrow="//input[@id='cqOrganicDataUnitVolume' and @placeholder='Select']/following-sibling::span/descendant::i";
    final String inorganicUnitVolumeArrow="//input[@id='cqInorganicDataUnitVolume' and @placeholder='Select']/following-sibling::span/descendant::i";
    final String unitVol10Ml="//div/ul//li[contains(text(),'10 ml')]";
    final String unitVol500Ml="//div/ul//li[contains(text(),'500 ml')]";
    final String unitCountHeader="//div/h3[contains(text(),'How many units do you need?*')]";
    final String organicUnitCountAddBtn="//div[@id='cqOrganicDataUnitQuantity']//span/i[@class='el-icon-plus']";
    final String inorganicUnitCountAddBtn="//div[@id='cqInorganicDataUnitQuantity']//span/i[@class='el-icon-plus']";
    final String qualityHeader="//div/h3[text()='Select your quality level*']";
    final String qualitySelect="//div[@role='radiogroup']/label[@id='cqOrganicDataQualityISO17025']";
    final String analyticalTechniqueHeader="//div//h3[contains(text(),'Which analytical technique will you use with this solution?*')]";
    final String icpMsAnalyticalTech="//label[@id='cqAnalyticalTechniqueICPMS']//span[contains(text(),'ICP-MS')]";
    final String anaTechnique="//label[@id='cqOrganicDataAnalyticalTechniqueLC']";
    final String saveButton="//button[contains(text(),'Save & continue')]";
    final String inOrganicSaveAndContBtn="//button[@id='cqConfigureCustomSolutionTypeBtn' and text()='Save & continue']";
    final String addToComponentBtn="//button[@id='cqShouldAllowAddingUnexistedItemBtnResults']";
    JavascriptExecutor executor = (JavascriptExecutor) driver;


    public void clickOnContinueBtn() throws InterruptedException {
        waitForVisibilityOfElement(continueBtnXpath,5);
        WebElement ContinueBtn = getWebElementByXpath(continueBtnXpath);
        executor.executeScript("arguments[0].scrollIntoView(true);", ContinueBtn);
        executor.executeScript("arguments[0].click();", ContinueBtn);
        Thread.sleep(3000);
    }
    public void uploadFile() throws IOException, InterruptedException {
        WebElement fileInput = getWebElementByXpath("//input[@name='file']");
        fileInput.sendKeys(filePath);
        System.out.println("File uploaded successfully");
        waitForVisibilityOfElement(dropdownArrow,10);
    }
    public void setConcentration() throws InterruptedException {
        //----------select set concentration---------------//
        WebElement setConcentration=getWebElementByXpath("//div[@class='cq-results--header outline']//div/input[@id='orderRequestTopAnalyteForm']");
        setConcentration.sendKeys("10");
        setConcentration.sendKeys(Keys.ENTER);
        Thread.sleep(2000);

     //   executor.executeScript("window.scrollBy(0,1300)");
    }

    public void clickAddToComponent() throws InterruptedException {
        WebElement selectOption = getWebElementByXpath(dropdownArrow);
        selectOption.click();
        Thread.sleep(2000);
        act.moveToElement(getWebElementByXpath("//div/ul/li[@class='el-select-dropdown__item']/span[contains(text(),'N1-(BUTYLCARBAMOYL)-SULFANILAMIDE')]")).click().perform();
        Thread.sleep(2000);

        //-----------click on add to component-----------//
//        WebElement addToComponent=getWebElementByXpath(addToComponentBtn);
        act.moveToElement(new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(getWebElementByXpath(addToComponentBtn)))).click().perform();
        Thread.sleep(2000);
    }

    public void selectOptions() throws InterruptedException, IOException {
        //---------select package type---------------//
        waitForVisibilityOfElement(packageTypeHeader,20);
        Thread.sleep(1000);
        scrollDownToThePageElement(bottleWithScrewCapPackType);
        act.moveToElement(new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(getWebElementByXpath(bottleWithScrewCapPackType)))).click().build().perform();
        Thread.sleep(2000);

        //-----------------select unit volume-----------------//
        waitForVisibilityOfElement(unitVolumeHeader,2);
        Thread.sleep(1000);
        //act.moveToElement(new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(getWebElementByXpath(organicUnitVolumeArrow)))).click().perform();
        hoverToWbElementAndClick(organicUnitVolumeArrow);
        Thread.sleep(1000);
        hoverToWbElementAndClick(unitVol10Ml);

        //-----------select unit count----------------//
        waitForVisibilityOfElement(unitCountHeader,3);
        act.moveToElement(new WebDriverWait(driver,20).until(ExpectedConditions.elementToBeClickable(getWebElementByXpath(organicUnitCountAddBtn)))).doubleClick().perform();
        Thread.sleep(2000);
        System.out.println("unit count added successfully");
        scrollDownToThePageElement(qualitySelect);

        //-------------select quality--------//

        act.moveToElement(new WebDriverWait(driver,20).until(ExpectedConditions.elementToBeClickable(getWebElementByXpath(qualitySelect)))).click().perform();
        Thread.sleep(1000);

        //---------------select quality header-------------------//

        act.moveToElement(new WebDriverWait(driver,20).until(ExpectedConditions.elementToBeClickable(getWebElementByXpath(anaTechnique)))).click().perform();
        Thread.sleep(1000);

        //------click on Save and Continue button----------------------//
        WebElement saveBtn=getWebElementByXpath(saveButton);
        saveBtn.click();
        Thread.sleep(1000);
    }

   public void selectPackagingType(String packagingTypeXpathStr) throws InterruptedException {
        scrollDownToThePageElement(packagingTypeXpathStr);
       waitForVisibilityOfElement(packageTypeHeader,20);
       Thread.sleep(1000);
       act.moveToElement(new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(getWebElementByXpath(packagingTypeXpathStr)))).click().perform();
       Thread.sleep(2000);
   }
   public void selectUnitVolume(String volumeType,String unitVolQuantityXpathStr) throws InterruptedException {
       waitForVisibilityOfElement(unitVolumeHeader,3);
       Thread.sleep(1000);
       act.moveToElement(new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(getWebElementByXpath(volumeType)))).click().perform();
       Thread.sleep(2000);
       act.moveToElement(new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(getWebElementByXpath(unitVolQuantityXpathStr)))).click().perform();
   }
   public void selectUnit(String buttonType) throws InterruptedException {
       waitForVisibilityOfElement(unitCountHeader,3);
       act.moveToElement(new WebDriverWait(driver,20).until(ExpectedConditions.elementToBeClickable(getWebElementByXpath(buttonType)))).doubleClick().perform();
       Thread.sleep(2000);
       System.out.println("unit count added successfully");

   }
   public void selectAnalyticalTechnique(String anaTechniqueType) throws InterruptedException {
       waitForVisibilityOfElement(analyticalTechniqueHeader,3);
       act.moveToElement(new WebDriverWait(driver,20).until(ExpectedConditions.elementToBeClickable(getWebElementByXpath(anaTechniqueType)))).click().perform();
       Thread.sleep(1000);
   }

   public void selectConfigureCustomSolution() throws InterruptedException {
        selectPackagingType(bottleHdpePackType);
        selectUnitVolume(inorganicUnitVolumeArrow,unitVol500Ml);
        selectUnit(inorganicUnitCountAddBtn);
        selectAnalyticalTechnique(icpMsAnalyticalTech);
        scrollDownToThePageElement(inOrganicSaveAndContBtn);
        clickInOrganicSaveAndContBtn();
   }
   public void clickInOrganicSaveAndContBtn() throws InterruptedException {
        scrollDownToThePageElement(inOrganicSaveAndContBtn);
        getWebElementByXpath(inOrganicSaveAndContBtn).click();

   }
   public void verifyComponentSectionDisplayed(){
       Assert.assertTrue(getWebElementByXpath("//h3[contains(text(),'Components ')]").isDisplayed());
   }
}
