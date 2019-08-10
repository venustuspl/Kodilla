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
        if (usersNames().size() > 0) {
            this.avgUserPosts = postsCount() / usersNames().size();
            this.avgUserComents = commentsCount() / usersNames().size();
        } else {
            this.avgUserPosts = 0;
            this.avgUserComents = 0;
        }

        if (postsCount() > 0) {
            this.avgPostComents = commentsCount() / postsCount();
        }
        else {
            this.avgPostComents = 0;
        }
        }

    public String showStatistics() {

        return this.avgUserComents + " " + this.avgUserPosts + " " + this.avgPostComents;
    }

    public double getAvgUserPosts() {
        return avgUserPosts;
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
