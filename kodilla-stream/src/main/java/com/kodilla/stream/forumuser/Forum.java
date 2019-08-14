package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {

    private final List<ForumUser> listForumUser = new ArrayList<>();

    public Forum() {
        List<ForumUser> userList = new ArrayList<>();

        listForumUser.add(new ForumUser(1, "John", 'M', LocalDate.of(2000, 12, 12), 10));
        listForumUser.add(new ForumUser(2, "Jim", 'M', LocalDate.of(2001, 12, 12), 5));
        listForumUser.add(new ForumUser(3, "Hanna", 'F', LocalDate.of(1969, 12, 12), 16));
        listForumUser.add(new ForumUser(4, "Michael", 'M', LocalDate.of(2011, 12, 12), 17));
        listForumUser.add(new ForumUser(5, "Donald", 'M', LocalDate.of(1975, 3, 12), 15));
        listForumUser.add(new ForumUser(6, "Will", 'M', LocalDate.of(0001, 12, 12), 21));
        listForumUser.add(new ForumUser(7, "Becky", 'F', LocalDate.of(1440, 2, 12), 10000));
        listForumUser.add(new ForumUser(8, "Pam", 'F', LocalDate.of(1944, 1, 12), 100));


    }

    public List<ForumUser> getUserList() {

        return new ArrayList<>(listForumUser);
    }

}
