package com.smeloniot.stensaxpase;

import javax.swing.*;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
	    new StartForm();
    }


    private static int robotPoints;
    private static int playerPoints;

    public static void startRobotGame() {
        SelectionForm selectionForm = new SelectionForm();
        while(selectionForm.selection == null) {
            try {
                Thread.sleep(100);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        selectionForm.dispose();

        Random random = new Random();
        Selection selection = selectionForm.selection;
        Selection computerSel = Selection.values()[random.nextInt(3)];

        short result = selection.compare(computerSel);

        System.out.println(String.format("%s vs %s", selection, computerSel));
        System.out.println(result);

        ResultForm resultForm;
        switch(result) {
            case 0: // Lika
                resultForm = new ResultForm(selection, computerSel, "Lika!");
                break;
            case 1: // Spelaren vinner
                resultForm = new ResultForm(selection, computerSel,
                        "Du vinner!\n" +
                        "Du har nu " + playerPoints + " poäng.\n" +
                        "Datorn har " + robotPoints + " poäng"
                );
                playerPoints++;
                break;
            case 2: // Roboten vinner
                resultForm = new ResultForm(selection, computerSel,
                        "Datorn vinner \uD83D\uDE1E\n" +
                                "Du har nu " + playerPoints + " poäng.\n" +
                                "Datorn har " + robotPoints + " poäng"
                );
                robotPoints++;
                break;
        }

        boolean quit = JOptionPane.showConfirmDialog(null, "Fortsätt spela?") == 1;

        if(quit) {
            System.exit(0);
        }

        startRobotGame();
    }
}
