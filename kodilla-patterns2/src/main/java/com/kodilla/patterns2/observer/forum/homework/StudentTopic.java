package com.kodilla.patterns2.observer.forum.homework;

import java.util.List;
import java.util.ArrayList;
public class StudentTopic implements Observable {

    private final List<Mentor> mentors;
    private final List<String> messages;
    private final String name;

    public StudentTopic(String name) {
        mentors = new ArrayList<>();
        messages = new ArrayList<>();
        this.name = name;
    }

    public void addPost(String post){
        messages.add(post);
        notifyMentors();
    }

    @Override
    public void registerMentor(Mentor mentor) {

        mentors.add(mentor);
    }

    @Override
    public void notifyMentors() {
        for(Mentor mentor : mentors){
            mentor.update(this);
        }
    }

    @Override
    public void removeMentor(Mentor mentor) {

        mentors.remove(mentor);
    }

    public List<String> getMessages() {
        return messages;
    }

    public String getName() {
        return name;
    }

}
