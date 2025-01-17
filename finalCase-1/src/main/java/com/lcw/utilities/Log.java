package com.lcw.utilities;

import io.qameta.allure.Allure;

import java.util.logging.Logger;

public class Log {
    private static final Logger logger = Logger.getLogger("Log");

    public static void info(Object message) {
        Allure.step(message.toString());
        logger.info(message.toString());
    }
}
