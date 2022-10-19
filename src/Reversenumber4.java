import java.util.Scanner;
public class Reversenumber4 {
    public static void main(String[]args){
        int num =0;
        int reversenumber =0;
        System.out.println("Input the Number & Press Enter: "); //this will take input from user flexibility
        Scanner in = new Scanner(System.in);// it will store the number
        num = in.nextInt(); //While loop :
        while (num !=0)
        {
            reversenumber = reversenumber * 10;
            reversenumber = reversenumber + num%10;
            num = num/10;
        }
        System.out.println("Reverse of the input number is : "+reversenumber);
    }
}
