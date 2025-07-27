package pr1_ventanas;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ventana ventana1 = new ventana();
            ventana1.setVisible(true);
        });
    }
}