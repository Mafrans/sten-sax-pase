package com.smeloniot.stensaxpase;

import javax.swing.*;

public class StartForm {
    private JPanel root;
    private JButton personButton;
    private JButton robotButton;

    public StartForm() {
        JFrame frame = new JFrame("StartForm");
        frame.setContentPane(root);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);


        robotButton.addActionListener(e -> {
            Thread thread = new Thread(Main::startRobotGame);
            thread.start();
        });

        personButton.addActionListener(e -> {
            String input = JOptionPane.showInputDialog(root, "Hur många poäng krävs för att vinna?", 3);

            try {
                short winRequirement = Short.parseShort(input);

                //Main.startPersonGame(winRequirement);
            }
            catch(NumberFormatException ex) {
                JOptionPane.showMessageDialog(root, "Va, så kan man ju inte göra.");
                System.exit(0);
            }
        });
    }
}
