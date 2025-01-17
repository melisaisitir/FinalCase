package com.lcw.utilities;

import io.qameta.allure.Allure;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.ByteArrayInputStream;
import java.time.Duration;


public class Driver {
    private static final ThreadLocal<WebDriver> DRIVER = new ThreadLocal<>();
    private static final int IMPLICIT_WAIT = 30;

    public static WebDriver getDriver() {
        if (DRIVER.get() == null) {
            createDriver();
        }
        return DRIVER.get();
    }

    public static void createDriver() {
        var driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(IMPLICIT_WAIT));
        DRIVER.set(driver);
        Log.info("Driver is created.");
    }

    public static void quitDriver() {
        if (DRIVER.get() != null) {
            DRIVER.get().quit();
            DRIVER.remove();
            Log.info("Driver is closed.");
        }
    }

    public static void takeScreenshot() {
        var screenshot = ((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.BYTES);
        Allure.addAttachment("Screenshot ", new ByteArrayInputStream(screenshot));
    }
}
