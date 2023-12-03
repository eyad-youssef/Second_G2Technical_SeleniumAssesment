package driver;



//import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class WebDriverSingleton {
    private static WebDriver webDriver;
    private static WebDriverSingleton webDriverSingleton = null;

    private WebDriverSingleton() {
        setDriverCapabilities();
    }

    public static WebDriverSingleton getDriverSingleton() {
        if (webDriverSingleton == null)
            webDriverSingleton = new WebDriverSingleton();
        return webDriverSingleton;
    }

    private void setDriverCapabilities() {

        EdgeOptions options = new EdgeOptions();
//        options.addArguments("user-data-dir=C:/Users/AbdAllahE2/AppData/Local/Google/Chrome/User Data");
        options.setAcceptInsecureCerts(true);
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("start-maximized");
        options.addArguments("disable-infobars");
//        options.addArguments("--disable-extensions");
//        options.addArguments("--enable-javascript");

        webDriver = new EdgeDriver(options);
    }

    public static WebDriver getWebDriver() {
        return webDriver;
    }

    public void navigateTo(String link) throws InterruptedException {
        webDriver.navigate().to(link);


    }

//    public void signin() throws InterruptedException {
////        Thread.sleep(300);
//        webDriver.findElement(By.xpath("//input[@type='email']")).sendKeys("eyad.abdallah@vodafone.com");
//        webDriver.findElement(By.xpath("//*[@id='idSIButton9']")).click();
//        webDriver.findElement(By.xpath("//*[@id='i0118']")).sendKeys("`hj_HGw,hvd_35");
//        webDriver.findElement(By.xpath("//*[@id=\"idSIButton9\"]")).click();
//        webDriver.findElement(By.xpath("//*[@id=\"idSIButton9\"]")).click();
//    }


    public void refreshCurrentUrl() {
        webDriver.navigate().refresh();
    }

    public void resetCache() {
        webDriver.manage().deleteAllCookies();
    }

    public static void close() {
        webDriver.quit();
    }
}
