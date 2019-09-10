package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {

    @Test
    public void testDefaultSharingStrategies() {

        User user1 = new Millenials("userT");
        User user2 = new YGeneration("userF");
        User user3 = new ZGeneration("userS");

        Assert.assertEquals(user1.sharePost(), "Publikuję na Twitterze.");
        Assert.assertEquals(user2.sharePost(), "Publikuję na Facebooku.");
        Assert.assertEquals(user3.sharePost(), "Publikuję na Snapie.");
    }

    @Test
    public void testIndividualSharingStrategy() {
        User user1 = new Millenials("userT");
        User user2 = new YGeneration("userF");

        user1.setSocialPublisher(new SnapchatPublisher());
        user2.setSocialPublisher(new TwitterPublisher());

        Assert.assertEquals(user1.sharePost(), "Publikuję na Snapie.");
        Assert.assertEquals(user2.sharePost(), "Publikuję na Twitterze.");
    }
}
