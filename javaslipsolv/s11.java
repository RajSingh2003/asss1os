import java.util.Scanner;
interface operation
{
    void input();
    void output();
}
class cylinder implements operation
{
    double r,h;
    public void input()
    {
         Scanner s= new Scanner(System.in);
         System.out.println("Enter radius : ");
         r=s.nextDouble();
         System.out.println("Enter Height : ");
         h=s.nextDouble();
    }
    public void output()
    {
        //  double a=2*3.14*r*(r+h);
          double v=3.14*r*r*h;
          //System.out.println("Area of Cylinder : "+a);
          System.out.println("Volume of Cylinder : "+v);
    }
}

public class ss11
{
     public static void main(String[] args)
     {
          cylinder c=new cylinder();
          c.input();
          c.output();
     }
}



import java.util.Scanner;
public class s11
{
    public static void main(String[] args) 
	{
        Scanner s = new Scanner(System.in);

        System.out.print("Enter username: ");
        String username = s.nextLine();

        System.out.print("Enter password: ");
        String password = s.nextLine();

        if (!username.equals(password)) 
		{
            System.out.println("Invalid Password: Username and password must be the same.");
        } 
		else 
		{
            System.out.println("Username and Password are the same. Access granted!");
        }
    }
}