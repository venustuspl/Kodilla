package com.kodilla.spring.portfolio;

public class Board {
    private TaskList toDoList;
    private TaskList inProgressList;
    private TaskList doneList;
    private TaskList myList;


    public Board(TaskList toDoList, TaskList inProgressList, TaskList doneList,TaskList myList) {
        this.toDoList = toDoList;
        this.inProgressList = inProgressList;
        this.doneList = doneList;
        this.myList = myList;
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
    public TaskList getMyList() {
        System.out.println("Zwracam listę getMyList");
        return myList;
    }
}
