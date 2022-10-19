import java.util.Scanner;

public class Printnumbers1
{
    public static void main(String args[])
    {
        Scanner scanner  = new Scanner(System.in); //input from the user
            System.out.println("Insert start number: "); //user will input number
            int a = scanner.nextInt();
            System.out.println("Insert End Number= ");
            int b = scanner.nextInt();

            for (int i = a ; i <=b; i++)
            {
                System.out.println("Printout = " + i);
            }

    }
}

