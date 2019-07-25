package com.cybertek.day2_june23;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigation {
    //throws Exception means someone else is responsible for
    //handling this exception
    //whoever is calling method
    //it works without try/catch because we can throw exception on the method level
    //declaration that means we are not responsible for handling this exception any more
    public static void main(String[] args) throws Exception{

        //since we use getDriver(), it will set path to the webdriver for us
        WebDriver driver = BrowserFactory.getDriver("chrome");
        //Basic navigation is not supposed to be a child class of any class
        //that we wrote that's why it's not supposed to extend any class
        //preferable to use BrowserFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://google.com");
        Thread.sleep(1000); //wait 1 sec
        driver.get("https://amazon.com");
        Thread.sleep(3000); //wait 3 sec
        driver.navigate().back();
        Thread.sleep(3000);//wait 3 sec
        driver.navigate().forward();
        System.out.println("Title: "+driver.getTitle());
        System.out.println("URL: "+driver.getCurrentUrl());
        driver.navigate().refresh();
        Thread.sleep(3000);
        driver.close();
    }
}
