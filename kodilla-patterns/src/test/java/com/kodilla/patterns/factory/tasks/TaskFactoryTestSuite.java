package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    /*Napisz testy sprawdzające, czy fabryka w poprawny sposób tworzy różne typy zadań.*/

    @Test
    public void testTaskFactory(){

        TaskFactory taskFactory = new TaskFactory();

        Task drivingTask = taskFactory.makeTask(taskFactory.CONSTANT_DrivingTask);

        drivingTask.executeTask();

        Assert.assertEquals("Driving Task",drivingTask.getTaskName());
        Assert.assertEquals(true,drivingTask.isTaskExecuted());

    }
}
