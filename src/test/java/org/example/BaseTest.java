package org.example;

import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class BaseTest {

    WebDriver driver;

    @BeforeAll
    private void setUp(){

        System.setProperty("webdriver.chrome.driver","C:/Users/Win10/Desktop/WorkCase/directory/ChromeDriver/binchromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.lcwaikiki.com/tr-TR/TR");
        driver.manage().window().maximize();

    }

    @AfterAll
    public void tearDown(){
        driver.quit();
    }

}
