package org.example;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.concurrent.TimeUnit;

public abstract class PageTest {

    public WebDriver driver;

    @Before
    public void beforeCreateWebDriver() {

        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();

        System.setProperty("webdriver.chrome.driver","C:/Selenium/ChromeDriver");
        driver = new ChromeDriver();

        driver.manage().window().maximize();

    }

    @After
    public void afterQuitWebDriver(){
        driver.quit();
    }

}