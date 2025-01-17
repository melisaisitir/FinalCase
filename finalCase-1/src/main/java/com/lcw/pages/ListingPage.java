package com.lcw.pages;

import com.lcw.base.BasePage;
import com.lcw.utilities.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ListingPage extends BasePage {
    @FindBy(css = ".quick-filters__item--top-selling")
    WebElement mostPaid;
    @FindBy(css = ".product-card")
    List<WebElement> products;

    public ListingPage(WebDriver driver) {
        super(driver);
    }

    public void addFilter(String filter) {
        var xpath = "//*[@class='filter-option__text' and text() = '" + filter + "']";
        click(driver.findElement(By.xpath(xpath)));
        waitMs(3000);
    }

    public void addColorFilter(String color) {
        var xpath = "//*[@class='color-filter-option__text' and text() = '" + color + "']";
        click(driver.findElement(By.xpath(xpath)));
        waitMs(3000);
    }

    public void clickMostPaid() {
        click(mostPaid);
        Log.info("Click Order Dropdown");
        waitMs(3000);
    }

    public void selectProduct(int index) {
        click(products.get(index));
        Log.info("Click " + index + ". Product");
    }
}

