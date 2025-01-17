import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Superman implements KeyListener {


    ImageIcon icon = new ImageIcon("Superman\\superman.png");
    JFrame frame = new JFrame();
    JLabel label = new JLabel(icon);
    private static final int WIDTH = 1000;
    private static final int HEIGHT = 800;

    Superman (){

        label.setOpaque(false);
        label.setBounds(50,500,150,172);


        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Superman");
        frame.setLayout(null);
        frame.setBounds(450,170,WIDTH,HEIGHT);
        frame.getContentPane().setBackground(new Color(0,0,0));
        frame.add(label);
        frame.addKeyListener(this);
        frame.setVisible(true);


    }


    @Override
    public void keyTyped(KeyEvent e) {
        switch (e.getKeyChar()){
            case 'w'-> label.setLocation(label.getX() ,label.getY() -10);
            case 'a' -> label.setLocation(label.getX() -10,label.getY());
            case 's' -> label.setLocation(label.getX(),label.getY() + 10);
            case 'd' -> label.setLocation(label.getX() + 10,label.getY());
            case 'e' -> label.setLocation(label.getX() + 10 ,label.getY() - 20);
            case 'q' -> label.setLocation(label.getX() - 10,label.getY() - 20);

        }

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
