package com.kodilla.patterns.strategy.social;

public class User {
    private String name;

    public String sharePost() {
        return "";
    }

    public User(String name) {

        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSocialPublisher(SocialPublisher socialPublisher) {
    }
}
