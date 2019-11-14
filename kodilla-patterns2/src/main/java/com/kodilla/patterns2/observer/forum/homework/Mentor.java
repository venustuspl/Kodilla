package com.kodilla.patterns2.observer.forum.homework;

public class Mentor implements Observer{

    private final String username;
    private int updateCount;

    public Mentor(String username){
        this.username = username;
    }

    public void update(StudentTopic studentTopic){
        System.out.println(username + ": New messages in topic " + studentTopic.getName() + "\n" +
                " (total: " + studentTopic.getMessages().size() + " messages)");
        updateCount++;
    }

    public String getUsername() {
        return username;
    }

    public int getUpdateCount() {

        return updateCount;
    }
}
