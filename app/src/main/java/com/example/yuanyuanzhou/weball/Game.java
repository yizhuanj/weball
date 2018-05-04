package com.example.yuanyuanzhou.weball;

/**
 * Created by tianyuli on 4/28/18.
 */

public class Game {
    private String sport;
    private String location;
    private String comments;
    private String time;
    private int num;

    public Game(String s, String l, String c, String t, int n) {
        sport = s;
        location = l;
        comments = c;
        time = t;
        num = n;
    }

    public String getSport() {
        return sport;
    }

    public String getLocation() {
        return location;
    }

    public String getComments() {
        return comments;
    }

    public String getTime() {
        return time;
    }

    public String getNum() {
        return Integer.toString(num) + " players needed!";
    }
}
