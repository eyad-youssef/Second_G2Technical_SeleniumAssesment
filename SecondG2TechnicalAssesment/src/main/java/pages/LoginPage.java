package pages;

import org.openqa.selenium.By;

public class LoginPage extends BasePage{


    private final By loginButton = By.xpath("//*[@id='userProfileMenu']");
    private final By userNameTextField = By.name("username");
    private final By passwordTextField = By.id("password");



    public void clickOnLoginButton() {

        waitUntilElementIsPresent(loginButton).click();

    }

    public void enterUsername(String username) {
        waitUntilElementIsPresent(userNameTextField).sendKeys(username);

    }

    public void enterPassword(String password) {
        waitUntilElementIsPresent(passwordTextField).sendKeys(password);

    }

    public void clickOnSubmitButton() {
         final By submitButton = By.id("submitBtn");

        waitUntilElementIsClickable(submitButton).click();

    }

    public HomePage goHome(){

        return new HomePage();
    }



}
