package com.qa.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstTest {

    private WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
    }

    @Test
    public void openExamplePage() {
        driver.get("https://example.com");
        Assert.assertEquals(driver.getTitle(), "Example Domain");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}