import java.util.Scanner;
public class L7 {
	 public static void main(String[] input)
	    {
	        char ch;
	        int temp;
	        Scanner sc = new Scanner(System.in);
	        
	        System.out.print("Enter a Character in Lowercase : ");
	        ch = sc.next().charAt(0);
			
	        temp = (int) ch;
	        temp = temp - 32;
	        ch = (char) temp;
			
	        System.out.print("Character in Uppercase = " +ch);
	    }
	}
