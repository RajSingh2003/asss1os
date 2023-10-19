import java.io.*;
import java.util.*;
class InvalidDateException extends Exception
{
      InvalidDateException()
      {
           System.out.println("Invalid Date...");
      }
}
class Date
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
           System.out.println("Date is Valid :"+day+"/"+mon+"/"+yr);
      }
}
class setb3
{
     public static void main(String args[]) throws Exception
     {
           Scanner s=new Scanner(System.in);
           System.out.println("Enter Date : dd mm yyyy");
           int day=s.nextInt();
           int mon=s.nextInt();
           int yr=s.nextInt();
           int count=0;
           try
           {
               if(mon<=0 || mon>12)
                  throw new InvalidDateException();
               else
               {
                   if(mon==1||mon==3 ||  mon==5 || mon==7 ||  mon==8 || mon==10 || mon==12)
                   {
                      if(day>=1 && day<=31)
                        count=1;
                      else
                          throw new InvalidDateException();  
                   }
                   else if(mon==2)
                   {
                        if(yr%4==0)
                        {
                           if(day>=1 && day<=29)
                             count=1;
                           else
                              throw new InvalidDateException();  
                        }
                        else
                        {
                           if(day>=1 && day<=28)
                             count=1;
                           else
                              throw new InvalidDateException();  
                        }     
                   }
                   else
                   {
                        if(mon==4 || mon==6 || mon==9 || mon==11)
                        {
                           if(day>=1 && day<=30)
                              count=1;
                           else
                               throw new InvalidDateException();    
                        }
                   }
               }   
               if(count==1)
               {
                  Date d=new Date();
                  d.accept(day,mon,yr);
                  d.display();
               }
           }
           catch(InvalidDateException mm)
           {
              System.out.println("Invalid Date");
           }
            
     }
}



