package pages;

import driver.WebDriverSingleton;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import waits.WaitUtil;

public class BasePage extends WaitUtil {
    protected WebDriver driver = WebDriverSingleton.getWebDriver();

    public WebElement findElement(By element){
        return  driver.findElement(element);

    }
}
