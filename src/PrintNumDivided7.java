
import java.util.Scanner;

public class PrintNumDivided7
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;  //variable has being declared
        System.out.print("Range of the number: "); //allow this user to insert number
        n=input.nextInt();

        System.out.println("Divided by : 3"); //this will divide the meth od to 3
        for (int i = 1; i <= n; i++) {
            if(i%3==0) System.out.print(i+", ");
        }
        System.out.println("\nDivided by : 5");
        //this will divide the digit with space and logic method nd it will divide by 5
        for (int i = 1; i <= n; i++) {
            if(i%5==0) System.out.print(i+", "); //if logic as being used for condition
        }
        System.out.println("\nDivided by : 3 & 5"); //this will divide with 3&5
        for (int i = 1; i <= n; i++) {
            if(i%3==0 && i%5==0) System.out.print(i+", "); //condition if
        }
    }
}
