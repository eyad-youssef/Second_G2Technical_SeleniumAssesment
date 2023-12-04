package pages;

import org.openqa.selenium.By;
import pages.subpages.Categories;

public class HomePage extends BasePage {
    private final By searchBar = By.id("searchInput");
    private final By searchResult = By.xpath("/html/body/vf-root/main/section[1]/vf-nav-bar/nav/div/div[2]/vf-search-engine/div[1]/div[2]/div[5]/div/div[1]");



    public void enterSearchItem(String searchItem) {
        waitUntilElementIsPresent(searchBar).sendKeys(searchItem);

    }

    public void clickOnSearchResult() {

        waitUntilElementIsClickable(searchResult).click();


    }
    public Categories goToProducts(){
 return  new Categories();
    }









}
