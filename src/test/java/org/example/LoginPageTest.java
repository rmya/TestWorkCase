package org.example;

import org.junit.Test;

public class LoginPageTest extends PageTest{

    @Test
    public void login() {
        new LoginPage(driver).login("rumeysa.tan2@gmail.com","r147852369");
    }

}
