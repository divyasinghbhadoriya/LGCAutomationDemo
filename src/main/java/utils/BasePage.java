package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BasePage{
        public static WebDriver driver;

        public static WebDriver getWebDriver(String browserName, String driverName, String driverPath) throws Exception {

            switch (browserName) {
                case "chrome":
                    System.setProperty(driverName,driverPath);
                    driver=new ChromeDriver();
                    break;
                case "internet explorer":
                    System.setProperty(driverName,driverPath);
                    driver=new InternetExplorerDriver();
                    break;
                case "firefox":
                    System.setProperty(driverName,driverPath);
                    driver=new FirefoxDriver();
                    break;
                case "edge":
                    System.setProperty(driverName,driverPath);
                    driver=new EdgeDriver();
                    break;
                default:
                    throw new Exception ("Chosen browser is invalid..!! please choose either of internet explorer/firefox/edge/chrome");

            }
            return driver;
        }
    }

