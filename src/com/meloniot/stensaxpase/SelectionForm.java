package com.meloniot.stensaxpase;

import javax.swing.*;

public class SelectionForm {
    private JButton stenButton;
    private JButton saxButton;
    private JButton påseButton;
    private JPanel root;

    public SelectionForm() {
        JFrame frame = new JFrame("SelectionForm");
        frame.setContentPane(root);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
