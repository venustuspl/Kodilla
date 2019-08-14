package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {
    final private int id;
    final private String userName;
    final private Character sex;
    final private LocalDate birthday;
    private int postCount;

    public ForumUser(final int id,final String userName,final Character sex,final LocalDate birthday,final int postCount) {
        this.id = id;
        this.userName = userName;
        this.sex = sex;
        this.birthday = birthday;
        this.postCount = postCount;
    }

    public int getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public Character getSex() {
        return sex;
    }

    public LocalDate getBirthday() {
        return birthday;
    }


    public int getPostCount() {
        return postCount;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", sex=" + sex +
                ", birthday=" + birthday +
                ", postCount=" + postCount +
                '}';
    }

}
