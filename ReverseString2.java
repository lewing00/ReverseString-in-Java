import java.util.Scanner;

public class ReverseString2{
   public static void main(String[] args){
     
     Scanner keyboard = new Scanner(System.in);
     StringBuilder sBuild = new StringBuilder();
     
     System.out.print("Enter a string to reverse: ");
     String str = keyboard.nextLine();
     
     for(int i = str.length() - 1; i >= 0; i--){
     
         sBuild.append(str.charAt(i));
         
     }//for loop
     
     System.out.print("The reversed string is: ");
     System.out.println(sBuild.toString());
     
   }//main
}//class