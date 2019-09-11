package com.kodilla.patterns.factory.tasks;

public interface Task {

    public void executeTask();// — wykonującą zadanie,

    public String getTaskName();// — zwracającą nazwę zadania do wykonania,

    public boolean isTaskExecuted();// — zwracającą true lub false, w zależności od tego, czy zadanie jest już wykonane.
}
