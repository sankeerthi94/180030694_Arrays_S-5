import java.util.*;
import java.util.Scanner;
class L18
{  
   public static void main(String args[])  
   {  
      String original, reverse = "";
      Scanner s = new Scanner(System.in);   
      System.out.println("Enter a number:");  
      original = s.nextLine();   
      int length = original.length();   
      for ( int i = length - 1; i >= 0; i-- )  
         reverse = reverse + original.charAt(i);  
      if (original.equals(reverse))  
         System.out.println("Palindrome");  
      else  
         System.out.println("Not a Palindrome.");   
   }  
}  
