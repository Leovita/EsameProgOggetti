//package EsameProg;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MyFrame mainFrame = new MyFrame();
            mainFrame.setVisible(true);
    });
    }
}