import java.util.Scanner;
class emp
{
	int eid;
	String ename,edept;
	double sal;
	emp(int eid,String ename,String edept,double sal)
	{
		this.eid=eid;
		this.ename=ename;
		this.edept=edept;
		this.sal=sal;
	}
	public String toString()
	{
		return "\nEmployee Id="+eid+
		       "\nEmployee name:"+ename+
               "\nEmployee Designation: "+edept+
			   "\nEmployee salary:"+sal;
		
	}
}
class ss5
{
	public static void main(String[] args)
	{
		int n,i;
		Scanner s=new Scanner(System.in);
		emp e=new emp(1,"Raaz","Bcs",100000);
		emp e1=new emp(2,"Rz","Bsc",50000);
		System.out.println(e.toString());
		System.out.println(e1.toString());
		
		
	}
	
}