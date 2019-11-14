package com.kodilla.patterns2.observer.forum.homework;

public interface Observable {
    void registerMentor(Mentor mentor);
    void notifyMentors();
    void removeMentor(Mentor mentor);
}
