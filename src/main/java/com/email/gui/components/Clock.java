package com.email.gui.components;

import javax.swing.*;
import java.awt.*;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Clock extends JLabel {
    public Clock() {
        Font clockFont = new Font("Sans-serif", Font.BOLD, 24);

        setFont(clockFont);
    }

    public void display() {
        Thread clock = new Thread(() -> {
            while (true) {
                try {
                    Calendar cal = new GregorianCalendar();

                    int hour = cal.get(Calendar.HOUR_OF_DAY);
                    int minute = cal.get(Calendar.MINUTE);
                    int second = cal.get(Calendar.SECOND);

                    String time = String.format("%02d:%02d:%02d", hour, minute, second);

                    setText(time);

                    Thread.sleep(1000);
                } catch (Exception e) {
                    System.out.println();
                }
            }
        });

        clock.start();
    }
}