package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.LoginPage;
import pages.PurchasePage;

public class PurchaseTest extends BaseTest {

    @Test
    public void testPurchaseProcess()  {

        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUsername("standard_user");
        loginPage.enterPassword(("secret_sauce"));
        loginPage.submitLogin();

        CartPage cartPage = new CartPage(driver);
        cartPage.addProductToCart();
        cartPage.openCart();

        PurchasePage purchasePage = new PurchasePage(driver);
        purchasePage.ClickCheckoutButton();
        purchasePage.EnterFirstName("TestName");
        purchasePage.EnterLastName("TestLastName");
        purchasePage.EnterPostalCode("123");

        purchasePage.ClickContinueButton();

        Assert.assertEquals(purchasePage.CheckPaymentInfo(), "Payment Information:");
        Assert.assertEquals(purchasePage.CheckShippingInfo(), "Shipping Information:");
        Assert.assertEquals(purchasePage.CheckPriceInfo(), "Price Total");

        purchasePage.ClickFinishButton();
        Assert.assertEquals(purchasePage.CheckOrderConfirmationMessage(), "Thank you for your order!");

    }
}
