package org.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import static org.example.constants.ConstantsAddProductToCart.PRODUCT_LOCATOR;
import static org.example.constants.ConstantsAddProductToCart.SHIPPING_FILTER_LOCATOR;

public class ProductsPage extends BasePage {

    //TODO Product sayfasında olup olmadığımızı anlamak için Product sayfasına özgü Filtre Locater eklemeyi düşündüm.

    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    public boolean isOnProductPage() {
        return isDisplayed(SHIPPING_FILTER_LOCATOR);
    }

    public void selectProduct(int i) {
        getAllProducts().get(i).click();
    }

    private List<WebElement> getAllProducts() {
        return findAll(PRODUCT_LOCATOR);
    }



}
