package loops;
import java.util.*;
import java.util.Scanner;
public class four 
{
	 public static void main (String[] args)
	    {
	     Scanner sc = new Scanner(System.in);   
		   char x=sc.next().charAt(0);
	       char y=sc.next().charAt(0);
	        if (x<y)
	            System.out.println(y+" , "+x);
	       
	        else
	            System.out.println(x+" , "+y);
	    }
}
