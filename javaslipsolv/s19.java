
import java.util.Scanner;
class ss19
{
      int i,j,k,r1,c1,r2,c2,suml=0,sumr=0;
      Scanner s=new Scanner(System.in);  
      void dig()
      {
           System.out.println("Enter Row and Column of Matrix::");
           r1=s.nextInt();
           c1=s.nextInt();
           int a[][]=new int[r1][c1];
           int b[][]=new int[5][5];
           System.out.println("Enter Matrix::");
           for(i=0;i<r1;i++)
           {
              for(j=0;j<c1;j++)
              {
                 a[i][j]=s.nextInt();
              }
           }
           System.out.println(" Matrix::");
           for(i=0;i<r1;i++)
           {
              for(j=0;j<c1;j++)
              {
                 System.out.print(a[i][j]+" ");
              }
              System.out.print("\n");
           }
            for(i=0;i<r1;i++)
           {
              for(j=0;j<c1;j++)
              {
				 if(i==j)
					 suml+=a[i][j];
				 if(i+j==r1-1)
					sumr+=a[i][j]; 
				 
              } 
           }
		   System.out.println("sum of digonal Elements::::");
		   System.out.println("sum of Left digonal Elements:"+suml);
		   System.out.println("sum of Right digonal Elements:"+sumr);
		   
	  }		   
      public static void main(String[] args)
      {
            Scanner sc=new Scanner(System.in);
            ss19 a =new ss19();
            a.dig();
      }

}





import javax.swing.*;
import java.awt.event.*;

public class s19 extends JFrame implements ActionListener {
    JComboBox<String> subjectComboBox;
    JTextField selectedSubjectTextField;

    s19() {
        String[] subjects = {"Data Structures", "Operating Systems", "Database Management Systems", "Computer Networks", "Software Engineering"};

        subjectComboBox = new JComboBox<>(subjects);
        subjectComboBox.setBounds(50, 50, 200, 30);

        selectedSubjectTextField = new JTextField();
        selectedSubjectTextField.setBounds(50, 100, 200, 30);
        selectedSubjectTextField.setEditable(false);

        subjectComboBox.addActionListener(this);

        add(subjectComboBox);
        add(selectedSubjectTextField);

        setTitle("Subject Selection");
        setSize(300, 200);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == subjectComboBox) {
            String selectedSubject = (String) subjectComboBox.getSelectedItem();
            selectedSubjectTextField.setText(selectedSubject);
        }
    }

    public static void main(String[] args) {
        new s19();
    }
}