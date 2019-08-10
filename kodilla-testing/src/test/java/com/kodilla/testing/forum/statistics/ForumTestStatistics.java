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
    public void testForumStaisticAdvWithMock() {
        //Given
        ForumStatistics statistics = mock(ForumStatistics.class);

        when(statistics.getAvgUserPosts()).thenReturn((double) 25);


        Assert.assertEquals(25.0, statistics.getAvgUserPosts(),0);
    }


}
