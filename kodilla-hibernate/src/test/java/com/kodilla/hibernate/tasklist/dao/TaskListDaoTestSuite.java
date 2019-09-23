package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Optional;


@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListDaoTestSuite {

    @Autowired
    private TaskListDao taskListDao;
    private static final String DESCRIPTION = "TEST ZAWARTOŚCI LISTY";
    private static final String LISTNAME = "NAZWA LISTY";

    @Test
    public void testFindByListName() {
        
        //Given
        TaskList taskList = new TaskList(LISTNAME, DESCRIPTION);

        //When
        taskListDao.save(taskList);

        //Then
        int id = taskList.getId();
        List<TaskList> readTaskList = taskListDao.findByListName("NAZWA LISTY");
        Assert.assertEquals(1, readTaskList.size());

        //CleanUp
        taskListDao.deleteById(id);
    }
}
