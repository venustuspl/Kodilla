package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;


public class LoggerTestSuite {

    @Test
    public void testGetLastLog() {
        Logger appLogger = Logger.getInstance();
        appLogger.log("Test getLastLog.");

        Assert.assertEquals("Test getLastLog.", appLogger.getLastLog());
    }
}
