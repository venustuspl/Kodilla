package com.kodilla.patterns.singleton;

public class Logger {

    private String lastLog = "";

    private static Logger loggerEngine = null;

    private Logger(String lastLog) {
        this.lastLog = lastLog;
    }

    public static Logger getInstance() {
        if (loggerEngine == null) {
            loggerEngine = new Logger("");
        }
        return loggerEngine;
    }

    public void log(String log) {
        lastLog = log;
        System.out.println("Log: [" + log + "]");
    }

    public String getLastLog() {

        return lastLog;
    }
}