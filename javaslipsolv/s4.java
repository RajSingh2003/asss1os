import java.util.*;

class ss4 
{
    public static void main(String args[]) 
	{
        System.out.println("Enter the number of rows and columns: ");
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int mat[][] = new int[r][c];

        System.out.println("Enter the array elements:");
        for (int i = 0; i < r; i++) 
		{
            for (int j = 0; j < c; j++) 
			{
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.println("The matrix is:");
        for (int i = 0; i < c; i++) 
		{
            for (int j = 0; j < r; j++) 
			{
                System.out.print(" " + mat[j][i]);
            }
            System.out.println();
        }
    }
}




import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class InvalidPasswordException extends Exception
{
      InvalidPasswordException()
      {
            System.out.println("Username and password is not same");
      }
}

public class s4 extends Frame implements ActionListener
{
      Label uname,upass;
      TextField nametext;
      TextField passtext,msg;
      Button login,Clear;
      Panel p;
      int attempt=0;
      char c='*';
      
      public void login()
      {
           p=new Panel();
           uname=new Label("Username : ",Label.CENTER);
           upass=new Label("Password : ",Label.RIGHT);
           nametext=new TextField(20);
           passtext=new TextField(20);
           passtext.setEditable(true);
           passtext.setEchoChar(c);
           msg=new TextField(10);
           msg.setEditable(false);
           login=new Button("Login");
           Clear=new Button("Clear");
           login.addActionListener(this);
           Clear.addActionListener(this);
                  addWindowListener(new WindowAdapter()
            {
                 public void windowClosing(WindowEvent we)
                {
               System.exit(0);
                 }
            }
            );
           p.add(uname);
           p.add(nametext);
           p.add(upass);
           p.add(passtext);
           p.add(login);
           p.add(Clear);
           p.add(msg);
           add(p);
           
           setTitle("Login");
           setSize(290,200);
           setVisible(true);
           setTitle("Password");
           setSize(290,200);
           setVisible(true);
      }
      
      public void actionPerformed(ActionEvent ae)
      {
           Button btn=(Button)(ae.getSource());
           if(attempt<2)
           {
                if(btn == Clear)
                {
                      nametext.setText("");
                      passtext.setText("");
                }
                if((btn.getLabel()).equals("Login"))
                {
                     try
                     {
                            String user=nametext.getText();
                            String upass=passtext.getText();
                            
                            if(user.compareTo(upass)==0)
                            {
                                  msg.setText("Valid");
                                  System.out.println("Username is valid");
                                  System.exit(0);
                            }
                            else
                            {
                                  throw new InvalidPasswordException();
                            }
                     }
                     catch (Exception e)
                     {
                           msg.setText("Error");
                     }
                     attempt++;
                 }
            }
            else
            {
                   System.out.println("Youm are using 3 attempt");
                   System.exit(0);
            }
}

public static void main(String args[])
    {
          s4 pd=new s4();
          pd.login();
    }
}