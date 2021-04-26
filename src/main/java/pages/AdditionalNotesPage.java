package pages;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utils.SeleniumHelper;

public class AdditionalNotesPage extends SeleniumHelper {
    public String additionalNoteHeader = "//div[@class='custom-quote--step _selected outline']//span[contains(text(),' Step 3: Additional notes ')]";
    public String noteTextBox = "//div//textarea[@placeholder='Please specify additional requirements regarding the configuration of your custom solution']";
    public String saveNote = "//button[@id='cqAddAdditionalNotesBtn']";
    public String customerDetail = "//span[contains(text(),' Step 4: Customer details ')]";
    public String comment="LGC Automation Testing Script Demo" +"\n" +"LGC Automation Testing Script Demo" +"\n"+"LGC Automation Testing Script Demo" +"\n"+"LGC Automation Testing Script Demo"+"\n)";

    public void enterAdditionalNotes() throws InterruptedException {
        waitForVisibilityOfElement(additionalNoteHeader, 3);
        WebElement NotTxtBx = getWebElementByXpath(noteTextBox);
        NotTxtBx.sendKeys(Keys.ENTER);
        NotTxtBx.sendKeys(comment);
        waitForVisibilityOfElement(saveNote, 5);
        WebElement SaveNoteBtn = getWebElementByXpath(saveNote);
        scrollDownToThePageElement(noteTextBox);
        SaveNoteBtn.click();
        waitForVisibilityOfElement(customerDetail, 3);


    }
    public void verifyAdditionalNotesSectionDisplayed(){
        Assert.assertTrue(getWebElementByXpath(additionalNoteHeader).isDisplayed());
    }
}
