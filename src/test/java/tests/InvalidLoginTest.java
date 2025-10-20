package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import org.testng.annotations.DataProvider;

public class InvalidLoginTest extends BaseTest {

    @DataProvider(name = "invalidLoginData")
    public Object[][] provideData(){
        return new Object[][] {
                {"wrong_user","secret_sauce","Epic sadface: Username and password do not match any user in this service"},
                {"","secret_sauce","Epic sadface: Username is required"},
                {"standard_user","wrong_pass","Epic sadface: Username and password do not match any user in this service"},
                {"standard_user","","Epic sadface: Password is required"},

        };
    }

    @Test(dataProvider = "invalidLoginData")
    public void testUnsuccessfulLogin(String username, String password, String errormessage){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUsername(username);
        loginPage.enterPassword((password));
        loginPage.submitLogin();
        String actualErrorMessage = loginPage.getErrorMessage();
        Assert.assertEquals(actualErrorMessage,errormessage);

    }
}
