import java.util.*;
public class Palindrome12 // Java program to find palindrome number
{
    public static void main(String[]args)
        {
            //Take input from the user
            //Create instance of the Scanner class
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number: ");
            String reverse = "";
            String num = sc.nextLine();
            int length = num.length();
            for ( int i = length - 1; i >= 0; i-- )
                reverse = reverse + num.charAt(i);
            if (num.equals(reverse))
                System.out.println("The entered string " +num +" is a palindrome.");
            //this will print in the console if the number is palindrome
            else
                System.out.println("The entered string " +num +"  isn't a palindrome.");
            //this will print in the console if the number is not palindrome
        }
    }

