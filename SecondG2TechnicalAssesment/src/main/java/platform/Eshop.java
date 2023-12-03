package platform;

import pages.HomePage;
import pages.LoginPage;
import pages.subpages.Cart;
import pages.subpages.Products;

public class Eshop {
    public LoginPage login;
    public HomePage home;
    public Products products;
    public Cart cart;


    public Eshop(){
        login = new LoginPage();
    }
}
