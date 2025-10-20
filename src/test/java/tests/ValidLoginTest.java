package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

public class ValidLoginTest extends BaseTest {

    @Test
    public void testSuccessfulLogin(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUsername("standard_user");
        loginPage.enterPassword(("secret_sauce"));
        loginPage.submitLogin();

        String currentUrl = loginPage.getCurrentUrl();
        Assert.assertEquals(currentUrl,"https://www.saucedemo.com/inventory.html");
    }
}
