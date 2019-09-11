package com.kodilla.patterns.strategy.social;

public class Millenials extends User {
    private SocialPublisher socialPublisher;

    public Millenials(String name) {

        super(name);
        this.socialPublisher = new TwitterPublisher();
    }

    public String sharePost() {
        return socialPublisher.share();
    }

    public void setSocialPublisher(SocialPublisher socialPublisher) {
        this.socialPublisher = socialPublisher;
    }
}
