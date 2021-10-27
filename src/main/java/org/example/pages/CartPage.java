package org.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import static org.example.constants.ConstantsAddProductToCart.CART_PRODUCT_LOCATOR;

public class CartPage extends BasePage {

    protected int cartProductSize;

    public CartPage(WebDriver driver) {
        super(driver);
    }

    public boolean checkIfProductAdded() {
        cartProductSize = getCartProducts().size();
        return cartProductSize > 0;
    }

    private List<WebElement> getCartProducts() {
        return findAll(CART_PRODUCT_LOCATOR);
    }


}
