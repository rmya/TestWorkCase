package org.example;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

    WebDriver webDriver;
    WebDriverWait webDriverWait;

    public LoginPage(WebDriver webDriver){
        this.webDriver = webDriver;
        this.webDriverWait = new WebDriverWait(webDriver,30,30);
    }

    public void login(String username, String password){

        //*********** LOGIN ***********

        webDriver.get("https://www.lcwaikiki.com/tr-TR/TR");
        Assert.assertEquals("LC Waikiki | ilk Alışverişte Kargo Bedava! - LC Waikiki", webDriver.getTitle());

        webDriverWait.until(ExpectedConditions.elementToBeClickable(By.className("dropdown-toggle"))).click();
        Assert.assertEquals("Giriş Yap",webDriver.getTitle());

        webDriver.findElement(By.id("LoginEmail")).clear();
        webDriver.findElement(By.id("LoginEmail")).sendKeys(username);

        webDriver.findElement(By.id("Password")).clear();
        webDriver.findElement(By.id("Password")).sendKeys(password);

        webDriverWait.until(ExpectedConditions.elementToBeClickable(By.id("loginLink"))).click();
        Assert.assertEquals("LC Waikiki | ilk Alışverişte Kargo Bedava! - LC Waikiki", webDriver.getTitle());

    }


}
