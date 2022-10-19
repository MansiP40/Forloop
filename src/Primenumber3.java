import java.util.Scanner;
public class Primenumber3 {
    static int number;
    static int count =0; //variable has being declared
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter any Number : "); //this will allow user to insert number
        int number = scanner.nextInt();
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) //if nested had being used
            {
                count++;
            }
            if (count == 2)
            {
                System.out.println("This number  is a prime number.");
            } else //also if else being used
            {
                System.out.println("This number  is not a prime number."); //this will print out in console
            }
        }
    }}
