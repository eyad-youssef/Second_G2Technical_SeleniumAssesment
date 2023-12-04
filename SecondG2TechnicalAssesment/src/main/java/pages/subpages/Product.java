package pages.subpages;

import org.openqa.selenium.By;
import pages.BasePage;

public class Product extends BasePage {
    private final By blackColorCheckBox = By.cssSelector(".black.color");
    private final By blueColorCheckBox = By.cssSelector(".blue.color.dreamy");
    private final By addToCartButton = By.cssSelector(".add-to-cart");

    public void choose() throws InterruptedException {
        Thread.sleep(1000);
        if (waitUntilElementIsPresent(blueColorCheckBox).isSelected() && waitUntilElementIsPresent(addToCartButton).isEnabled()) {

            waitUntilElementIsPresent(addToCartButton).click();
            Thread.sleep(1000);
        } else if (waitUntilElementIsPresent(blackColorCheckBox).isSelected() && waitUntilElementIsPresent(addToCartButton).isEnabled()) {

            waitUntilElementIsPresent(addToCartButton).click();
        }else {Thread.sleep(1000);
            waitUntilElementIsPresent(addToCartButton).click();}


    }


    public Cart goToCart() {
        return new Cart();
    }
}
