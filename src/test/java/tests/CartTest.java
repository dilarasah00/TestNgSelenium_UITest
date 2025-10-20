package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.LoginPage;

public class CartTest extends BaseTest {

    @Test
    public void testCart(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUsername("standard_user");
        loginPage.enterPassword(("secret_sauce"));
        loginPage.submitLogin();


        CartPage cartPage = new CartPage(driver);
        String  productName = cartPage.getFirstProductName();
        cartPage.addProductToCart();
        cartPage.openCart();
        Assert.assertTrue(cartPage.isCartItemDisplayed());
        Assert.assertTrue(cartPage.isProductInCart(productName));

    }
}

