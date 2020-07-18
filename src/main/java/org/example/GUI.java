package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class GUI extends JFrame {
    private final JPanel pane;
    public GUI(int width, int height,Orb orb,Scoreboard scoreboard) {
        super("Snake");
        setBackground(Color.BLACK);
        addKeyListener(new Keybinds());
        this.pane = new DrawPane(orb,scoreboard);
        setContentPane(pane);
        setSize(width,height);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}

