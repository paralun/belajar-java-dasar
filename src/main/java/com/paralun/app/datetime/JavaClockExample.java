/*
 * Copyright (c) 2016 | James Kusmambang
 * Source : https://github.com/paralun
 */
package com.paralun.app.datetime;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class JavaClockExample {

    public static void main(String[] args) {
        JFrame clock = new TextClockWindow();
        clock.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        clock.setVisible(true);
    }
}

class TextClockWindow extends JFrame {
    private JTextField text1;

    public TextClockWindow() throws HeadlessException {
        text1 = new JTextField(6);
        text1.setFont(new Font("sansserif", Font.PLAIN, 48));
        
        Container content = this.getContentPane();
        content.setLayout(new FlowLayout());
        content.add(text1); 
        
        this.setTitle("Text Clock");
        this.pack();
        
        javax.swing.Timer t = new javax.swing.Timer(100, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Calendar now = Calendar.getInstance();
                int h = now.get(Calendar.HOUR_OF_DAY);
                int m = now.get(Calendar.MINUTE);
                int s = now.get(Calendar.SECOND);
                text1.setText("" + h + " : " + m + " : " + s);
            }
        });
        t.start();
    }
}
