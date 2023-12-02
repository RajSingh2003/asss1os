import javax.swing.*;
import java.util.*;
import java.text.*;
import java.awt.*;
import java.awt.event.*;

class s28 extends KeyAdapter {
    JLabel l1, l2;
    JTextField t1, t2;

    s28() {
        JFrame ob = new JFrame("Temperature Converter");
        l1 = new JLabel("Celsius");
        l2 = new JLabel("Fahrenheit");
        t1 = new JTextField(10);
        t2 = new JTextField(10);

        ob.add(l1);
        ob.add(t1);
        ob.add(l2);
        ob.add(t2);

        ob.setVisible(true);
        t1.addKeyListener(this);

        ob.setLayout(new FlowLayout());
        ob.setSize(400, 400);
        ob.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void keyReleased(KeyEvent ke) {
        try {
            Double cels = Double.parseDouble(t1.getText());
            Double S = (cels * 1.8) + 32;
            Formatter fob = new Formatter();
            fob.format("%.2f", S);
            t2.setText("" + S);
        } catch (Exception e) {
            System.out.println("Enter Values in Box");
        }
    }

    public static void main(String[] args) {
        s28 ob = new s28();
    }
}