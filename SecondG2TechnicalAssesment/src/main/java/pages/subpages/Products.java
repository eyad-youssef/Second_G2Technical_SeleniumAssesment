package pages.subpages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.BasePage;

//import java.time.Duration;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.lang.Thread.sleep;

public class Products extends BasePage {

    private final By categoryTab = By.xpath("/html/body/vf-root/main/section[2]/vf-product-list-page/div[2]/div[2]/div[2]/div[8]");
        private final By item = By.xpath("/html/body/vf-root/main/section[2]/vf-product-list-page/div/div[2]/div[4]/vf-product-box-featured[2]/div/div[3]/div/div[1]/p");
    private final By blackColor = By.xpath("/html/body/vf-root/main/section[2]/vf-middleware/vf-product-details-page/div[2]/div/div/div[1]/div[3]/div[3]/div/div/button[1]");
    private final By blueColor = By.xpath("/html/body/vf-root/main/section[2]/vf-middleware/vf-product-details-page/div[2]/div/div/div[1]/div[3]/div[3]/div/div/button[2]");
    private final By addToCartButton = By.xpath("/html/body/vf-root/main/section[2]/vf-middleware/vf-product-details-page/div[2]/div/div/div[1]/div[3]/div[8]/button[1]");


    public void clickOnCategoryTab() throws InterruptedException {
        waitUntilElementIsClickable(categoryTab).click();
        Thread.sleep(1000);
    }

    public void clickOnItem() throws InterruptedException {
        String name = driver.findElement(By.xpath("/html/body/vf-root/main/section[2]/vf-product-list-page/div/div[2]/div[4]/vf-product-box-featured[2]/div/div[3]/div/div[1]/p")).getText();
        System.out.println(name);
        waitUntilElementIsClickable(item).click();


    }


    public void choose() {

        if (waitUntilElementIsClickable(blackColor).isSelected() && waitUntilElementIsClickable(addToCartButton).isEnabled()) {

            waitUntilElementIsClickable(addToCartButton).click();
        } else if (waitUntilElementIsClickable(blueColor).isSelected() && waitUntilElementIsClickable(addToCartButton).isEnabled()) {

            waitUntilElementIsClickable(addToCartButton).click();
        }


    }
    public Cart goToCart(){
        return  new Cart();
    }





}
