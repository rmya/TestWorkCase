package org.example.pages;

import org.openqa.selenium.WebDriver;

import static org.example.constants.*;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public boolean isOnLoginPage() {
        return isDisplayed(UYE_TITLE_LOCATOR);
    }

    public  void  sendEmail(){
        sendKeys(EMAIL_AREA_LOCATOR,"rumeysa.tan2@gmail.com");
    }

    public void sendPassword(){
        sendKeys(PASSWORD_AREA_LOCATOR,"rtrtrt1");
    }

    public void LoginButton(){
        click(CLICK_BUTTON_LOGIN_LOCATOR);
    }



}
