package com.kodilla.testing.forum.statistics;

import java.util.ArrayList;
import java.util.List;

public class ForumStatistics implements Statistics {
    private double avgUserPosts;
    private double avgUserComents;
    private double avgPostComents;

    public ForumStatistics(Statistics statistics) {

    }


    public void calculateAdvStatistics() {
        this.avgUserPosts = postsCount() / usersNames().size();
        this.avgUserComents = commentsCount() / usersNames().size();
        this.avgPostComents = commentsCount() / postsCount();
    }

    public String showStatistics() {
        return this.avgUserComents + " " + this.avgUserPosts + " " + this.avgPostComents;
    }

    @Override
    public List<String> usersNames() {
        List<String> names = new ArrayList<String>();


        return names;
    }

    @Override
    public int postsCount() {
        return 0;
    }

    @Override
    public int commentsCount() {
        return 0;
    }


}
