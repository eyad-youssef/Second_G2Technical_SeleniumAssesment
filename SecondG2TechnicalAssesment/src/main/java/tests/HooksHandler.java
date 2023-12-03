package tests;


import driver.WebDriverSingleton;
import io.cucumber.java.Before;

public class HooksHandler extends BaseTest {

    @Before(order = 1)
    public void initialize() throws InterruptedException {
        webDriver = WebDriverSingleton.getDriverSingleton();

        webDriver.navigateTo("https://eshop.vodafone.com.eg/en");

    }



}
