package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String CONSTANT_DrivingTask = "DrivingTask";
    public static final String CONSTANT_PaintingTask = "PaintingTask";
    public static final String CONSTANT_ShoppingTask = "ShoppingTask";

    public final Task makeTask(final String taskName) {
        switch (taskName) {
            case CONSTANT_DrivingTask:
                return new DrivingTask("Driving Task", "there", "use");
            case CONSTANT_PaintingTask:
                return new PaintingTask("Painting Task", "red", "Lake");
            case CONSTANT_ShoppingTask:
                return new ShoppingTask("Shopping Task", "all", 5.0);
            default:
                return null;
        }


    }
}
