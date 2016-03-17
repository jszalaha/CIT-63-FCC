package Game;

import javax.swing.JFrame;

public class Main {

    public static void main(String[] args) {
        
        Window window = new Window();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(720, 480);
        window.setVisible(true);
    }
}
