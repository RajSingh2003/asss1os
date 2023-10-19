import java.util.Scanner;
class MyNumber
{
     private int no;
     MyNumber(){
         no=0;
     }
     MyNumber(int no)
     {
          this.no=no;
     }    
     void negative(){
          if(no<0)
             System.out.println(+no+ "is Negative..");
     }
     void positive(){
          if(no>0)
             System.out.println(+no+ "is Positive");
     }
     void zero(){
          if(no==0)
             System.out.println(+no+ "is Zero..");
     }
     void even(){
          if(no%2==0)
             System.out.println(+no+ "is EVEN..");
     }
      void odd(){
          if(no%2!=0)
             System.out.println(+no+ "is ODD..");
     }
             
     public static void main(String[] args)
     {
          System.out.println("Enter Number : ");
          Scanner s=new Scanner(System.in);
          int no=s.nextInt();
          
          MyNumber m=new MyNumber(no);
          m.positive();
          m.negative();
          m.zero();
          m.even();
          m.odd();
     }
     
     
     
             
     
}