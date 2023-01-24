import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Ball extends JPanel{
    private int size, xSpeed, ySpeed, x, y;
    Timer timer;
    Color color = new Color(117, 177, 198);


    public Ball(){
        JButton button = new JButton("New Ball");


                size = (int)(Math.random()*50)+10;
                color = new Color((int)(Math.random()*255)+1,(int)(Math.random()*255)+1,(int)(Math.random()*255)+1);
                xSpeed = (int)(Math.random()*10)+1;
                ySpeed = (int)(Math.random()*10)+1;
                x = 10;
                y = 10;
                timer.start();
    }

    public void moveRight() {
         x=+xSpeed;
    }
        @Override
        public void paintComponent(Graphics g){

        super.paintComponent(g);
        g.setColor(color);
        g.fillOval(x,x,size,size);
        repaint();

    }


}




//        public void moveRight(){
//            x+= xSpeed;
//        }


//        timer = new Timer(10, new ActionListener() {
//            public void actionPerformed(ActionEvent e){
//                x += xSpeed;
//                y += ySpeed;
//
//                if(x >= getWidth() - size || x < 0){
//                    xSpeed *= -1;
//                    color = new Color((int)(Math.random()*255)+1,(int)(Math.random()*255)+1,(int)(Math.random()*255)+1);
//                }
//                else if(y >= getHeight() - size || y < 0){
//                    ySpeed *= -1;
//                    color = new Color((int)(Math.random()*255)+1,(int)(Math.random()*255)+1,(int)(Math.random()*255)+1);
//                }
//            }
//        });