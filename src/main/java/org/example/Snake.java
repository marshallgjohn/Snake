package org.example;

import java.util.ArrayList;

public class Snake {
    private int length = 1;
    private int x;
    private int y;
    private int xDir = 0;
    private int yDir = 25;


    private ArrayList<SnakeBody> body = new ArrayList<>();


    public Snake(int x, int y) {
        this.x = x;
        this.y = y;
        this.body.add(new SnakeBody(this.x, this.y));
        this.body.add(new SnakeBody(this.x, this.y+100));
        this.body.add(new SnakeBody(this.x, this.y+200));
        //this.body.add(new SnakeBody(this.x, this.y+310));
        //this.body.add(new SnakeBody(this.x, this.y+410));
    }

    public void changeMovement(int xDir, int yDir) {
        this.xDir = xDir;
        this.yDir = yDir;
    }

    public void move() {
        for (int i = this.body.size()-1; i > 0; i--) {
            this.body.get(i).setX(this.body.get(i - 1).getX());
            this.body.get(i).setY(this.body.get(i - 1).getY());
        }
        this.body.get(0).setX(this.body.get(0).getX() + xDir);
        this.body.get(0).setY(this.body.get(0).getY() + yDir);
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getxDir() {
        return xDir;
    }

    public void setxDir(int xDir) {
        this.xDir = xDir;
    }

    public int getyDir() {
        return yDir;
    }

    public void setyDir(int yDir) {
        this.yDir = yDir;
    }

    public ArrayList<SnakeBody> getBody() {
        return body;
    }

    public void addBody(SnakeBody body) {
        this.body.add(body);
    }
}
