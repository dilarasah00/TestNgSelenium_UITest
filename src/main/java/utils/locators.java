package utils;

import org.openqa.selenium.By;

public class locators {

    public static final By username_input_locator = By.id("user-name");
    public static final By password_input_locator = By.id("password");
    public static final By login_button_locator = By.id("login-button");
    public static final By error_message_locator = By.cssSelector("h3[data-test='error']");
    public static final By inventory_item_name_locator = By.id("item_4_title_link");
    public static final By add_to_cart_backpack_locator = By.id("add-to-cart-sauce-labs-backpack");
    public static final By shopping_cart_link_locator = By.className("shopping_cart_link");
    public static final By cart_item_locator = By.cssSelector("[data-test='inventory-item']");
    public static final By inventory_item_name_locator_in_cart = By.className("inventory_item_name");
    public static final By checkout_button_locator = By.id("checkout");
    public static final By firstname_input_locator = By.id("first-name");
    public static final By lastname_input_locator = By.id("last-name");
    public static final By postal_code_input_locator = By.id("postal-code");
    public static final By continue_button_locator = By.id("continue");
    public static final By finish_button = By.id("finish");
    public static final By payment_info_locator = By.xpath("/html/body/div/div/div/div[2]/div/div[2]/div[1]");
    public static final By shipping_info_locator = By.cssSelector("[data-test='shipping-info-label']");
    public static final By price_info_locator = By.cssSelector("[data-test='total-info-label']");
    public static final By order_confirmation_message_locator = By.className("complete-header");
}
