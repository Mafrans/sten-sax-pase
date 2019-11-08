package com.smeloniot.stensaxpase;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectionForm {
    private JButton stenButton;
    private JButton saxButton;
    private JButton paseButton;
    private JPanel root;
    private JFrame frame;
    public Selection selection = null;

    public SelectionForm() {
        frame = new JFrame("SelectionForm");
        frame.setContentPane(root);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

        stenButton.addActionListener(e -> selection = Selection.ROCK);
        saxButton.addActionListener(e -> selection = Selection.SCISSORS);
        paseButton.addActionListener(e -> selection = Selection.PAPER);
    }

    public void dispose() {
        frame.dispose();
    }
}
