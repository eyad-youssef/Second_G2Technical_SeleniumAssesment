package platform;

import pages.HomePage;
import pages.LoginPage;
import pages.subpages.Cart;
import pages.subpages.Categories;
import pages.subpages.Product;

public class Eshop {
    public LoginPage login;
    public HomePage home;
    public Categories categories;
    public Cart cart;
    public Product product;


    public Eshop(){
        login = new LoginPage();
    }
}
