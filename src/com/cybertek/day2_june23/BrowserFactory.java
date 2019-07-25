package com.cybertek.day2_june23;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {

    //it's not main method
    //it's a method that returns object of webdriver
    //it can be firefox or chrome based on value of parameter
    //again, we create method to reuse a code
    //remember, if some code must be used at least twice
    //create method for this code
    //don't duplicate same code again and again
    public static WebDriver getDriver(String driver){
        if(driver.equalsIgnoreCase("chrome")){
            //we need to specify properties
            //for chromedriver
            //otherwise, selenium will not know where to find chromedriver
            //1st param is webdriver type
            // 2nd param is for path to the webdriver
            //it's required by selenium webdriver to interact with web browser
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mustafa\\Documents\\Selenium_Dependicies\\drivers\\chromedriver.exe");
            return new ChromeDriver();
        }else if(driver.equalsIgnoreCase("Firefox")){
            System.setProperty("webdriver.gecko.driver", "C:\\Users\\Mustafa\\Documents\\Selenium_Dependicies\\drivers\\geckodriver.exe");
            return new FirefoxDriver();
        }
        return null;
    }
}
