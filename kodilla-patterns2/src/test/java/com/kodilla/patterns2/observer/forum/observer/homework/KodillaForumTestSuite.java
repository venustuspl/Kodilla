package com.kodilla.patterns2.observer.forum.observer.homework;

import com.kodilla.patterns2.observer.forum.homework.JavaHelpStudentTopic;
import com.kodilla.patterns2.observer.forum.homework.JavaToolsStudentTopic;
import com.kodilla.patterns2.observer.forum.homework.Mentor;
import com.kodilla.patterns2.observer.forum.homework.StudentTopic;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KodillaForumTestSuite {

        @Test
        public void testUpdate(){
            //Given
            StudentTopic javaHelpForum = new JavaHelpStudentTopic();
            StudentTopic javaToolForum = new JavaToolsStudentTopic();
            Mentor johnSmith = new Mentor("John Smith");
            Mentor ivoneEscobar = new Mentor("Ivone Escobar");

            javaHelpForum.registerMentor(johnSmith);
            javaToolForum.registerMentor(ivoneEscobar);
            javaToolForum.registerMentor(johnSmith);

            //When
            javaHelpForum.addPost("Czy można/warto pod koniec brać 2 tygodnie urlopu żeby przedłużyć sobie kurs?");
            javaHelpForum.addPost("Zapytaj mentora.");
            javaToolForum.addPost("Help pls, my MySQL db doesn't want to work :(");
            javaHelpForum.addPost("Ok. Zapytam.");
            javaToolForum.addPost("When i try to log in I got 'bad credentials' message.");

            assertEquals(5,johnSmith.getUpdateCount());
            assertEquals(2, ivoneEscobar.getUpdateCount());


    }

}
