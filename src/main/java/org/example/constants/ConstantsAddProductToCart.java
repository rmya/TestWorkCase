package org.example.constants;

import org.openqa.selenium.By;

public class ConstantsAddProductToCart {

    //CartPage Locator
    public static final By CART_PRODUCT_LOCATOR = By.cssSelector("rd-cart-item-main-info");

    //HomePage Locator
    public static final By CART_COUNT_LOCATOR = By.id("spanCart");
    public static final By CART_CONTAİNER_LOCATOR = new By.ByXPath("/html/body/div[5]/div[2]/div[1]/div[4]/div/div[4]/a");
    public static final By COOKIE_ACCEPT_BUTTON = new By.ByXPath("/html/body/div[2]/div/div[3]/div[2]/div/p[3]/button");

    //ProductDetailPage Locator
    public static final By ADD_TO_CART_BUTTON_LOCATOR = By.id("pd_add_to_cart");

    //ProductsPage Locator
    public static final By SHIPPING_FILTER_LOCATOR = By.id("filter-label");
    public static final By PRODUCT_LOCATOR = new By.ByXPath("//*[@id=\"divModels\"]/div[7]/div/div[1]/");

                //xpath : //*[@id="filter-label"] fullXpath: /html/body/div[5]/div[3]/div[2]/div[5]/div[2]/div[3]/label
                //Xpath : //*[@id="divModels"]/div[7]/div/div[1]/div[3]
                //Xpath: //*[@id="divModels"]/div[7]/div/div[1]/div[1]
                //Xpath: //*[@id="model_2229509_5333870"]/div[2]/div
                //Xpath: //*[@id="model_2229509_5333870"]/div[2]
                //xpath://*[@id="model_2229509_5333870"]/div[2]/div/div[1]

    //SearchBox Locator
    public static final By SEARCH_BOX_LOCATOR = By.id("search_input");
    public static final By SEARCH_BUTTON_LOCATOR = new By.ByXPath("/html/body/div[5]/div[2]/div[3]/div/a[2]");


}
