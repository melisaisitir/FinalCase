package com.lcw.pages;

import com.lcw.base.BasePage;
import com.lcw.utilities.Log;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class CartPage extends BasePage {

    @FindBy(css = ".rd-cart-item-title")
    WebElement productTitleText;

    @FindBy(css = ".rd-cart-item-size strong")
    WebElement productSizeText;

    @FindBy(css = ".rd-cart-item-color strong")
    WebElement productColorText;

    @FindBy(css = ".plus")
    WebElement increaseQuantityBtn;

    @FindBy(css = ".item-quantity-input")
    WebElement quantityInput;

    @FindBy(css = ".rd-cart-add-to-favorite")
    WebElement addFavoriteButton;

    @FindBy(xpath = "//*[@class = 'dropdown-label' and text() = 'Favorilerim']")
    WebElement myFavorites;

    public CartPage(WebDriver driver) {
        super(driver);
        waitMs(2100);
    }

    public void checkProductInfo() {
        waitMs(2000);
        Log.info("Product name: " + productTitleText.getText());
        Log.info("Product size: " + productSizeText.getText());
        Log.info("Product color: " + productColorText.getText());
        Assert.assertEquals(productSeller, productTitleText.getText(), "Product name is not matching.");
        Assert.assertEquals(productSize, productSizeText.getText(), "Product size is not matching.");
        Assert.assertEquals(productColor, productColorText.getText(), "Product color is not matching.");
    }

    public void increaseQuantity() {
        click(increaseQuantityBtn);
        waitMs(3000);
        var value = quantityInput.getDomAttribute("value");
        Assert.assertEquals(value, "2", "Product quantity is not increased.");
        Log.info("Product quantity increased.");
    }

    public void addFavorite() {
        click(addFavoriteButton);
        waitMs(2000);
        Log.info("Product added to favorite.");
    }

    public void gotoMyFavorites() {
        click(myFavorites);
        waitMs(3000);
        Log.info("Go to my favorites page.");
    }
}
