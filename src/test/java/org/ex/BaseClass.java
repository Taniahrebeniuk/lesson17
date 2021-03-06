package org.ex;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {

    WebDriver driver;


    @BeforeClass
    public void setupApplication()
    {

        Reporter.log("=====Browser Session Started=====", true);

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://enterprise.demo.orangehrmlive.com/symfony/web/index.php/auth/login");

        Reporter.log("=====Application Started=====", true);
    }


    @AfterClass
    public void closeApplication()
    {
        driver.quit();
        Reporter.log("=====Browser Session End=====", true);

    }



}