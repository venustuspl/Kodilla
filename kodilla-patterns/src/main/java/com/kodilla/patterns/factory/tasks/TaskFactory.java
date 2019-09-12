package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String DRIVING_TASK = "DrivingTask";
    public static final String PAINTING_TASK = "PaintingTask";
    public static final String SHOPPING_TASK = "ShoppingTask";

    public final Task makeTask(final String taskName) {
        switch (taskName) {
            case DRIVING_TASK:
                return new DrivingTask("Driving Task", "there", "use");
            case PAINTING_TASK:
                return new PaintingTask("Painting Task", "red", "Lake");
            case SHOPPING_TASK:
                return new ShoppingTask("Shopping Task", "all", 5.0);
            default:
                return null;
        }


    }
}
