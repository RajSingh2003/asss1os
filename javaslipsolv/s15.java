import java.io.*;
import java.util.*;
import java.io.File;
class ss15
{
      public static void main(String args[]) throws Exception
      {
             Scanner s=new Scanner(System.in);
             System.out.println("Source File name: \n");
             String file1=s.next();
             System.out.println("Destination File name: \n");
             String file2=s.next();
             FileReader fin=new FileReader(file1);
             FileWriter fout=new FileWriter(file2,true);
             int c;
             while((c=fin.read()) != -1)
             {
                 fout.write(c);
             }
             System.out.println("Copy Finish..");
             fin.close();
             fout.close();
      }    
}



class Account 
{
    String custName;
    int accNo;

    // Default constructor
    public Account() 
	{
        custName = "Default";
        accNo = 0;
    }

    // Parameterized constructor
    public Account(String custName, int accNo) {
        this.custName = custName;
        this.accNo = accNo;
    }

    // Method to display customer details
    public void displayCustomerDetails() {
        System.out.println("Customer Name: " + custName);
        System.out.println("Account Number: " + accNo);
    }
}

// SavingAccount subclass
class SavingAccount extends Account {
    double savingBal;
    double minBal;

    // Constructor
    public SavingAccount(String custName, int accNo, double savingBal, double minBal) {
        super(custName, accNo);
        this.savingBal = savingBal;
        this.minBal = minBal;
    }
}

// AccountDetail class extending SavingAccount
class AccountDetail extends SavingAccount {
    double depositAmt;
    double withdrawalAmt;

    // Constructor
    public AccountDetail(String custName, int accNo, double savingBal, double minBal, double depositAmt, double withdrawalAmt) {
        super(custName, accNo, savingBal, minBal);
        this.depositAmt = depositAmt;
        this.withdrawalAmt = withdrawalAmt;
    }

    // Method to display customer details with additional information
    public void displayCustomerDetails() 
	{
        super.displayCustomerDetails();
        System.out.println("Saving Balance: " + savingBal);
        System.out.println("Minimum Balance: " + minBal);
        System.out.println("Deposit Amount: " + depositAmt);
        System.out.println("Withdrawal Amount: " + withdrawalAmt);
    }
}

// Main class to test the AccountDetail class
public class s15 
{
    public static void main(String[] args) {
        // Creating an AccountDetail object
        AccountDetail account = new AccountDetail("John Doe", 123456, 5000.0, 1000.0, 2000.0, 500.0);
        
        // Displaying customer details
        account.displayCustomerDetails();
    }
}