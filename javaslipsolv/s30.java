import java.util.*;

class Person {
    String personName;
    int adharNo, panNo;

    public void display() {
        System.out.println("Name of the Person: " + personName + " " + "Adhar number is: " + adharNo + " " + "Pan number is: " + panNo);
    }

    public void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name of the person:");
        personName = sc.next();
        System.out.println("Enter Adhar number of the person:");
        adharNo = sc.nextInt();
        System.out.println("Enter Pan number of the person:");
        panNo = sc.nextInt();
    }

    public static void main(String args[]) {
        int i;
        Person ob = new Person();
        for (i = 1; i <= 5; i++) {
            ob.accept();
            ob.display();
        }
    }
}





import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class s30 extends JFrame implements ActionListener {
    JButton btn1;
    JTextField t1, t2;
    JLabel l1, l2, Result;

    s30() {
        t1 = new JTextField(10);
        t2 = new JTextField(10);
        Result = new JLabel();
        l1 = new JLabel("Enter First number");
        l2 = new JLabel("Enter Second number");
        btn1 = new JButton("Divide");

        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(btn1);
        add(Result);

        setLayout(new FlowLayout());
        btn1.addActionListener(this);

        setVisible(true);
        setSize(300, 400);
    }

    public void actionPerformed(ActionEvent ae) {
        try {
            int v1 = Integer.parseInt(t1.getText());
            int v2 = Integer.parseInt(t2.getText());
            int ans = v1 / v2;

            Result.setText(ans + " ");
        } catch (NumberFormatException e) {
            System.out.println("Enter a valid number!");
        } catch (ArithmeticException o) {
            System.out.println("Divided by zero");
        }
    }

    public static void main(String args[]) {
        s30 ob1 = new s30();
    }
}