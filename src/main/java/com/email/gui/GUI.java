package com.email.gui;

import com.email.gui.components.Clock;

import javax.swing.*;
import java.awt.*;

public class GUI extends JFrame {
    public GUI() throws HeadlessException {
        setTitle("PJATK MAIL");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(800, 600);
        setLayout(new GridBagLayout());

        GridBagConstraints constraints = new GridBagConstraints();

        JPanel topPanel = new JPanel();
        Clock clock = new Clock();

        topPanel.add(clock);

        add(topPanel);

        setLocationRelativeTo(null);
        setVisible(true);
    }
}
