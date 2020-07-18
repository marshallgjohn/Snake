package org.example;

import java.util.Random;

public class Orb extends Entity{
    public Orb(int x,int y) {
        super(x,y);
    }

    public void resetPosition() {
        Random rand = new Random();
        super.setX((rand.nextInt(30)*25)+25);
        super.setY((rand.nextInt(30)*25)+25);
        System.out.printf("X:%d,Y:%d",super.getX(),super.getY());
    }
}
