package Project1;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;

public class Frame {
    Frame(){
        Color color = new Color(250, 234, 203);
        JFrame frame = new JFrame();

        JLabel label = new JLabel();
        label.setSize(400, 600);
        label.setBackground(color);
        label.setOpaque(true);


        frame.setSize(800, 900);
        frame.setTitle("Jacks Fast Food");
        frame.setBackground(color);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.add(label);
    }
    
     void Button(){
        JButton button = new JButton();
    }

}
