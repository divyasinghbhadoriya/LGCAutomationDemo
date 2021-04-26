package utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class SeleniumHelper extends BasePage {
    public Actions act=new Actions(driver);
    public void waitForVisibilityOfElement(String webElementXpath, int timeoutInSeconds) {
        WebDriverWait wait = new WebDriverWait(driver, timeoutInSeconds);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(webElementXpath)));
    }
    public WebElement getWebElementByXpath(String xpath) {
        return driver.findElement(By.xpath(xpath));
    }

    public WebElement getWebElementById(String id) {
        return driver.findElement(By.id(id));
    }

    public WebElement getWebElementByPartialLinkText(String partialLinkText) {
        return driver.findElement(By.partialLinkText(partialLinkText));
    }

    public WebElement getWebElementByClassName(String className) {
        return driver.findElement(By.className(className));
    }

    public WebElement getWebElementByLinkText(String wbElementLinkText) {
        return driver.findElement(By.linkText(wbElementLinkText));
    }
    public static void captureScreenshot() throws IOException {
        Date d = new Date();
        String fileName = d.toString().replace(":", "_".replace(" ", "_")) + ".jpg";
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshot, new File(".//screenshot//" + fileName));
    }
    public void scrollDownToThePageElement(WebElement element) throws InterruptedException {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        Thread.sleep(2000);
    }
    public void scrollDownToThePageElement(String elementXpathStr) throws InterruptedException {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", getWebElementByXpath(elementXpathStr));
        Thread.sleep(2000);
    }
    public void hoverToWbElementAndClick(String webElementXpath){
        act.moveToElement(getWebElementByXpath(webElementXpath)).click().perform();
    }
    public void hoverToWbElementAndClick(WebElement webElement){
        act.moveToElement(webElement).click().perform();
    }
}
