package com.example.yuanyuanzhou.weball;

public class Game {
    private  String gameType;
    private String comment;
    private  int numberPlayer;

    public String getgameType() {
        return  gameType;
    }
    public void  setgameType(String gameType) {
        this.gameType = gameType;
    }

    public int numberPlayer() {
        return  numberPlayer;
    }
    public void  senumberPlayer(int numberPlayer) {
        this.numberPlayer = numberPlayer;
    }

    public String getComment() {
        return  comment;
    }
    public void  setComment(String comment) {
        this.comment = comment;
    }

}
