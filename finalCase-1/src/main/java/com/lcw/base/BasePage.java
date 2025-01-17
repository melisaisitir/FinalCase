package com.lcw.base;

import org.jetbrains.annotations.NotNull;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import com.lcw.utilities.Log;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public abstract class BasePage {
    protected WebDriver driver;
    protected WebDriverWait wait;

    protected static String productTitle;
    protected static String productSeller;
    protected static String productColor;
    protected static String productSize;

    // Constructor: BaseTest'ten WebDriver'ı alır
    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        PageFactory.initElements(this.driver, this); // Elementleri başlatır
    }

    protected void click(@NotNull WebElement element) {
        var text = element.getText();
        scrollToCenter(element);
        element.click();
        Log.info("Element clicked: " + text);
    }

    protected void hover(WebElement element) {
        new Actions(driver).moveToElement(element).perform();
        Log.info("Element hovered: " + element.getText());
    }

    protected void scrollToCenter(WebElement element) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block: 'center', inline: 'nearest'});", element);
    }

    protected void waitMs(int milliSeconds) {
        try {
            Thread.sleep(milliSeconds);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
