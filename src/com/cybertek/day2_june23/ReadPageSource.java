package com.cybertek.day2_june23;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadPageSource {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mustafa\\Documents\\Selenium_Dependicies\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com");
        //get the source of the last loaded page
        String pageSource = driver.getPageSource();
        System.out.println(pageSource);
        driver.close();


    }
}
