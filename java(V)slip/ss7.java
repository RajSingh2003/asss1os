import java.util.Scanner;
class sphere
{
	int r;
	sphere(int r)
	{
		this.r=r;
	}
	public void area()
	{
		double a;
		a=4*3.14*(r*r);
		System.out.println("Surface Area: " +a );
	}
	public void volume()
	{
	
	    double v;
	    v=(4/3)*3.14*(r*r*r);
		System.out.println("Volume: " +v);
	}
}

class ss7
{
	public static void main(String[] args)
	{
		int n,i;
		Scanner s=new Scanner(System.in);
		
		System.out.print("Enter the radius of the sphere: ");
        int r = s.nextInt();
		sphere e=new sphere(r);
		e.area();
		e.volume();
		
	}
	
}