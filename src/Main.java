import javax.swing.*;

public class Main{
    public static void main(String[] arrgs){
        JFrame frame = new JFrame("Balls");


        BallPanel bp = new BallPanel();
        frame.add(bp);
        frame.setSize(500, 500);
        frame.setVisible(true);

    }
}