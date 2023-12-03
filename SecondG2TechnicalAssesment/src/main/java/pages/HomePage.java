package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.subpages.Products;
import platform.Eshop;

import java.util.List;

public class HomePage extends BasePage {


//    public Products shopPage(){
//        return  new Products();
//    }

    private final By searchBar = By.id("searchInput");
    private final By searchResult = By.xpath("/html/body/vf-root/main/section[1]/vf-nav-bar/nav/div/div[2]/vf-search-engine/div[1]/div[2]/div[5]/div/div[1]");



    public void enterSearchItem(String searchItem) {
        waitUntilElementIsPresence(searchBar).sendKeys(searchItem);

    }

    public void clickOnSearchResult() {

        waitUntilElementIsClickable(searchResult).click();


    }
    public Products goToProducts(){
 return  new Products();
    }









}
