class College 
{
    int cno;
    String cname;
    String caddr;

    public College(int cno, String cname, String caddr) {
        this.cno = cno;
        this.cname = cname;
        this.caddr = caddr;
    }
}
class Department extends College 
{
    int dno;
    String dname;

    public Department(int cno, String cname, String caddr, int dno, String dname) 
	{
        super(cno, cname, caddr); 
        this.dno = dno;
        this.dname = dname;
    }
}

public class ss11
 {
    public static void main(String[] args) 
	{
        College c = new College(1, "ryk", "clg road");
        Department d = new Department(1, "ryk", "clg road", 101, "Computer Science");

        System.out.println("College Information:");
        System.out.println("College Number: " + c.cno);
        System.out.println("College Name: " + c.cname);
        System.out.println("College Address: " + c.caddr);

        System.out.println("\nDepartment Information:");
        System.out.println("Department Number: " + d.dno);
        System.out.println("Department Name: " + d.dname);
    }
}