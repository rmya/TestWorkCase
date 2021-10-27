package org.example;
import org.example.pages.CartPage;
import org.example.pages.HomePage;
import org.example.pages.ProductDetailPage;
import org.example.pages.ProductsPage;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;


public class Test_Add_Product_To_Cart extends BaseTest{

    HomePage homePage;
    ProductsPage productsPage;
    ProductDetailPage productDetailPage;
    CartPage cartPage;

    @Test
    @Order(5)
    public void search_a_product(){
        homePage = new HomePage(driver);
        homePage.acceptCookies();
        productsPage = new ProductsPage(driver);
        homePage.searchBox().search("pantolan");
        Assertions.assertTrue(productsPage.isOnProductPage(),
                "Not on products page!");

    }

    @Test
    @Order(6)
    public void select_a_product(){
        productDetailPage = new ProductDetailPage(driver);
            productsPage.selectProduct(1);
            Assertions.assertTrue(productDetailPage.isOnProductPage(),
                    "Not on product detail page!");
    }

    @Test
    @Order(7)
    public void add_product_to_cart(){
            productDetailPage.addToCart();
            Assertions.assertTrue(homePage.isProductCountUp(),
                    "Product count did not increase");
    }

    @Test
    @Order(8)
    public void go_to_cart(){
        cartPage = new CartPage(driver);
        homePage.goToCart();
        Assertions.assertTrue(cartPage.checkIfProductAdded(),
                "Product was not added to cart");

    }

}
