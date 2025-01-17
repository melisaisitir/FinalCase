package com.lcw.base;

import com.lcw.utilities.Driver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class BaseTest {

    @BeforeMethod
    public void setUp() {
        Driver.createDriver();
    }

    @AfterMethod
    public void tearDown() {
        Driver.takeScreenshot();
        Driver.quitDriver();
    }
}
