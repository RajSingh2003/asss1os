import java.util.Scanner;
import java.util.Arrays;
class ss3
{
	public static void main(String[] args)
	{
		int n,i;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter no of cities :");
		n=s.nextInt();
		s.nextLine();//Consume the newline character
		String[] a=new String[n];
		System.out.println("Enter cities :");
		for(i=0;i<n;i++)
		{
			System.out.println("Enter cities :"+(i+1));
			a[i]=s.nextLine();
		}		
		Arrays.sort(a);
		System.out.println("\nCities in ascending order:");
		for(i=0;i<n;i++)
			System.out.println(a[i]);
	}
	
}




//Q2
import java.util.*;
class pat
{
     String name;
     int id;
     int hrct;
     int olevel;
     pat(String name,int id,int hrct,int olevel)
     {
         this.name=name;
         this.id=id;
         this.hrct=hrct;
         this.olevel=olevel;
     }
}
class s3
{
     public static void main(String[] args)
     {
          int n,i;
          Scanner s=new Scanner(System.in);
          System.out.println("Enter the Number of Patient : ");
          n=s.nextInt();
          pat []a=new pat[n];
          for(i=0;i<n;i++)
          {
             System.out.println("Enter the Details for  Patient :"+(i+1));
             System.out.println("Enter Name : ");
             String name=s.next();
             System.out.println("Enter ID : ");
             int id=s.nextInt();
             System.out.println("Enter HRCT REPORT : ");
             int hrct=s.nextInt();
             System.out.println("Enter OXYGEN LEVEL : ");
             int olevel=s.nextInt();
             a[i]=new pat(name,id,hrct,olevel);
          }
          for(i=0;i<n;i++)
          {
             if(a[i].olevel < 95 && a[i].hrct > 10)
             {
                try
                {
                    throw new NullPointerException();
                }
                catch(Exception e)
                {
                    System.out.println("Patienty is covid positive and Need to Hosptlize ");
                }
             }
             else
             {
                 System.out.println("\nPatient Name : "+a[i].name);
                 System.out.println("Patient Id : "+a[i].id);
                 System.out.println("Patient HRCT Report : "+a[i].hrct);
                 System.out.println("Patient Oxygen level : "+a[i].olevel);
                  
             }
          }
          
          
     } 
}