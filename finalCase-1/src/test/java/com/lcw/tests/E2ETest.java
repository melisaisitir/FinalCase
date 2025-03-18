package com.lcw.tests;

import com.lcw.base.BaseTest;
import com.lcw.pages.*;
import com.lcw.utilities.Driver;
import org.testng.annotations.Test;

public class E2ETest extends BaseTest {

    @Test
    public void testE2E_LCW() {
        var driver = Driver.getDriver();
        var homePage = new HomePage(driver);
        homePage.navigateToHomePage();
        homePage.acceptCookies();
        homePage.clickLoginDropdown();

        var loginPage = new LoginPage(driver);
        loginPage.enterEmail("******");
        loginPage.clickContinueButton();
        loginPage.enterPassword("******");
//        loginPage.clickLoginButton();

        homePage.navigateToHomePage();
        homePage.selectCoatAndJacketForGirlChild();

        var listingPage = new ListingPage(driver);
        listingPage.addFilter("5-6 Yaş");
        listingPage.addFilter("6 Yaş");
        listingPage.addFilter("6-7 Yaş");
        listingPage.addColorFilter("BEJ");

        listingPage.clickMostPaid();
        listingPage.selectProduct(3);

        var productPage = new ProductPage(driver);
        productPage.selectSize();
        productPage.clickAddCartButton();
        productPage.goToCartPage();

        var cartPage = new CartPage(driver);
        cartPage.checkProductInfo();
        cartPage.increaseQuantity();
        cartPage.addFavorite();
        cartPage.gotoMyFavorites();

        var favoritesPage = new FavoritesPage(driver);
        favoritesPage.assertProduct();
    }
}
