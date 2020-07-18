package org.example;

public class Scoreboard extends Entity{
    private int score = 0;



    private boolean gameOver = false;
    public Scoreboard(int x,int y) {
        super(x,y);
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
    public boolean isGameOver() {
        return gameOver;
    }

    public void setGameOver(boolean gameOver) {
        this.gameOver = gameOver;
    }
}
