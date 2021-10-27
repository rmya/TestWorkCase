package org.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.stream.IntStream;

import static org.example.constants.*;

public class ProductsPage extends BasePage {

    public  WebDriver driver;

    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    public boolean isOnProductPage() {
        //Product sayfasında olup olmadığımızı anlamak için Product sayfasına özgü Filtre Locater eklemeyi düşündüm.
        return isDisplayed(SHIPPING_FILTER_LOCATOR);
    }

    public void selectProduct(int i) {
        getAllProducts().get(i).click();
    }

    private List<WebElement> getAllProducts() {
        return findAll(PRODUCT_LOCATOR);
    }

    public void scrollToProductPage() {
        //Scroll yapılması için DahaFazlaÜrün butonu div class
        find(PRODUCT_SCROLL_CONTROL_LOCATOR);
    }

    public boolean isOnScrollingPage() {
        //Scroll başarılı ise footer konrolü
        return isDisplayed(PRODUCT_FOOTER_LOCATOR);
    }

    public void moreProduct() {
        click(SEE_MORE_PRODUCT_BUTTON_LOCATOR);
    }

    public boolean isClickedMoreProduct() {
        //Daha fazla ürüne tıklandıkça pageIndex artıyor.
        if(MORE_PRODUCT_PAGE_INDEX.toString().charAt(1) > 1){  // ?
            return true;
        }else{
            return false;
        }
    }

    public void controlProductPrice() {
       int pagePrice = PRODUCT_PAGE_PRICE_LOCATOR.toString().charAt(1);  //?
       int  pageCartPrice = CART_SLIDER_PRODUCT_PAGE.toString().charAt(1);
    }

    public boolean checkPriceIsEqual() {
        return true;   //?
    }

}
