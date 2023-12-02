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
class ss20
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




package Operation; 
 
public class Addition { 
    public int add(int a, int b) { 
        return a + b; 
    } 
 
    public float subtract(float x, float y) { 
        return x - y; 
    } 
}


package Operation; 
 
public class Maximum { 
    public void max(int a, int b) { 
        System.out.println("Maximum of " + a + " and " + b + " is: " + Math.max(a, b)); 
    } 
}


import Operation.Addition; 
import Operation.Maximum; 
 
public class ADD { 
    public static void main(String[] args) { 
        Addition addObj = new Addition(); 
        Maximum maxObj = new Maximum(); 
        int sum = addObj.add(5, 3); 
        float difference = addObj.subtract(7.5f, 2.3f); 
        System.out.println("Sum: " + sum); 
        System.out.println("Difference: " + difference); 
        maxObj.max(10, 8); 
    } 
}