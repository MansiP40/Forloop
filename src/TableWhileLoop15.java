import java.util.Scanner;

public class TableWhileLoop15
{
        //Declaring Main method
    public static void main(String[] args) {

        // Take input from the user
        // create an object of Scanner class
        Scanner scanner = new Scanner(System.in);
        //Declaring for number 1 output
        System.out.println("Enter Number 1: ");
        int x = scanner.nextInt();//get input from the user for number 1
        //Declaring for number 2 output
        System.out.println("Enter second number2: ");
        int y = scanner.nextInt();//get input from the user for number 2
        //Declaring for number 3
        System.out.println("Enter third number3: ");
        int z = scanner.nextInt();//get input from the user for number 3
        int i = 1;

          //Declaring do-while loop using this logic
        do {

            System.out.println(x*i + " " +  y*i + " " + z*i);
            i++;
        }
        while(i<=7);

    }
}