import java.awt.*;
import javax.swing.*;

class ss18 extends JFrame {
    ss18() {
        JButton b1 = new JButton("North");
        JButton b2 = new JButton("South");
        JButton b3 = new JButton("East");
        JButton b4 = new JButton("West");
        JButton b5 = new JButton("Center");
        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        add(b1, BorderLayout.NORTH);
        add(b2, BorderLayout.SOUTH);
        add(b3, BorderLayout.EAST);
        add(b4, BorderLayout.WEST);
        add(b5, BorderLayout.CENTER);
        setSize(300, 300);
        setVisible(true);
    }

    public static void main(String[] args) {
        ss18 ob = new ss18();
    }
}


import java.util.*; 
public class CRIC { 
    String name; 
    int noofinnings; 
    int noofnotouts; 
    int totalruns; 
    double batavg; 
 
    public CRIC(String name, int noofinnings, int noofnotouts, int totalruns) { 
        this.name = name; 
        this.noofinnings = noofinnings; 
        this.noofnotouts = noofnotouts; 
        this.totalruns = totalruns; 
        this.batavg = totalruns / (noofinnings - noofnotouts); 
    } 
 
    public static void sortplayers(CRIC[] p) { 
        for (int i = 0; i < p.length - 1; i++) { 
            for (int j = 0; j < p.length - 1 - i; j++) 
                if (p[j].batavg < p[j + 1].batavg) { 
                    CRIC temp = p[j]; 
                    p[j] = p[j + 1]; 
                    p[j + 1] = temp; 
                } 
        } 
 
    } 
 
    public void display() { 
        System.out.println("Players Details: "); 
        System.out.println("Name: " + name); 
        System.out.println("No of Innings: " + noofinnings); 
        System.out.println("No of NotOuts: " + noofnotouts); 
        System.out.println("Total Runs: " + totalruns); 
        System.out.println("Batting average: " + batavg); 
        System.out.println("---------------------------------------"); 
    } 
 
    public static void main(String[] args) { 
        Scanner scan = new Scanner(System.in); 
        System.out.println("Enter number of players: "); 
        int n = scan.nextInt(); 
        CRIC[] p = new CRIC[n]; 
        for (int i = 0; i < n; i++) { 
            scan.nextLine(); 
            System.out.println("Enter Details for player" + (i + 1) + ":"); 
            System.out.println("Enter Name: "); 
            String name = scan.nextLine(); 
            System.out.println("Enter no of innings: "); 
            int noofinnings = scan.nextInt(); 
            System.out.println("Enter no of not outs: "); 
            int noofnotouts = scan.nextInt(); 
            System.out.println("Total runs: "); 
            int totalruns = scan.nextInt(); 
            p[i] = new CRIC(name, noofinnings, noofnotouts, totalruns); 
        } 
        CRIC.sortplayers(p); 
        for (int i = 0; i < n; i++) { 
            p[i].display(); 
            System.out.println("-------------------------"); 
        } 
        scan.close(); 
    } 
} 