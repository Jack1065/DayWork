package Project1;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import javafx.event.ActionEvent;
import javafx.scene.text.Font;


public class Frame implements ActionListener{
    JTextField textField;
    private JButton[] burgers = new JButton[3];
    private JButton[] fries = new JButton[3];
    private JButton[] drinks = new JButton[3];
    private JButton[] allButtons = new JButton[3];
    JButton beefBurger, fishBurger, warhawkBurger;
    JButton small, medium, large;
    JButton pepsi, coke, sprite;
    JPanel panel;
    Font font = new Font("Serif", 15);
    
    Frame(){
        Font font = new Font("Serif", 15);
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
    public void actionPreformed(ActionEvent e) {
        
    }
    }

