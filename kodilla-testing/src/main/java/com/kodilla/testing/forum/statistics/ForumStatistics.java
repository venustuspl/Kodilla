package com.kodilla.testing.forum.statistics;

import java.util.ArrayList;
import java.util.List;

public class ForumStatistics {

    Statistics statistics;
    private double avgUserPosts;
    private double avgUserComents;
    private double avgPostComents;


    public ForumStatistics(Statistics statistics) {

    }


    public void calculateAdvStatistics(Statistics statistics) {
        if (statistics.usersNames().size() > 0) {
            this.avgUserPosts = (double)statistics.postsCount() / statistics.usersNames().size();
            this.avgUserComents = (double)statistics.commentsCount() / statistics.usersNames().size();
        } else {
            this.avgUserPosts = 0;
            this.avgUserComents = 0;
        }

        if (statistics.postsCount() > 0) {

            this.avgPostComents = (double)statistics.commentsCount() / statistics.postsCount();
        } else {
            this.avgPostComents = 0;
        }
    }

    public String showStatistics() {

        return this.avgUserComents + " " + this.avgUserPosts + " " + this.avgPostComents;
    }

    public double getAvgUserPosts() {
        return this.avgUserPosts;
    }

    public double getAvgUserComents() {
        return this.avgUserComents;
    }

    public double getAvgPostComents() {
        return this.avgPostComents;
    }
/*
    public List<String> usersNames() {
        List<String> names = new ArrayList<String>();


        return names;
    }

    public int postsCount() {
        return 0;
    }

    public int commentsCount() {
        return 0;
    }
*/

}
