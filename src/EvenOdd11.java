import java.util.Scanner;
public class EvenOdd11 {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();

        int oddSum = 0;
        int evenSum = 0;
        for (int i = 0; i < input.length(); i++) {
            int digit = input.charAt(i) - '0';
            if (digit % 2 == 0) {
                evenSum += digit;
            } else {
                oddSum += digit;
            }
        }
        System.out.printf("The sum of the odd digits are %d\n", oddSum);
        System.out.printf("The sum of the even digits are %d", evenSum);
    }
}

