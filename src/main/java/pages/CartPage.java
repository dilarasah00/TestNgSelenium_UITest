package pages;

import utils.locators;
import org.openqa.selenium.WebDriver;

public class CartPage extends BasePage{

    public CartPage(WebDriver driver){super( driver);}

    public  String getFirstProductName(){
        return getText(locators.inventory_item_name_locator);
    }

    public void addProductToCart(){
        click(locators.add_to_cart_backpack_locator);
    }

    public void openCart(){
        click(locators.shopping_cart_link_locator);
    }

    public boolean isProductInCart(String productName){
        String item = getText(locators.inventory_item_name_locator_in_cart);
        return item.equals(productName);
    }

    public boolean isCartItemDisplayed(){
        return waitForElementVisible(locators.cart_item_locator).isDisplayed();
    }

}
