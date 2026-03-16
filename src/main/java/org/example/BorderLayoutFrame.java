package org.example;

import javax.swing.*;
import java.awt.*;


public class BorderLayoutFrame extends JFrame {

    public BorderLayoutFrame() {

        setTitle("BorderLayout Demo");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

    }
}