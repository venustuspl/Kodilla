package com.kodilla.testing.forum.statistics;
import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ForumTestStatistics {

    @Test
    public void testCalculateForecastWithMock() {
        //Given
        Statistics statistics = mock(Statistics.class);

        //when(statistics.usersNames()).thenReturn();

        when(statistics.commentsCount()).thenReturn(10);

        when(statistics.postsCount()).thenReturn(20);

        ForumStatistics forumStatistics = new ForumStatistics(statistics);



        //When
        int users = forumStatistics.usersNames().size();
        //double usersPosts = forumStatistics. ;
        //double usersComments = forumStatistics.commentsCount();
        //double postComments = forumStatistics.
        //Then
        Assert.assertEquals(3, users);
    }
}
