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