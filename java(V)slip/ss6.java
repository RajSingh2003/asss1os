import java.util.*;
import java.io.*;
class ss6
{
	public static void main(String[] args)throws IOException
	{
		FileReader f=new FileReader("sample.txt");
		Scanner s=new Scanner(f);
		String c,c2;
		while(s.hasNext())
		{
			StringBuilder c1=new StringBuilder();
			c=s.next();
			c2=c.toUpperCase();
			c1.append(c2);
			c1.reverse();
			System.out.println(c1);
		}			
		f.close();
	}
}