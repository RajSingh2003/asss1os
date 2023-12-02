import java.util.Scanner;
class continent
{
	String cname;
	continent(String cname)
	{
		this.cname=cname;
	}
}
class country extends continent
{
	String coname;
	country(String cname,String coname)
	{
		super(cname);
		this.coname=coname;
	}
}
class state extends country
{
	String sname;
	state(String cname,String coname,String sname)
	{
		super(cname,coname);
		this.sname=sname;
	}
}
class ss5
{
	public static void main(String[] args)
	{
		int n,i;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Continent Name :");
		String cname=s.next();
		System.out.println("Enter counrty Name :");
		String coname=s.next();
		System.out.println("Enter state Name :");
		String sname=s.next();
		System.out.println("Enter place Name :");
		String place=s.next();
		
		System.out.println("Details..");
		System.out.println("Continent Name :"+cname);
		System.out.println("Country Name :"+coname);
		System.out.println("State Name :"+sname);
		System.out.println("Place Name :"+place);
		
	}
	
}







import java.util.Scanner;
class s5
{
      int i,j,k,r1,c1,r2,c2;
      Scanner s=new Scanner(System.in);
      void add()
      {
        if(r1==r2 && c1==c2)
        {
           System.out.println("Enter Row and Column of First Matrix::");
           r1=s.nextInt();
           c1=s.nextInt();
           System.out.println("Enter Row and Column of Second Matrix::");
           r2=s.nextInt();
           c2=s.nextInt();
           int a[][]=new int[r1][c1];
           int b[][]=new int[r2][c2];
           int c[][]=new int[5][5];
           System.out.println("Enter First Matrix::");
           for(i=0;i<r1;i++)
           {
              for(j=0;j<c1;j++)
              {
                 a[i][j]=s.nextInt();
              }
           }
           System.out.println("First Matrix::");
           for(i=0;i<r1;i++)
           {
              for(j=0;j<c1;j++)
              {
                 System.out.print(a[i][j]+" ");
              }
              System.out.print("\n");
           }
           
           System.out.println("Enter Second Matrix::");
           for(i=0;i<r2;i++)
           {
              for(j=0;j<c2;j++)
              {
                 b[i][j]=s.nextInt();
              }
           }
           System.out.println("Second Matrix::");
           for(i=0;i<r2;i++)
           {
              for(j=0;j<c2;j++)
              {
                 System.out.print(b[i][j]+" ");
              }
              System.out.print("\n");
           }
           
           //System.out.printfln("ADDITION IS::");
           for(i=0;i<r1;i++)
           {
              for(j=0;j<c1;j++)
              {
                 c[i][j]=a[i][j]+b[i][j];
              }
             // System.out.printf("\n");
           }
            
           System.out.println("ADDITION IS::");
           for(i=0;i<r1;i++)
           {
              for(j=0;j<c1;j++)
              {
                System.out.print(c[i][j]+" ");
              }
              System.out.print("\n");
           }
        }
           
         else
             System.out.println("Invalid Matrix...");      
          
    }
    void mul()
    {
        if(r1==c2)
        {
           System.out.println("Enter Row and Column of First Matrix::");
           r1=s.nextInt();
           c1=s.nextInt();
           System.out.println("Enter Row and Column of Second Matrix::");
           r2=s.nextInt();
           c2=s.nextInt();
           int a[][]=new int[r1][c1];
           int b[][]=new int[r2][c2];
           int c[][]=new int[r2][c2];
           System.out.println("Enter First Matrix::");
           for(i=0;i<r1;i++)
           {
              for(j=0;j<c1;j++)
              {
                 a[i][j]=s.nextInt();
              }
           }
           System.out.println("First Matrix::");
           for(i=0;i<r1;i++)
           {
              for(j=0;j<c1;j++)
              {
                 System.out.print(a[i][j]+" ");
              }
              System.out.print("\n");
           }
           
           System.out.println("Enter Second Matrix::");
           for(i=0;i<r2;i++)
           {
              for(j=0;j<c2;j++)
              {
                 b[i][j]=s.nextInt();
              }
           }
           System.out.println("Second Matrix::");
           for(i=0;i<r2;i++)
           {
              for(j=0;j<c2;j++)
              {
                 System.out.print(b[i][j]+" ");
              }
              System.out.print("\n");
           }
           
           for(i=0;i<r1;i++)
           {
              for(j=0;j<c1;j++)
              {  
                  for(k=0;k<c1;k++)
                  {
                      c[i][j]=c[i][j]+a[i][k]*b[k][i];
                  }    
              }
             // System.out.printf("\n");
           }
            
           System.out.println("MULTIPLICATION IS::");
           for(i=0;i<r1;i++)
           {
              for(j=0;j<c2;j++)
              {
                System.out.print(c[i][j]+" ");
              }
              System.out.print("\n");
           }
       }    
           
         else
             System.out.println("Invalid Matrix...");      
           
      
    }
      
    public static void main(String[] args)
    {
            int ch=1;
            Scanner sc=new Scanner(System.in);
            s5 a =new s5();
            while(ch>=1&&ch<3)
            {
                    System.out.println("SELECT ANY ONE OPTION...");
                    System.out.println("1:ADDITION..");
                    System.out.println("2:MLTILICATION..");
                    System.out.println("3:EXIT...");   
                    System.out.println("Enter Your Choice..");                    
                    ch=sc.nextInt();
                    switch(ch)
                    {
                         case 1:
                               a.add();
                               break;
                         case 2:
                               a.mul();
                               break;
                        case 3:
                              System.out.println("Exit");
                               break;                       
                        default:  System.out.println("INVALID ERROR....");       
                    }
                            
            }
      }

}