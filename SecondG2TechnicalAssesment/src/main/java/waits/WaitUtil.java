package waits;


import driver.WebDriverSingleton;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.regex.Pattern;

public class WaitUtil {

    final static int waitTime = 100 ;

    public WebElement waitUntilElementIsPresent(By by){
        return new WebDriverWait(WebDriverSingleton.getWebDriver(),
                Duration.ofSeconds(waitTime)).until(ExpectedConditions.presenceOfElementLocated(by));
    }

    public WebElement waitUntilElementIsClickable(By by){
        return new WebDriverWait(WebDriverSingleton.getWebDriver(),
                Duration.ofSeconds(waitTime)).until(ExpectedConditions.elementToBeClickable(by));
    }

    public Alert waitUntilAlertIsPresent(){
        return new WebDriverWait(WebDriverSingleton.getWebDriver(),
                Duration.ofSeconds(waitTime)).until(ExpectedConditions.alertIsPresent());
    }

    public boolean waitUntilTextMatches(By by , Pattern pattern){
        return new WebDriverWait(WebDriverSingleton.getWebDriver(),
                Duration.ofSeconds(waitTime)).until(ExpectedConditions.textMatches(by,pattern));
    }

}
