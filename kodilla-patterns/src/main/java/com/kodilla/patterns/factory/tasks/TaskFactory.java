package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String DrivingTask = "DrivingTask";
    public static final String PaintingTask = "PaintingTask";
    public static final String ShoppingTask = "ShoppingTask";

    public final Task makeTask(final String taskName) {
        switch (taskName) {
            case DrivingTask:
                return new DrivingTask("Driving Task", "there", "use");
            case PaintingTask:
                return new PaintingTask("Painting Task", "red", "Lake");
            case ShoppingTask:
                return new ShoppingTask("Shopping Task", "all", 5.0);
            default:
                return null;
        }


    }
}
