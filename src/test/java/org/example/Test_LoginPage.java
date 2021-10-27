package org.example;

import org.example.pages.LoginPage;
import org.junit.Test;
import org.junit.jupiter.api.Order;

public class Test_LoginPage extends BaseTest {

    LoginPage loginPage;

    @Test
    @Order(1)
    public void clickLogIn(){
        loginPage = new LoginPage(driver);
        loginPage.clickLogIn();
    }

    @Test
    @Order(2)
    public void sendEmail(){
        loginPage.sendEmail();
    }

    @Test
    @Order(3)
    public void sendPassword(){
        loginPage.sendPassword();
    }

    @Test
    @Order(4)
    public void LoginButton(){
        loginPage.LoginButton();
    }






}
