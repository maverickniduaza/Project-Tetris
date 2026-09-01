package main;
import javax.swing.JFrame;

public class Main {
    public static void main(String[] args){

        JFrame window = new JFrame("Project Tetris");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false); // This is so the users can't resize the JFrame

        // Add GamePanel to the window
        GamePanel gp = new GamePanel();
        window.add(gp);
        window.pack(); // The size of the GamePanel beconmes the size of the window

        window.setLocationRelativeTo(null);
        window.setVisible(true);
    }
}
