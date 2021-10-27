package org.example.pages;

import org.openqa.selenium.WebDriver;

import static org.example.constants.ADD_TO_CART_BUTTON_LOCATOR;

public class ProductDetailPage extends BasePage {

    public  WebDriver driver;

    //T Detay sayfasında olduğumuzu test etmek için detay sayfasına özel SepereEkle butonu varlığı ile kontrol etmeyi düşündüm.

    public ProductDetailPage(WebDriver driver) {
        super(driver);
    }

    public boolean isOnProductPage() {
        return isDisplayed(ADD_TO_CART_BUTTON_LOCATOR); // Bu buton varsa detay sayfasındayız.
    }

    public void addToCart() {
        click(ADD_TO_CART_BUTTON_LOCATOR);
    }


}
