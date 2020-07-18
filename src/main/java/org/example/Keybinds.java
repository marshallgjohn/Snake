package org.example;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Keybinds extends KeyAdapter {
    public void keyPressed(KeyEvent e) {
        int keys = e.getKeyCode();

        switch(keys) {
            case KeyEvent.VK_W:
                Game.snake.changeMovement(0,-25);
                break;
            case KeyEvent.VK_S:
                Game.snake.changeMovement(0,25);
                break;
            case KeyEvent.VK_A:
                Game.snake.changeMovement(-25,0);
                break;
            case KeyEvent.VK_D:
                Game.snake.changeMovement(25,0);
                break;
        }
    }
}
