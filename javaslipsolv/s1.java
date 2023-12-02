class ss1
 {
    public static void main(String[] args) {
        int size = args.length;
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = Integer.parseInt(args[i]);
        }

        for (int i = 0; i < array.length; i++) {
            boolean isPrime = true;

            for (int j = 2; j < array[i]; j++) {
                if (array[i] % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println(array[i] + " is a prime number in the array");
            }
        }
    }
}


import java.io.*;
import java.util.*;
  
    class Mk {
 public static void main(String[] args) {
  
    int n=10;
    int i,j;
    int[] a = new int[n];
  for ( i = 0; i < n; i++)  
          a[i]=Integer.parseInt(args[i]);
    
   for(i=0; i<n; i++)
        {
            int c=0;
            for(j=1; j<=a[i]; j++)
            {
                if(a[i]%j==0)
                {
                    c++;
                }
            }

            if(c==2)
            {
                System.out.print(a[i]+" ");
            }
        }
  

       
  
 }
}


import java.util.Scanner;
abstract class staff
{
     protected int id;
     protected String name;
     public staff(int id,String name)
     {
           this.id=id;
           this.name=name;
     }
}
class officestaff extends staff
{
      private String dept;
      officestaff(int id,String name,String dept)
      {
           super(id,name);
           this.dept=dept;
      }
      void display()
      {
           System.out.println("ID : "+id);
           System.out.println("NAME : "+name);
           System.out.println("DEPARTMENT : "+dept);
           
      }
}
class s1
{
     public static void main(String[] args)
     {
          Scanner s=new Scanner(System.in);
          System.out.println("Enter The number of officestaff member : ");
          int n=s.nextInt();
          officestaff []a=new officestaff[n];
          
          for(int i=0;i<n;i++)
          {
             System.out.println("Enter The number of Staff : "+(i+1));
          
             System.out.println("Enter Id : ");
             int id=s.nextInt();
             
             System.out.println("Enter Name : ");
             String name=s.next();
             
             System.out.println("Enter Department: ");
             String dept=s.next();
             
             a[i]=new officestaff(id,name,dept);
          }
          for(int i=0;i<n;i++)
          {
              System.out.println("OFFICESTAFF DETAILS : ");
              a[i].display();
              System.out.println();
          }
               
     }
}