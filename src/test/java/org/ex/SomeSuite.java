package org.ex;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SomeSuite extends BaseClass {
    @BeforeClass
    public void driverInit() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
    }


    @Test
    public void firstCheck() {

        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        Assert.assertEquals(0, 0);
    }

    @Test
    public void SecondtCheck() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        Assert.assertEquals(0, 0);
    }
}


