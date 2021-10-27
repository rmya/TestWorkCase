package org.example.constants;

import org.openqa.selenium.By;

public class ConstantsLoginPage {

    public static final By CLICK_LOG_IN = By.className("dropdown-toggle");
    public static final By UYE_TITLE = new By.ByXPath("/html/body/div[5]/div[3]/div/form/div/div/p");
    public static final By HESABIM_LABEL = new By.ByXPath("/html/body/div[2]/div/div[1]/div/header/div[2]/div/div[3]/div[2]/div[1]/button/span");
    public static final By EMAIL_AREA = By.id("LoginEmail");
    public static final By PASSWORD_AREA = By.id("Password");
    public static final By CLICK_BUTTON_LOGIN = By.id("loginLink");

}
