package Project1;

import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.*;

public class Panel {
JPanel panel;

Font font = new Font("Serif", Font.BOLD, 25);
Font font1 = new Font("Serif", Font.BOLD, 30);

Panel(){
    Color color = new Color(250, 234, 203);

    
    panel = new JPanel();
    panel.setVisible(true);
    panel.setBounds(0, 0, 1800, 1500);
    panel.setBackground(color);
    panel.setLayout(null);
}

    public void addComponent(JPanel panel, JButton b1, JButton b2, JButton b3){
        panel.add(b1);
        panel.add(b2);
        panel.add(b3);
    }
    public void removeComponent(JPanel panel, JButton b1, JButton b2, JButton b3){
        panel.remove(b1);
        panel.remove(b2);
        panel.remove(b3);
    }
}
