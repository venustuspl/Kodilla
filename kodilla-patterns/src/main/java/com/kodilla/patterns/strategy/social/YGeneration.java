package com.kodilla.patterns.strategy.social;

public class YGeneration extends User {
    private SocialPublisher socialPublisher;

    public YGeneration(String name) {

        super(name);
        this.socialPublisher = new FacebookPublisher();
    }

    public String sharePost() {

        return socialPublisher.share();
    }

    public void setSocialPublisher(SocialPublisher socialPublisher) {
        this.socialPublisher = socialPublisher;
    }
}
