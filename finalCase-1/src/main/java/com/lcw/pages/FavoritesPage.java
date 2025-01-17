package com.lcw.pages;

import com.lcw.base.BasePage;
import com.lcw.utilities.Log;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class FavoritesPage extends BasePage {

    @FindBy(css = ".product-card__title")
    WebElement productTitleText;

    public FavoritesPage(WebDriver driver) {
        super(driver);
    }

    public void assertProduct() {
        Log.info("Expected Product Title: " + productTitle);
        Log.info("Actual Product Title: " + productTitleText.getText());
        Assert.assertTrue(productTitle.contains(productTitleText.getText()), "Product title is not matching.");
    }
}
