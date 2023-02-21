package Project1;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Buttons extends Panel implements ActionListener {
    JButton beefBurger, fishBurger, warhawkBurger;
    JButton small, medium, large;
    JButton pepsi, coke, sprite;
    JButton clear, delete;
    JButton burgers, fries, drinks;
    private JButton[] burger = new JButton[]{beefBurger, fishBurger, warhawkBurger};
    private JButton[] fry = new JButton[]{small,medium,large};
    private JButton[] drink = new JButton[]{pepsi,coke,sprite};
    private JButton[] allButtons = new JButton[]{burgers,fries,drinks};

    Buttons(){
        
        delete = new JButton("Delete");
        clear = new JButton("Clear");
        delete.addActionListener(this);
        clear.addActionListener(this);
        delete.setFont(font1);
        clear.setFont(font1);
        delete.setFocusable(false);
        clear.setFocusable(false);
        delete.setBackground(Color.WHITE);
        clear.setBackground(Color.WHITE);
        clear.setOpaque(true);
        delete.setOpaque(true);
        delete.setBounds(350, 705, 180, 70);
        clear.setBounds(550,705,180,70);
        
        burgers = new JButton("Burgers");
        fries = new JButton("Fries");
        drinks = new JButton("Drinks");

        beefBurger = new JButton("Beef Burger");
        fishBurger = new JButton("Fish Burger");
        warhawkBurger= new JButton("Warhawk Burger");
        
        small = new JButton("Small");
        medium = new JButton("Medium");
        large = new JButton("Large");

        pepsi = new JButton("Pepsi");
        coke = new JButton("Coke");
        sprite = new JButton("Sprite");

        burger[0] = beefBurger;
        burger[1] = fishBurger;
        burger[2] = warhawkBurger;

        fry[0]= small;
        fry[1]= medium;
        fry[2] = large;

        drink[0]=pepsi;
        drink[1] = coke;
        drink[2]= large;

        allButtons[0]=burgers;
        allButtons[1]=fries;
        allButtons[2]=drinks;

        activateButton(burger);
        activateButton(fry);
        activateButton(drink);
        activateButton(allButtons);

        for (int i = 0; i <allButtons.length;i++){
            allButtons[i].setVisible(true);
        }


        ImageIcon beefIcon = new ImageIcon("Beef.png");
        ImageIcon fishIcon = new ImageIcon("FishBurger.png");
        ImageIcon warhawkIcon = new ImageIcon("WarhawkBurger.png");

        beefIcon = setImageSize(beefIcon);
        fishIcon = setImageSize(fishIcon);
        warhawkIcon = setImageSize(warhawkIcon);


        beefIcon = setImageSize(beefIcon);
        fishIcon = setImageSize(fishIcon);
        warhawkIcon = setImageSize(warhawkIcon);

        beefBurger.setIcon(beefIcon);
        fishBurger.setIcon(fishIcon);
        warhawkBurger.setIcon(warhawkIcon);

        setButtonBounds(beefBurger, fishBurger, warhawkBurger);
        setButtonBounds(small, medium, large);
        setButtonBounds(pepsi, coke, sprite);
        setButtonBounds(burgers, fries, drinks);
        
    }

    public ImageIcon setImageSize(ImageIcon c){
        Image image = c.getImage();
        Image mewing = image.getScaledInstance(200, 100, Image.SCALE_SMOOTH);
        c = new ImageIcon(mewing);
        return c;
        
    }

    public void setButtonBounds(JButton b1, JButton b2, JButton b3){
        b1.setBounds(90,150,400,200);
        b2.setBounds(580,150,400,200);
        b3.setBounds(335,400,400,200);
        
    }

    public void activateButton(JButton button[]){
        for(int i = 0; i<3;i++){
            button[i].addActionListener(this);
            button[i].setFont(font);
            button[i].setFocusable(false);
            button[i].setVerticalTextPosition(JButton.BOTTOM);
            button[i].setHorizontalTextPosition(JButton.CENTER);
            button[i].setBackground(Color.LIGHT_GRAY);
            button[i].setOpaque(true);
        }
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        switch(e.getActionCommand()){
            case "Burgers":
                removeComponent(panel, burgers, fries, drinks);
                addComponent(panel, beefBurger, fishBurger, warhawkBurger);
                break;
                
            case "Drinks":
                removeComponent(panel, burgers, fries, drinks);
                addComponent(panel, pepsi, coke, sprite);
                break;

            case "Fries":
                removeComponent(panel, burgers, fries, drinks);
                addComponent(panel,small, medium, large);
                break;

            default:
                System.out.println("Invalid");    
                
        }
        
    }
    public void setVisible(JButton[] b1, JButton[] b2, JButton[] b3){
        for(int i = 0; i<b1.length;i++){
            b1[i].setVisible(false);
        }
        for(int i = 0; i<b2.length;i++){
            b2[i].setVisible(false);
        }
        for(int i = 0; i<b3.length;i++){
            b3[i].setVisible(false);
        }
    }
    public void setVisible(JButton[] b1){
        for(int i = 0; i<b1.length;){
            b1[i].setVisible(false);
        }
    }
}


