class Bank 
{
    double balance;

    public Bank() 
	{
        balance = 0;
    }

    public Bank(double initialBalance) 
	{
        balance = initialBalance;
    }

    public void deposit(double amount) 
	{
        balance = balance + amount;
    }

    public void withdraw(double amount) 
	{
        balance = balance - amount;
    }

    public double getBalance() 
	{
        return balance;
    }
}
class ss7{
    public static void main(String[] args) 
	{
        Bank b = new Bank(1000);
        b.withdraw(250);
        System.out.println("The withdraw is: " + b.balance);
        b.deposit(400);
        System.out.println("The deposit is: " + b.balance);
        System.out.println("The balance is: " + b.getBalance());
    }
}









import java.util.*;
import java.io.*;
class s7
{
     public static void main(String [] args)throws IOException
     {
        
          FileReader f=new FileReader("samp.txt");
          Scanner s=new Scanner(f);
          String str,str1;
          while(s.hasNext())
          {
               StringBuilder st=new StringBuilder();
               str=s.next();
               str1=str.toUpperCase();
               st.append(str1);
               st.reverse();
               System.out.print(st);
               
          }
          f.close();
     }
}