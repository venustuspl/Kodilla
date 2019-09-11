package com.kodilla.patterns.strategy.social;

public class ZGeneration extends User {

    private SocialPublisher socialPublisher;

    public ZGeneration(String name) {

        super(name);
        this.socialPublisher = new SnapchatPublisher();
    }

    public String sharePost() {

        return socialPublisher.share();
    }

    public void setSocialPublisher(SocialPublisher socialPublisher) {
        this.socialPublisher = socialPublisher;
    }
}
