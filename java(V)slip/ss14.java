import java.io.*;
import java.util.*;
import java.io.File;
class ss14
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