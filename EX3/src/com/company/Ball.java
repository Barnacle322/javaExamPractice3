package com.company;

public class Ball implements Spherical{
    private int gamesPlayed;

    public Ball(int gamesPlayed) {
        this.gamesPlayed = gamesPlayed;
    }

    @Override
    public String toString() {
        String msg = String.format("%s games played with this ball", gamesPlayed);
        return msg;
    }
}
