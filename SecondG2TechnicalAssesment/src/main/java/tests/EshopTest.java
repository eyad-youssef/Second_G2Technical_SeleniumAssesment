package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class EshopTest extends BaseTest {

    @Test(priority = 1)

    public void login() throws InterruptedException {
        webDriver.navigateTo("https://eshop.vodafone.com.eg/en");
        Thread.sleep(1000);
        browser.eshop.login.clickOnLoginButton();
        browser.eshop.login.enterUsername("01030122389");
        browser.eshop.login.enterPassword("Test@2023");
        browser.eshop.login.clickOnSubmitButton();


    }

    @Test(priority = 2)
    public void search() {
        browser.eshop.home = browser.eshop.login.goHome();
        browser.eshop.home.enterSearchItem("samsung ");
        browser.eshop.home.clickOnSearchResult();
    }


    @Test(priority = 3)
    public void getItem() throws InterruptedException {
        browser.eshop.categories = browser.eshop.home.goToProducts();
        browser.eshop.categories.clickOnCategoryTab();
        Thread.sleep(2000);

        browser.eshop.categories.clickOnItem();
        browser.eshop.product = browser.eshop.categories.goToProduct();
        browser.eshop.product.choose();
    }

    @Test
    public void goToCartPage() throws InterruptedException {
        browser.eshop.cart = browser.eshop.product.goToCart();
        browser.eshop.cart.clickOnCartButton();
        browser.eshop.cart.clickOnCheckoutButton();
        browser.eshop.cart.clickOnNewAddressButton();
    }

    @Test


    public void enterAddressDetails() throws InterruptedException {
        browser.eshop.cart.chooseCity();
        browser.eshop.cart.chooseDistrict();
        Thread.sleep(1000);
        browser.eshop.cart.enterStreetName("main ST");
        browser.eshop.cart.enterBuildingNo("abcdefg");
        Assert.assertEquals(browser.eshop.cart.getBuildingNoErrorHint(), "Max characters allowed: 4 ");
        browser.eshop.cart.enterFloorNo("efghjpg");
        Assert.assertEquals(browser.eshop.cart.getFloorNoErrorHint(), "Max characters allowed: 4 ");
        browser.eshop.cart.enterAppartmentNo("qwertyuiop[pkjhgfdgh");
        Assert.assertEquals(browser.eshop.cart.getApartmentNoErrorHint(), "Max characters allowed: 10 ");
        Assert.assertEquals(browser.eshop.cart.getSaveAddressButtonStatus(), "disabled");
    }
}
