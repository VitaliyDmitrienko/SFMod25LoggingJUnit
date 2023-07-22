// Module 25. Exercise 25.6 Logback

package org.example;

import ch.qos.logback.classic.Logger;
import org.slf4j.LoggerFactory;

public class LogTester{

    private static final Logger logger = (Logger) LoggerFactory.getLogger(LogTester.class);

    public static void main(String[] args) {
        logger.info("Test log from {}", LogTester.class.getSimpleName());
    }
}