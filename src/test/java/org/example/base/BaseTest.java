package org.example.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseTest {

    static WebDriver webDriver = null;

    public void setUp(){

        System.setProperty("webdriver.chrome.driver","C:/Users/Win10/Desktop/WorkCase/directory/ChromeDriver/binchromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("disable-notifications");
        options.addArguments("disable-popup-blocking");

        setWebDriver(new ChromeDriver(options));
        getWebDriver().navigate().to("https://www.lcwaikiki.com/tr-TR/TR");

    }

    public static WebDriver getWebDriver() {
        return webDriver;
    }

    private static void setWebDriver(WebDriver webDriver) {
        BaseTest.webDriver = webDriver;
    }

    public void tearDown() {
        getWebDriver().quit();
    }


}
