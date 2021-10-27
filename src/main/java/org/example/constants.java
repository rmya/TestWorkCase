package org.example;

import org.openqa.selenium.By;

public class constants {

    public static final By CLICK_LOG_IN_LOCATOR = By.className("dropdown-toggle");
    public static final By UYE_TITLE_LOCATOR = new By.ByXPath("/html/body/div[5]/div[3]/div/form/div/div/p");
    public static final By HESABIM_LABEL_LOCATOR = new By.ByXPath("/html/body/div[2]/div/div[1]/div/header/div[2]/div/div[3]/div[2]/div[1]/button/span");
    public static final By EMAIL_AREA_LOCATOR = By.id("LoginEmail");
    public static final By PASSWORD_AREA_LOCATOR = By.id("Password");
    public static final By CLICK_BUTTON_LOGIN_LOCATOR = By.id("loginLink");

    //CartPage Locator
    public static final By CART_PRODUCT_LOCATOR = By.cssSelector("rd-cart-item-main-info");
    public static final By CART_EMPTY_TITLE_LOCATOR = new By.ByXPath("/html/body/div[3]/div[3]/div[2]/div[1]/div/div/p[1]");
    public static final By CART_PAYMENT_STEP_BOTTON = new By.ByXPath("/html/body/div[3]/div[3]/div[2]/div[1]/div[2]/div[1]/div[7]/div/a");
    public static final By CART_FIST_REMOVE_BUTTON = new By.ByXPath("/html/body/div[3]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div/a[1]/i");
    public static final By CART_POPUP_REMOVE_BUTTON = By.className("inverted-modal-button sc-delete ins-init-condition-tracking");
            // Sepetten çıkardıklarınız Text div
    public static final By CART_PRODUCT_IS_REMOVED_LOCATOR = new By.ByXPath("/html/body/div[3]/div[3]/div[2]/div[2]/div/div/div/div[1]/div");

    //HomePage Locator
    public static final By CART_COUNT_LOCATOR = By.id("spanCart");
    public static final By CART_CONTAİNER_LOCATOR = new By.ByXPath("/html/body/div[5]/div[2]/div[1]/div[4]/div/div[4]/a");
    public static final By COOKIE_ACCEPT_BUTTON = new By.ByXPath("/html/body/div[2]/div/div[3]/div[2]/div/p[3]/button");

    //ProductDetailPage Locator
    public static final By ADD_TO_CART_BUTTON_LOCATOR = By.id("pd_add_to_cart");

    //ProductsPage Locator
    public static final By SHIPPING_FILTER_LOCATOR = By.id("filter-label");
    public static final By PRODUCT_LOCATOR = new By.ByXPath("//*[@id=\"divModels\"]/div[7]/div/div[1]/");
    public static final By PRODUCT_FOOTER_LOCATOR = new By.ByXPath("/html/body/div[5]/div[4]/div[3]");
    public static final By PRODUCT_SCROLL_CONTROL_LOCATOR = new By.ByXPath("/html/body/div[5]/div[3]/div[2]/div[7]/div/div[4]");
    public static final By SEE_MORE_PRODUCT_BUTTON_LOCATOR = new By.ByXPath("/html/body/div[5]/div[3]/div[2]/div[7]/div/div[4]/a");
    public static final By MORE_PRODUCT_PAGE_INDEX = By.id("pageIndex");
    public static final By PRODUCT_PAGE_PRICE_LOCATOR = By.cssSelector("div.info > div > div.price > div");
    public static final By CART_SLIDER_PRODUCT_PAGE = By.id("cartLastTotal");

    //SearchBox Locator
    public static final By SEARCH_BOX_LOCATOR = By.id("search_input");
    public static final By SEARCH_BUTTON_LOCATOR = new By.ByXPath("/html/body/div[5]/div[2]/div[3]/div/a[2]");

}
