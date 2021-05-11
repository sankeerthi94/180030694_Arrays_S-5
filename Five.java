package loops;
import java.util.Scanner;
public class five 
{
	 public static void main(String args[])
{
		 Scanner scanner=new Scanner(System.in);
		 if (scanner.hasNextInt()) {
		     int value = scanner.nextInt();
		     System.out.print(value + " is a number");
		     return;
		 }

		 String value = scanner.next();

		 if (value.isEmpty()) {
		     return;
		 }
		 char c = value.charAt(0);

		 if ((c>='a' && c <= 'z') || (c>='A' && c <= 'Z')) {
		     System.out.print("char is Alphabet");
		 } else {
		     System.out.print("char is special character");
		 }
		 scanner.close();
}
}
