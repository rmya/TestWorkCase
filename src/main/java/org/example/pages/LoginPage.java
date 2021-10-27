package org.example.pages;

import org.openqa.selenium.WebDriver;

import static org.example.constants.ConstantsLoginPage.*;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public boolean isOnLoginPage() {
        return isDisplayed(UYE_TITLE);
    }

    public  void  sendEmail(){
        sendKeys(EMAIL_AREA,"rumeysa.tan2@gmail.com");
    }

    public void sendPassword(){
        sendKeys(PASSWORD_AREA,"rtrtrt1");
    }

    public void LoginButton(){
        click(CLICK_BUTTON_LOGIN);
    }



}
