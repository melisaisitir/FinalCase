package com.lcw.pages;

import com.lcw.base.BasePage;
import com.lcw.utilities.Log;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;

public class HomePage extends BasePage {
    // Locators
    @FindBy(css = "[class='header-dropdown-toggle']")
    WebElement loginDropdown;
    @FindBy(xpath = "//a[@class='menu-header-item__title' and @href='/cocuk-bebek-h3']")
    WebElement kidsCategory;
    @FindBy(xpath = "//*[contains(text(),\"KIZ ÇOCUK\")]")
    WebElement babyGirlCategory;
    @FindBy(xpath = "//*[@href = '/kiz-cocuk-dis-giyim-t-1010']")
    WebElement coatsAndJackets;
    @FindBy(css = "#cookieseal-banner-accept")
    WebElement acceptCookieBtn;

    // Constructor
    public HomePage(WebDriver driver) {
        super(driver);
    }

    // Methods
    public void navigateToHomePage() {
        driver.get("https://www.lcw.com/");
        Log.info("LCW anasayfaya gidildi.");
    }

    public void acceptCookies() {
        waitMs(1000);
        acceptCookieBtn.click();
    }

    public void clickLoginDropdown() {
        click(loginDropdown);
    }

    public void selectCoatAndJacketForGirlChild() {
        hover(kidsCategory);
        waitMs(200);
        click(babyGirlCategory);
        click(coatsAndJackets);
    }
}
