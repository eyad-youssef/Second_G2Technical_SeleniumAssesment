package tests;

import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test (priority = 1)
    public void login() throws InterruptedException {
        webDriver.navigateTo("https://eshop.vodafone.com.eg/en");
        browser.eshop.login.clickOnLoginButton();
        browser.eshop.login.enterUsername("01030122389");
        browser.eshop.login.enterPassword("Test@2023");

        browser.eshop.login.clickOnSubmitButton();


    }
    @Test (priority = 2)
    public void search(){
        browser.eshop.home= browser.eshop.login.goHome();
        browser.eshop.home.enterSearchItem("samsung");
        browser.eshop.home.clickOnSearchResult();
    }


    @Test(priority = 3)
 public  void getItem() throws InterruptedException {

     browser.eshop.products = browser.eshop.home.goToProducts();
     browser.eshop.products.clickOnCategoryTab();
     browser.eshop.products.clickOnItem();
     browser.eshop.products.choose();


    }
    @Test(priority = 3)
    public  void goToCartPage() throws InterruptedException {
        browser.eshop.cart=browser.eshop.products.goToCart();
        browser.eshop.cart.clickOnCartButton();
        browser.eshop.cart.clickOnCheckoutButton();
        browser.eshop.cart.clickOnNewAddressButton();
        browser.eshop.cart.chooseCity();
        browser.eshop.cart.chooseDistrict();
        Thread.sleep(1000);
        browser.eshop.cart.enterStreetName("main ST");
        browser.eshop.cart.enterBuildingNo("abcdefg");
        browser.eshop.cart.enterFloorNo("efghjpg");
        browser.eshop.cart.enterAppartmentNo("qwertyuiop[pkjhgfdgh");

    }
}
