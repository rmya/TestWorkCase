package org.example.pages;

import org.openqa.selenium.WebDriver;

import static org.example.constants.*;

public class HomePage extends BasePage {

    SearchBox searchBox;

    public HomePage(WebDriver driver) {
        super(driver);
        searchBox = new SearchBox(driver);
    }

    public SearchBox searchBox() {
        return this.searchBox;
    }

    public boolean isProductCountUp() {
        return getCartCount() > 0;
    }

    public void goToCart() {
        click(CART_CONTAİNER_LOCATOR);
    }

    private int getCartCount() {
        String cartCount = find(CART_COUNT_LOCATOR).getText();
        return Integer.parseInt(cartCount);
    }

    public void acceptCookies(){
        if(isDisplayed(COOKIE_ACCEPT_BUTTON)){
            click(COOKIE_ACCEPT_BUTTON);
        }
    }

    public void clickLogIn() {
        click(CLICK_LOG_IN_LOCATOR);
    }

    public boolean isOnHomePage_withLogin() {
        return isDisplayed(HESABIM_LABEL_LOCATOR);
    }
}
