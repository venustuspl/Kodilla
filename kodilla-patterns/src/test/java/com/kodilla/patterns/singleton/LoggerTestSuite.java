package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

import java.util.TimeZone;


public class LoggerTestSuite {

    @Test
    public void testGetLastLog() {
        Logger appLogger = Logger.getInstance();
        appLogger.log("Test getLastLog.");

        Assert.assertEquals("Test getLastLog.", appLogger.getLastLog());
        System.out.println(TimeZone.getDefault().getID());

    }
}
