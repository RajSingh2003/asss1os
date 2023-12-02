import java.util.Scanner; 
 
class NumberIsZeroException extends Exception  
{ 
    public NumberIsZeroException()  
    { 
        super("Number is 0"); 
    } 
} 
 
public class PRIME 
{ 
    public static boolean isPrime(int number)  
    { 
        if (number <= 1)  
            return false; 
        for (int i = 2; i <= Math.sqrt(number); i++)  
        { 
            if (number % i == 0)  
                return false; 
        } 
        return true; 
    } 
 
    public static void main(String[] args)  
    { 
        Scanner scanner = new Scanner(System.in); 
        System.out.print("Enter a number: "); 
        int number = scanner.nextInt(); 
        scanner.close(); 
        try  
        { 
            if (number == 0)  
                throw new NumberIsZeroException(); 
            else  
            { 
                boolean isPrime = isPrime(number); 
                if (isPrime)  
                    System.out.println(number + " is a prime number."); 
                else  
                    System.out.println(number + " is not a prime number.");   
            } 
        }  
        catch (NumberIsZeroException e)  
        { 
            System.err.println("Error: " + e.getMessage()); 
        } 
         
    } 
}

//Q2
package SY; 
 
public class Sy 
{ 
      public  int ct, mt, et; 
      public  Sy(int ct, int mt, int et) 
      { 
           this.ct = ct; 
           this.mt = mt; 
           this.et = et; 
      } 
      public int getct() 
      { 
             return ct; 
      } 
      public int getmt() 
      { 
             return mt; 
      } 
      public int getet() 
      { 
             return et; 
      } 
       
}

package TY; 
 
public class Ty 
{ 
      public int pm,tm; 
      public Ty(int pm, int tm) 
      { 
           this.pm = pm; 
           this.tm = tm; 
      } 
      public int getpm() 
      { 
             return pm; 
      } 
      public int gettm() 
      { 
             return tm; 
      } 
       
}



import SY.Sy; 
import TY.Ty; 
import java.util.Scanner; 
 
public class STUDENT 
{ 
       private int rno; 
       private String name; 
       private Sy sy; 
       private Ty ty; 
       
       public STUDENT(int rno,String name,Sy sy,Ty ty) 
       { 
              this.rno=rno; 
              this.name=name; 
              this.sy=sy; 
              this.ty=ty; 
       } 
        
       public int calculateTotalMarks() 
       { 
               int syTotal=sy.getct() + sy.getmt() + sy.getet(); 
               int tyTotal=ty.gettm() + ty.getpm(); 
               return syTotal + tyTotal; 
       } 
        
       public char calculateGrade() 
       { 
              int totalMarks = calculateTotalMarks(); 
              double percentage =((double)totalMarks/500)*100; 
               
              if(percentage>=70) 
                 return 'A'; 
              else if(percentage>=60) 
                 return 'B'; 
              else if(percentage>=50) 
                 return 'C'; 
              else if(percentage>=40) 
                 return 'P'; 
              else  
                 return 'F';             
       } 
        
       public void displayResult() 
       { 
              System.out.println("Roll no. : "+rno); 
              System.out.println("name : "+name); 
              System.out.println("total Marks : "+calculateTotalMarks()); 
              System.out.println("percentage : "+((double)calculateTotalMarks()/500)*100+"%"); 
              System.out.println("grade : "+calculateGrade()); 
       } 
        
       public static void main(String args[]) 
       { 
              Scanner sc = new Scanner(System.in); 
              System.out.println("enter the no. of students : "); 
              int n=sc.nextInt(); 
              sc.nextLine(); 
              for(int i=0;i<n;i++) 
              { 
                 System.out.println("Enter rno. : "); 
                 int rno=sc.nextInt(); 
                 sc.nextLine(); 
                 System.out.println("Enter name : "); 
                 String name = sc.next(); 
                 System.out.println("Enter SY comp Total : "); 
                 int com = sc.nextInt(); 
                 System.out.println("Enter SY maths Total : "); 
                 int math = sc.nextInt(); 
                 System.out.println("Enter SY elec Total : "); 
                 int elec = sc.nextInt(); 
                 System.out.println("Enter TY theory marks Total : "); 
                 int they = sc.nextInt(); 
                 System.out.println("Enter TY prac Total : "); 
                 int prac = sc.nextInt(); 
                  
                 Sy sy = new Sy(com,math,elec); 
                 Ty ty = new Ty(they,prac); 
                 STUDENT student= new STUDENT(rno,name,sy,ty); 
                 student.displayResult();  
                 } 
                 sc.close(); 
       } 
}


















import SY.Sy;
import TY.Ty;
import java.util.Scanner;
public class s14
{
	private int roll;
	private String name;
	private Sy sy;
	private Ty ty;
	public s14(int roll,String name,Sy sy,Ty ty)
	{
		this.roll=roll;
		this.name=name;
		this.sy=sy;
		this.ty=ty;	
	}
	public int add()
	{
		int s1=sy.cc()+sy.mm()+sy.ee()+ty.tt()+ty.pp();
		return s1;
	}
	public char cal()
	{
		int total=add();
		double per=(total/500)*100;
		if(per>=70)
			return 'A';
		else if(per>=60)
			return 'B';
		else if(per>=40)
			return 'C';
		else
			return 'F';
		
	}
	void display()
	{
		
		System.out.println("Roll:"+roll);
		System.out.println("Nmae:"+name);
		System.out.println("Total:"+add());
		System.out.println("percentage:"+(add()/500)*100);
		System.out.println("Grade:"+cal());
		
	}

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int i,n;
		System.out.println("Enter no of student:");
		n=s.nextInt();
		for(i=0;i<n;i++)
		{
		    System.out.println("enter student:"+(i+1));
			System.out.println("Enter roll:");
			int roll=s.nextInt();
			System.out.println("Enter name:");
			String name=s.next();
			System.out.println("Enter SYMARK(COMP,MATH,ELE):");
			int comp=s.nextInt();
			int math=s.nextInt();
			int ele=s.nextInt();
			System.out.println("Enter TYMARK(PRACT,THEO):");
			int theo=s.nextInt();
			int pract=s.nextInt();
			Sy sy=new Sy(comp,math,ele);
			Ty ty=new Ty(theo,pract);
			s14 st=new s14(roll,name,sy,ty);
			st.display();
			
		}
	}
}







