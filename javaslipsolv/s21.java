import java.io.*; 
import java.util.*; 
 
class InvalidDateException extends Exception 
{ 
      InvalidDateException() 
      { 
             System.out.println("Invalid Date"); 
      } 
} 
 
class MyDate 
{ 
      int day,mon,yr; 
      void accept(int d,int m,int y) 
      { 
           day=d; 
           mon=m; 
           yr=y; 
      } 
      void display() 
      { 
           System.out.println("Date is valid : "+ day+ "/"+ mon+ "/"+ yr); 
      } 
} 
 
class DATE 
{ 
      public static void main(String args[]) throws Exception 
      { 
            Scanner sc=new Scanner(System.in); 
            System.out.println("Enter Date : dd mm yyyy"); 
            int day=sc.nextInt(); 
            int mon=sc.nextInt(); 
            int yr=sc.nextInt(); 
            int flag=0; 
            try 
            { 
                 if(mon<=0 || mon>12) 
                      throw new InvalidDateException(); 
                 else 
                 { 
                      if(mon==1  mon==3  mon==5  mon==7  mon==8  mon==10  mon==12) 
                      { 
                            if(day>=1 && day<=31) 
                                 flag =1; 
                            else 
                                 throw new InvalidDateException(); 
                      } 
                      else if(mon==2) 
                      { 
                            if(yr%4==0) 
                            { 
                                 if(day>=1 && day<=29) 
                                     flag=1; 
                                 else 
                                     throw new InvalidDateException(); 
                            } 
                            else 
                            { 
                                  if(day>=1 && day<=28) 
                                       flag=1; 
                                  else 
                                     throw new InvalidDateException(); 
                            } 
                       }    
                            else 
                            { 
                                  if(mon==4  mon==6  ||mon==9 || mon==11) 
                                  { 
                                        if(day>=1 && day<=30) 
                                             flag=1; 
                                        else 
                                             throw new InvalidDateException(); 
                                  } 
                            } 
                      } 
                      if(flag==1) 
                      { 
                            MyDate dt=new MyDate(); 
                            dt.accept(day,mon,yr); 
                            dt.display(); 
                      } 
                 } 
                 catch(InvalidDateException mm) 
                 { 
                        System.out.println(" "); 
                 } 
         } 
}

class s21
{
      int id=0;
      String name=" ";
      String dept=" ";
      double salary=0;
      
      s21(int id,String name,String dept,double salary)
      {
         this.id=id;
         this.name=name;
         this.dept=dept;
         this.salary=salary;
      }
      void show()
      {
           System.out.println("Enter Employee ID : "+id);
           System.out.println("Enter Employee Name : "+name);
           System.out.println("Enter Employee Department : "+dept);
           System.out.println("Enter Employee Salary : "+salary);
           System.out.println();
      }
     
      
      public static void main(String[] args)
      {
            s21 e=new s21(1,"Raj","BCS",500000000);
            s21 e1=new s21(2,"Amit","BSC",10000000);
            e.show();
            e1.show();
            
            
      }
}