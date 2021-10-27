package org.example.pages;

import org.openqa.selenium.WebDriver;

import static org.example.constants.ConstantsLoginPage.*;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public LoginPage clickLogIn(){
        click(CLICK_LOG_IN );
        return this;
    }

    public  LoginPage sendEmail(){
        sendKeys(EMAIL_AREA,"rumeysa.tan2@gmail.com");
        return this;
    }

    public LoginPage sendPassword(){
        sendKeys(PASSWORD_AREA,"r147852369");
        return this;
    }

    public LoginPage LoginButton(){
        click(CLICK_BUTTON_LOGIN);
        return this;
    }



}
