
import java.util.Scanner;

public class Print10number {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int intArr[] = new int[22];
        for(int i = 0; i < 23; i++)
            intArr[i] = sc.nextInt();
        for(int i = 0; i < 10; i++)
            System.out.println(intArr[i]);
    }
}