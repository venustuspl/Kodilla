package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Configuration
public class BoardConfig {

    @Qualifier("getToDoList")
    @Autowired
    private TaskList taskList;

    @Bean
    public Board getBoard() {

        return new Board(taskList, taskList, taskList);
    }

    @Bean(name = "getToDoList")
    @Scope("prototype")
    public TaskList getToDoList() {

        return new TaskList();
    }

    @Bean(name = "getInProgressList")
    @Scope("prototype")
    public TaskList getInProgressList() {

        return new TaskList();
    }

    @Bean(name = "getDoneList")
    @Scope("prototype")
    public TaskList getDoneList() {

        return new TaskList();
    }

}
