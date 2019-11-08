package com.smeloniot.stensaxpase;

import javax.swing.*;
import java.io.IOException;

public class ResultForm {
    private JLabel leftImage;
    private JLabel rightImage;
    private JButton nextButton;
    private JLabel resultLabel;
    private JPanel root;

    public ResultForm(Selection sel1, Selection sel2, String result) {
        JFrame frame = new JFrame("ResultForm");

        try {
            leftImage.setIcon(new ImageIcon(sel1.getImage()));
            rightImage.setIcon(new ImageIcon(sel2.getImage()));
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        resultLabel.setText(result);


        frame.setContentPane(root);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
