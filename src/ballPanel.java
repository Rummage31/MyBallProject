import javax.swing.*;
import java.awt.event.*;


class BallPanel extends Ball {



    JPanel panel = new JPanel();

    Ball b1 = new Ball();


    public BallPanel(){
        setFocusable(true);
        addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println(e.getKeyCode());
                if(e.getKeyCode() == 68){
                    b1.moveRight();
               }
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });

    }



}
