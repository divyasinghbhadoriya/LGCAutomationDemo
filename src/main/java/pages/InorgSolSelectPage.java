package pages;

import org.openqa.selenium.WebElement;
import utils.SeleniumHelper;

public class InorgSolSelectPage extends SeleniumHelper {
    public String inorganicBtn="//div//label[@id='cqInorganicRadioBtn']//span/h3[contains(text(),'Inorganic')]";
    public String NextPg="//div[@class='custom-quote--step-title outline']//span[contains(text(),' Step 2: Configure custom solution ')]";
    final String continueBtnXpath="//button[@id='cqSelectCustomSolutionTypeBtn']";

    public void selectInorganic() throws InterruptedException {

        WebElement ContinueBtn = getWebElementByXpath(continueBtnXpath);
        scrollDownToThePageElement(getWebElementByXpath(inorganicBtn));
        hoverToWbElementAndClick(inorganicBtn);
        Thread.sleep(2000);
    }
}
