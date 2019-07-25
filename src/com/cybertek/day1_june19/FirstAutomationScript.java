package com.cybertek.day1_june19;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstAutomationScript {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mustafa\\Documents\\Selenium_Dependicies\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://cybertekschool.com");

        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Mustafa\\Documents\\Selenium_Dependicies\\drivers\\geckodriver.exe");
        WebDriver driver2 = new FirefoxDriver();
        driver2.get("http://practice.cybertekschool.com");



    }
}
