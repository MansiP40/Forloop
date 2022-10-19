import java.util.Scanner;
public class ArmStrongNumber13
{
    public static void main(String[] args) {

        int num, number, temp, total = 0;
        System.out.println("Ënter 3 Digit Number"); // this will take input from user
        Scanner scanner = new Scanner(System.in); //created instance of the scanner class
        num = scanner.nextInt();
        scanner.close();
        number = num;

        for( ;number!=0;number /= 10)
        {
            temp = number % 10; //logic calculation
            total = total + temp*temp*temp;
        }

        if(total == num) //if else logic /method taken
            System.out.println(num + " is an Armstrong number");
        else
            System.out.println(num + " is not an Armstrong number");
    }
}

