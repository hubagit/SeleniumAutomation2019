package com.cybertek.day2_june23;

import com.cybertek.day2_june23.BrowserFactory;
import org.openqa.selenium.WebDriver;

public class TestingBrowserFactory {
    public static void main(String[] args) {

        //WebDriver driver = new ChromeDriver();
        //getDriver is a static method
        //so we don't have to create an obj
        //to use that method
        //in order to call static members
        //we use classname.obj
        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.manage().window().maximize(); //command to maximize browser
        driver.get("http://practice.cybertekschool.com/");
        try {
            //sleep method throws checked exception
            //that means we have to handle it
            //unchecked exceptions occurs during runtime
            Thread.sleep(5000);// this comand will stop execution for 3 seconds
            //it will wait 5 sec
            //before closing
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        //this is our test
        //we are checking if expected title is same as actual
        String actualTitle = driver.getTitle();
        String expectedTitle = "Practice$";
        if(actualTitle.equalsIgnoreCase(expectedTitle)){
            System.out.println("Passed");
        }else{
            System.out.println("Failed");
            System.out.println("Expected title: "+expectedTitle);
            System.out.println("Actual title: "+actualTitle);
        }
            driver.close(); // close browser at the end of test

    }
}
