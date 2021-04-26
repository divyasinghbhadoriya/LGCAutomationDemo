package com.test.stepDefs;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import utils.BasePage;

import java.io.IOException;

public class CustomHooks extends BasePage {
//    @Before
//        public void headlessMode() throws IOException {
//            System.setProperty("webdriver.chrome.driver", ".//src//main//java//utils//chromedriver.exe");
//            ChromeOptions options = new ChromeOptions();
//            options.addArguments("headless");
//            driver = new ChromeDriver(options);
//           System.out.println("Test script running in headless mode");
//        }

        @Before
       public void initConfig() throws Exception {
            String browserName="chrome";
             String driverName="webdriver.chrome.driver";
            String driverPath=".//src//main//java//utils//chromedriver.exe";

            // String browserName="edge";
            //String driverName="webdriver.edge.driver";
           // String driverPath=".//src//main//java//utils//msedgedriver.exe";

            //  String browserName="firefox";
            //  String driverName="webdriver.firefox.driver";
            //  String driverPath=".//src//main//java//utils//geckodriver.exe";

            //  String browserName="internet explorer";
            //  String driverName="webdriver.internet explorer.driver";
            //  String driverPath=".//src//main//java//utils//geckodriver.exe";

            driver=getWebDriver(browserName,driverName,driverPath);
            driver.manage().window().maximize();
        }
        @After
        public void tearDown(){
            driver.quit();
        }
    }
