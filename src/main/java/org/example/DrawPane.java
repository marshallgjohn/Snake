package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

class DrawPane extends JPanel {
    private Orb orb;
    private Scoreboard scoreboard;

    public DrawPane(Orb orb,Scoreboard scoreboard) {
        this.orb = orb;
        this.scoreboard = scoreboard;
    }
    public void paintComponent(Graphics g) {
        if(!scoreboard.isGameOver()) {
            g.setColor(Color.WHITE);
            g.drawString("Scoreboard: " + scoreboard.getScore(), scoreboard.getX(), scoreboard.getY());
            g.setColor(Color.RED);
            for (int i = 0; i < Game.snake.getBody().size(); i++) {
                g.fillRect(Game.snake.getBody().get(i).getX(), Game.snake.getBody().get(i).getY(), 25, 25);
                g.fillRect(Game.snake.getBody().get(i).getX(), Game.snake.getBody().get(i).getY(), 25, 25);
            }
            g.setColor(Color.YELLOW);
            g.fillOval(orb.getX(), orb.getY(), 25, 25);
        } else {
            g.drawString("Game Over!!! \nScoreboard: " + scoreboard.getScore(), 400, 400);
        }
    }

}
