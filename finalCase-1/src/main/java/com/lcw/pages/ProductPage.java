package com.lcw.pages;

import com.lcw.base.BasePage;
import com.lcw.utilities.Log;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ProductPage extends BasePage {
    // Locators
    @FindBy(css = ".option-box:enabled")
    List<WebElement> sizes;

    @FindBy(css = ".add-to-card")
    WebElement addCartButton;

    @FindBy(css = "h1.product-title")
    WebElement productTitleText;

    @FindBy(css = ".seller-name")
    WebElement productSellerName;

    @FindBy(css = ".color-option.active [title]")
    WebElement productColorElement;

    @FindBy(xpath = "//*[@class='dropdown-label' and text() = 'Sepetim']")
    WebElement cartButton;
    
    public ProductPage(WebDriver driver) {
        super(driver);
    }

    public void selectSize() {
        waitMs(3000);
        driver.navigate().refresh();
        waitMs(2000);
        click(sizes.get(0));
        Log.info("Select 1. available size");
    }

    public void clickAddCartButton() {
        waitMs(1000);
        saveProductInfo();
        click(addCartButton);
        Log.info("Click Add to Cart button");
        waitMs(1000);
    }

    public void goToCartPage() {
        click(cartButton);
        Log.info("Click Cart button");
    }

    private void saveProductInfo() {
        productTitle = productTitleText.getText();
        productSeller = productSellerName.getText();
        productColor = productColorElement.getDomAttribute("title");
        productSize = sizes.get(0).getText();
    }
}
