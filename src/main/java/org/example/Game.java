package org.example;

import javax.swing.*;

public class Game {
    private JFrame frame;
    public static Snake snake = new Snake(0,0);
    private Orb orb = new Orb(400,400);
    private Scoreboard scoreboard = new Scoreboard(0,25);
    private int width = 800;
    private int height = 800;
    private GUI gui;


    public Game() {
        gameLoop();
    }

    private void gameLoop(){
        gui = new GUI(width,height,orb,scoreboard);
        while(checkSnakeCollision()) {
            checkOrbCollision();

            gui.repaint();
            gui.getContentPane().getGraphics().fillOval(400,400,200,200);

            snake.move();

            try {
                Thread.sleep(150);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        gui.repaint();
    }

    private void checkOrbCollision() {
        if(orb.getX() == snake.getBody().get(0).getX() &&
                snake.getBody().get(0).getY() == orb.getY()) {
            scoreboard.setScore(scoreboard.getScore() + 1);
            orb.resetPosition();
            snake.getBody().add(new SnakeBody(snake.getBody().get((snake.getBody().size()-1)).getX(),snake.getBody().get((snake.getBody().size()-1)).getY()));
        }
    }

    private boolean checkSnakeCollision() {
        if(snake.getBody().get(0).getX() < 0
                || snake.getBody().get(0).getX() > width
                || snake.getBody().get(0).getY() < 0
                || snake.getBody().get(0).getY() > height) {
            return false;
        } else {
            for(int i = 1; i < snake.getBody().size();i++) {
                if(snake.getBody().get(i).getX() == snake.getBody().get(0).getX() && snake.getBody().get(i).getY()==snake.getBody().get(0).getY()) {
                    scoreboard.setGameOver(true);
                    gui.repaint();
                    return false;
                }
            }
            return true;
        }
    }


}
