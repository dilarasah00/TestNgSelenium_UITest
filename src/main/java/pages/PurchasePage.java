package pages;

import utils.locators;
import org.openqa.selenium.WebDriver;

public class PurchasePage extends BasePage{

    public PurchasePage(WebDriver driver){
        super(driver);
    }
    public void ClickCheckoutButton(){
        click(locators.checkout_button_locator);
    }
    public void EnterFirstName(String firstname){
        waitForElementVisible(locators.firstname_input_locator);
        type(locators.firstname_input_locator,firstname);
    }
    public void EnterLastName(String lastname){
        type(locators.lastname_input_locator,lastname);
    }
    public void EnterPostalCode(String postalCode){
        type(locators.postal_code_input_locator,postalCode);
    }
    public void ClickContinueButton(){
        click(locators.continue_button_locator);
    }
    public String CheckPaymentInfo(){
        waitForElementVisible(locators.payment_info_locator);
        return getText(locators.payment_info_locator);
    }
    public String CheckShippingInfo(){
        return getText(locators.shipping_info_locator);
    }
    public String CheckPriceInfo(){
        return getText(locators.price_info_locator);
    }
    public void ClickFinishButton(){
        click(locators.finish_button);
    }
    public String CheckOrderConfirmationMessage(){
        return getText(locators.order_confirmation_message_locator);
    }


}
