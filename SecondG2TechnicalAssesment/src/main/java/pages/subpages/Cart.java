package pages.subpages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import pages.BasePage;

public class Cart extends BasePage {
    private final By cartButton = By.className("cart-btn");
    private final By checkoutButton = By.className("checkout-btn");
    private final By newAddressButton = By.className("add-address");
    private final By cityDropDown = By.xpath("/html/body/vf-root/main/section[2]/vf-home/section/vf-shipping/section/div[2]/div/div/div[1]/div/form/div[1]/div[1]/select");
    private final By districtDropDown = By.xpath("/html/body/vf-root/main/section[2]/vf-home/section/vf-shipping/section/div[2]/div/div/div[1]/div/form/div[1]/div[2]/select");
    private final By streetNameTextField = By.xpath("//*[@formcontrolname='streeName']");
    private final By buildingNoTextField = By.xpath("//*[@formcontrolname='buildingNo']");
    private final By floorNoTextField = By.xpath("//*[@formcontrolname='floorNo']");
    private final By apartmentNoTextField = By.xpath("//*[@formcontrolname='Apartment No.']");

    public void clickOnCartButton() throws InterruptedException {
        Thread.sleep(3000);
        waitUntilElementIsClickable(cartButton).click();
    }

    public void clickOnCheckoutButton() throws InterruptedException {

        Thread.sleep(3000);
        waitUntilElementIsClickable(checkoutButton).click();


    }

    public void clickOnNewAddressButton() throws InterruptedException {


        waitUntilElementIsClickable(newAddressButton).click();


    }

    public void chooseCity() {
        Select select = new Select(waitUntilElementIsClickable(cityDropDown));
        select.deselectByIndex(2);
    }

    public void chooseDistrict() {
        Select select = new Select(waitUntilElementIsClickable(districtDropDown));
        select.deselectByIndex(2);
    }

    public void enterStreetName(String name) {
        waitUntilElementIsClickable(streetNameTextField).sendKeys(name);

    }

    public void enterBuildingNo(String name) {
        waitUntilElementIsClickable(buildingNoTextField).sendKeys(name);

    }

    public void enterFloorNo(String name) {
        waitUntilElementIsClickable(floorNoTextField).sendKeys(name);

    }

    public void enterAppartmentNo(String name) {
        waitUntilElementIsClickable(apartmentNoTextField).sendKeys(name);

    }


}
