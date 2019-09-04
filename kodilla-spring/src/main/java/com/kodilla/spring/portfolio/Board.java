package com.kodilla.spring.portfolio;

public class Board {
    private TaskList toDoList;
    private TaskList inProgressList;
    private TaskList doneList;


    public Board(TaskList toDoList, TaskList inProgressList, TaskList doneList) {
        this.toDoList = toDoList;
        this.inProgressList = inProgressList;
        this.doneList = doneList;
    }

    public TaskList getInProgressList() {
        System.out.println("Zwracam listę inProgressList");
        return inProgressList;
    }

    public TaskList getToDoList() {
        System.out.println("Zwracam listę goToDoList");
        return toDoList;
    }

    public TaskList getDoneList() {
        System.out.println("Zwracam listę getDoneList");
        return doneList;
    }
}
