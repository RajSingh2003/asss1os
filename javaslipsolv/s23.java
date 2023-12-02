import javax.swing.*;
import java.util.*;
import java.text.*;
import java.awt.*;
import java.awt.event.*;

class s23 extends KeyAdapter {
    JLabel l1, l2, l3;
    JTextField t1, t2, t3;

    s23() {
        JFrame ob = new JFrame();
        l1 = new JLabel("US Dollars");
        l2 = new JLabel("Singapore Dollars");
        l3 = new JLabel("Euros");
        t1 = new JTextField(10);
        t2 = new JTextField(10);
        t3 = new JTextField(10);

        ob.add(l1);
        ob.add(t1);
        ob.add(l2);
        ob.add(t2);
        ob.add(l3);
        ob.add(t3);

        ob.setVisible(true);
        t1.addKeyListener(this);

        ob.setLayout(new FlowLayout());
        ob.setSize(400, 400);
        ob.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void keyReleased(KeyEvent ke) {
        try {
            Double USD = Double.parseDouble(t1.getText());
            Double S = 1.41;
            Double E = 0.92;

            Double SGD = USD * S;
            Formatter fob = new Formatter();
            fob.format("%.2f", SGD);

            Double Euro = USD * E;
            fob.format("%.2f", Euro);

            t2.setText("" + SGD);
            t3.setText("" + Euro);

        } catch (Exception e) {
            System.out.println("Enter Values in Box");
        }
    }

    public static void main(String[] args) {
        s23 ob = new s23();
        Scanner sc = new Scanner(System.in);
    }
}