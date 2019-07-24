package com.example.guessgame;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class Scores extends RealmObject {
    @PrimaryKey
    private long uuid;
    private String userName;
    private String userGame;
    private long score;

    public Scores(){

    }

    public long getScore() {
        return score;
    }

    public void setScore(long score) {
        this.score = score;
    }


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserGame() {
        return userGame;
    }

    public void setUserGame(String userGame) {
        this.userGame = userGame;
    }
}
