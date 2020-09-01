import java.util.Scanner;
 
public class ReverseString
{
 public static void main(String[] args)
 {
 System.out.println("Enter string to reverse:");
 
 String str = "";
 String reverse = "";
 
 Scanner keyboard = new Scanner(System.in);
 str = keyboard.nextLine();
 
 //use length method(char count) to determine length of string (subtract 1 since it will be read as an array in the loop)
 for(int i = str.length()-1; i >= 0; i--)
 {
 //concatonate each letter staring at the end of the string array and working backwards to index 0
 reverse = reverse + str.charAt(i);
 }
 
 System.out.println("Reversed string is:");
 System.out.println(reverse);
 }
}