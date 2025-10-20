package pages;

import utils.locators;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage{

    public LoginPage(WebDriver driver){
        super(driver);
    }

    public void enterUsername(String userName){
        type(locators.username_input_locator,userName);
    }
    public void enterPassword(String password) {
        type(locators.password_input_locator, password);
    }
    public void submitLogin(){
        click(locators.login_button_locator);
    }
    public String getErrorMessage() {return getText(locators.error_message_locator);}
}
