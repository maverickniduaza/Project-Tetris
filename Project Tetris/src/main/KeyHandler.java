package main;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyHandler implements KeyListener {
    public static boolean upPressed, downPressed, leftPressed, rightPressed;

    @Override
    public void keyTyped(KeyEvent e) {}

    @Override
    public void keyPressed(KeyEvent e) {

        int code = e.getKeyCode();

        if(code == KeyEvent.VK_W){ //UP Movement
            upPressed = true;
        }
        if(code == KeyEvent.VK_A){ //LEFT Movement
            leftPressed = true;
        }
        if(code == KeyEvent.VK_S){ //DOWN Movement
            downPressed = true;
        }
        if(code == KeyEvent.VK_D){ //RIGHT Movement
            rightPressed = true;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {}
}
