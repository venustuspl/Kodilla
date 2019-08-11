package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ForumTestStatistics {

    @Test
    public void testForumStaisticUserNamesWithMock() {
        //Given
        Statistics statistics = mock(Statistics.class);
        List<String> names = new ArrayList<String>();
        names.add("Tomek");
        names.add("Adam");
        names.add("Maciek");


        when(statistics.usersNames()).thenReturn(names);

        Assert.assertEquals(3, statistics.usersNames().size());

    }

    @Test
    public void testForumStaisticComentsCountWithMock() {
        //Given
        Statistics statistics = mock(Statistics.class);

        when(statistics.commentsCount()).thenReturn(20);


        Assert.assertEquals(20, statistics.commentsCount());

    }

    @Test
    public void testForumStaisticPostCountWithMock() {
        //Given
        Statistics statistics = mock(Statistics.class);

        when(statistics.postsCount()).thenReturn(25);


        Assert.assertEquals(25, statistics.postsCount());
    }

    @Test
    public void testForumStaisticAdvWithMockZeroPost() {
        //Given
        Statistics statistics = mock(Statistics.class);
        when(statistics.postsCount()).thenReturn(0);
        List<String> names = new ArrayList<String>();
        when(statistics.usersNames()).thenReturn(names);
        ForumStatistics forumStatistics = new ForumStatistics(statistics);
        forumStatistics.calculateAdvStatistics(statistics);


        Assert.assertEquals(0, forumStatistics.getAvgUserPosts(), 0);
    }

    @Test
    public void testForumStaisticAdvWithMock1000Post() {
        //Given
        Statistics statistics = mock(Statistics.class);
        when(statistics.postsCount()).thenReturn(1000);
        List<String> names = new ArrayList<String>();
        names.add("T1000");
        when(statistics.usersNames()).thenReturn(names);
        ForumStatistics forumStatistics = new ForumStatistics(statistics);
        forumStatistics.calculateAdvStatistics(statistics);


        Assert.assertEquals(1000, forumStatistics.getAvgUserPosts(), 0);
    }

    @Test
    public void testForumStaisticAdvWithMockZeroComments() {
        //Given
        Statistics statistics = mock(Statistics.class);
        when(statistics.commentsCount()).thenReturn(0);
        List<String> names = new ArrayList<String>();
        names.add("T");
        when(statistics.usersNames()).thenReturn(names);
        ForumStatistics forumStatistics = new ForumStatistics(statistics);
        forumStatistics.calculateAdvStatistics(statistics);


        Assert.assertEquals(0, forumStatistics.getAvgUserComents(), 0);
    }

    @Test
    public void testForumStaisticAdvWithMockCommentsMoreThanPosts() {
        //Given
        Statistics statistics = mock(Statistics.class);
        when(statistics.commentsCount()).thenReturn(1000);
        when(statistics.postsCount()).thenReturn(500);

        List<String> names = new ArrayList<String>();
        names.add("T");
        when(statistics.usersNames()).thenReturn(names);
        ForumStatistics forumStatistics = new ForumStatistics(statistics);
        forumStatistics.calculateAdvStatistics(statistics);


        Assert.assertEquals(2, forumStatistics.getAvgPostComents(), 0);
    }

    @Test
    public void testForumStaisticAdvWithMockPostsMoreThanComments() {
        //Given
        Statistics statistics = mock(Statistics.class);
        when(statistics.commentsCount()).thenReturn(300);
        when(statistics.postsCount()).thenReturn(900);

        List<String> names = new ArrayList<String>();
        names.add("T");
        when(statistics.usersNames()).thenReturn(names);
        ForumStatistics forumStatistics = new ForumStatistics(statistics);
        forumStatistics.calculateAdvStatistics(statistics);


        Assert.assertEquals(3, forumStatistics.getAvgPostComents(), 0);
    }

    @Test
    public void testForumStaisticAdvWithMockZeroUsers() {
        //Given
        Statistics statistics = mock(Statistics.class);
        when(statistics.commentsCount()).thenReturn(300);
        when(statistics.postsCount()).thenReturn(150);

        List<String> names = new ArrayList<String>();

        when(statistics.usersNames()).thenReturn(names);
        ForumStatistics forumStatistics = new ForumStatistics(statistics);
        forumStatistics.calculateAdvStatistics(statistics);


        Assert.assertEquals(0, forumStatistics.getAvgUserComents(), 0);
    }

    @Test
    public void testForumStaisticAdvWithMock1000Users() {
        //Given
        Statistics statistics = mock(Statistics.class);
        when(statistics.commentsCount()).thenReturn(300);
        when(statistics.postsCount()).thenReturn(150);

        List<String> names = new ArrayList<String>();
        for (int i=0; i < 999; i++) {
            names.add("T" + i);
        }
        when(statistics.usersNames()).thenReturn(names);
        ForumStatistics forumStatistics = new ForumStatistics(statistics);
        forumStatistics.calculateAdvStatistics(statistics);


        Assert.assertEquals(0, forumStatistics.getAvgUserComents(), 0);
    }


}
