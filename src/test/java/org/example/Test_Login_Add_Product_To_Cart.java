package org.example;
import org.example.pages.*;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;


public class Test_Add_Product_To_Cart extends BaseTest{

    HomePage homePage;
    LoginPage loginPage;
    ProductsPage productsPage;
    ProductDetailPage productDetailPage;
    CartPage cartPage;

    @Test
    @Order(1)
    public void login(){
        homePage = new HomePage(driver);
        loginPage = new LoginPage(driver);
        homePage.acceptCookies();
        homePage.clickLogIn();
        Assertions.assertTrue(loginPage.isOnLoginPage(),
                "Not on login page!");
    }

    @Test
    @Order(2)
    public void login_requirements(){
        loginPage.sendEmail();
        loginPage.sendPassword();
        loginPage.LoginButton();
        Assertions.assertTrue(homePage.isOnHomePage_withLogin(),
                "Login Failed!");
    }

    @Test
    @Order(3)
    public void search_a_product(){
        productsPage = new ProductsPage(driver);
        homePage.searchBox().search("pantolan");
        Assertions.assertTrue(productsPage.isOnProductPage(),
                "Not on products page!");

    }

    @Test
    @Order(4)
    public void select_a_product(){
        productDetailPage = new ProductDetailPage(driver);
            productsPage.selectProduct(1);
            Assertions.assertTrue(productDetailPage.isOnProductPage(),
                    "Not on product detail page!");
    }

    @Test
    @Order(5)
    public void add_product_to_cart(){
            productDetailPage.addToCart();
            Assertions.assertTrue(homePage.isProductCountUp(),
                    "Product count did not increase");
    }

    @Test
    @Order(6)
    public void go_to_cart(){
        cartPage = new CartPage(driver);
        homePage.goToCart();
        Assertions.assertTrue(cartPage.checkIfProductAdded(),
                "Product was not added to cart");

    }

}
