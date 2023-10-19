import java.io.*;
import java.util.*;
  
    class Mk {
	public static void main(String[] args) {
		
		        Scanner sc = new Scanner(System.in);
		        String fnm;
		        String lnm;
		        int wt,ht;
		        fnm=args[0];
		        lnm=args[1];
		        wt=Integer.parseInt(args[2]);
		        ht=Integer.parseInt(args[3]);
		        float BMI;
		        BMI = (wt/(ht*ht));
		       System.out.print("\n BMI IS : %f "+BMI);
		 
	}
	
    }