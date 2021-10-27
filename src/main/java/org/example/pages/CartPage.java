package org.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import static org.example.constants.*;

public class CartPage extends BasePage {

    protected int cartProductSize;

    public CartPage(WebDriver driver) {
        super(driver);
    }

    //TODO : ürün sepete eklenmeden önce beden seçimi kısmı eksik.

    public boolean checkIfProductAdded() {
        cartProductSize = getCartProducts().size();
        return cartProductSize > 0;
    }

    private List<WebElement> getCartProducts() {
        return findAll(CART_PRODUCT_LOCATOR);
    }


    public void deleteProduct() {
        click(CART_FIST_REMOVE_BUTTON);
        click(CART_POPUP_REMOVE_BUTTON);
    }

    public boolean checkIfProductRemoved() {
        return isDisplayed(CART_PRODUCT_IS_REMOVED_LOCATOR);
    }

    public void contolCartProduct() {
        find(CART_PAYMENT_STEP_BOTTON);
    }

    public boolean isCartEmpty() {
        return isDisplayed(CART_EMPTY_TITLE_LOCATOR);
    }
}
