package org.example;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class LoginPage {

    WebDriver webDriver;
    WebDriverWait webDriverWait;


    public LoginPage(WebDriver webDriver){
        this.webDriver = webDriver;
        this.webDriverWait = new WebDriverWait(webDriver, Duration.ofSeconds(30));
    }

    public void login(String username, String password){

        //*********** LOGIN ***********

        webDriver.get("https://www.lcwaikiki.com/tr-TR/TR");
        Assert.assertEquals("LC Waikiki | İlk Alışverişte Kargo Bedava! - LC Waikiki", webDriver.getTitle());

        webDriverWait.until(ExpectedConditions.elementToBeClickable(By.className("dropdown-toggle"))).click();
        //Assert.assertEquals("Üye Girişi - LC Waikiki",webDriver.getTitle());

        webDriver.findElement(By.id("LoginEmail")).clear();
        webDriver.findElement(By.id("LoginEmail")).sendKeys(username);

        webDriver.findElement(By.id("Password")).clear();
        webDriver.findElement(By.id("Password")).sendKeys(password);

        webDriverWait.until(ExpectedConditions.elementToBeClickable(By.id("loginLink"))).click();
        Assert.assertEquals("LC Waikiki | İlk Alışverişte Kargo Bedava! - LC Waikiki", webDriver.getTitle());

        //*********** SEARCH ***********

        //search-box__input
        WebElement searhData = webDriver.findElement(By.className("activated"));
        searhData.sendKeys("pantolan");
        searhData.sendKeys(Keys.ENTER);

    }

}
