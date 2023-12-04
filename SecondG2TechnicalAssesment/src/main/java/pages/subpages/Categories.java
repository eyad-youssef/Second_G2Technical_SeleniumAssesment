package pages.subpages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.BasePage;
import static java.lang.Thread.sleep;

public class Categories extends BasePage {

    private final By categoryTab = By.xpath("//*[contains(text(), 'Oppo')]");
    private final By item = By.xpath("//*[starts-with(text(),' OPPO Smart Phone A98 ')]");
    JavascriptExecutor js = (JavascriptExecutor) driver;

    public void clickOnCategoryTab() throws InterruptedException {
        Thread.sleep(100);
       js.executeScript("arguments[0].click();", waitUntilElementIsClickable(categoryTab));
       Thread.sleep(50);
       js.executeScript("arguments[0].click();", waitUntilElementIsClickable(categoryTab));

    }

    public void clickOnItem() throws InterruptedException {
        Thread.sleep(3000);
        js.executeScript("window.scrollBy(0, 500)");
        waitUntilElementIsPresent(item).click();
    }


    public Product goToProduct(){
        return  new Product();
    }





}
