package Project1;

import javax.swing.*;
import java.util.LinkedList;



public class Frame extends Buttons{

    JTextField textField;
    LinkedList<Double> order;

      Frame(){
        
        JFrame frame = new JFrame();

        frame.setLayout(null);
        frame.setTitle("Jacks Fast Food");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
       
        textField = new JTextField();
        textField.setBounds(1100, 75, 400, 700);
        textField.setFont(font);
        textField.setEditable(false);

        addComponent(panel,burgers,fries,drinks);
        frame.add(delete);
        frame.add(clear);
        frame.add(panel);
        frame.add(textField);
        frame.setVisible(true);

        
      }

}
