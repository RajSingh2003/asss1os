class Item 
{
    int item_number;
    String item_name;
    double item_price;
    static int objectCount = 0;

    public Item(int item_number, String item_name, double item_price) {
        this.item_number = item_number;
        this.item_name = item_name;
        this.item_price = item_price;
        objectCount++;
    }

    public void displayItem() 
	{
        System.out.println("Item Number: " + item_number);
        System.out.println("Item Name: " + item_name);
        System.out.println("Item Price: $" + item_price);
    }

    public static void displayObjectCount() {
        System.out.println("Number of objects created: " + objectCount);
    }
}

public class ss23
 {
    public static void main(String[] args) {
        Item item1 = new Item(1, "Item A", 10.99);
        item1.displayItem();
        Item.displayObjectCount();

        Item item2 = new Item(2, "Item B", 15.49);
        item2.displayItem();
        Item.displayObjectCount();
    }
}



import java.io.*;
import java.util.*;

class s26 implements Serializable {
    String name, address, group;
    int age, contact, lod;

    public s26(String name, String address, String group, int age, int contact, int lod) {
        this.name = name;
        this.address = address;
        this.group = group;
        this.age = age;
        this.contact = contact;
        this.lod = lod;
    }

    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Address: " + address +
                ", Contact: " + contact + ", Blood Group: " + group +
                ", Last Donation: " + lod + " months ago";
    }

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter how many records you want");
        int n = s.nextInt();
        try {
            ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream("save.txt"));
            s26 d[] = new s26[n];
            for (int i = 0; i < n; i++) {
                System.out.println("Enter Name: ");
                String name = s.next();
                System.out.println("Enter Age: ");
                int age = s.nextInt();
                System.out.println("Enter Address: ");
                String address = s.next();
                System.out.println("Enter Contact: ");
                int contact = s.nextInt();
                System.out.println("Enter Blood Group: ");
                String group = s.next();
                System.out.println("Enter Last donation (in months): ");
                int lod = s.nextInt();
                d[i] = new s26(name, address, group, age, contact, lod);
                o.writeObject(d[i]);
            }
            o.close();
        } catch (IOException e) {
            System.out.println(e);
        }

        try {
            ObjectInputStream z = new ObjectInputStream(new FileInputStream("save.txt"));
            for (int i = 0; i < n; i++) {
                s26 d = (s26) z.readObject();
                if (d.group.equals("A+ve") && d.lod >= 6)
                    System.out.println(d);
            }
            z.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}