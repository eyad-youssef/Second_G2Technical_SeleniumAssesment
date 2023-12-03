package tests;

import browser.Browser;
import driver.WebDriverSingleton;
//import waits.WaitUtil;

public class BaseTest  {
    protected static WebDriverSingleton webDriver;
    protected static Browser browser = new Browser();



    public BaseTest(){
        webDriver = WebDriverSingleton.getDriverSingleton();
    }

}
