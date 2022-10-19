import java.util.Scanner;
public class OddEvenSum11 {
    public static void main (String args[])
    {
        int i,num;  //declare variable i,num
        int oddSum=0,evenSum=0;

        Scanner scan=new Scanner(System.in);  //create a scanner object for input
        System.out.print("Enter the number for num: \n");
        num=scan.nextInt(); //reads num1 from user
        for(i=1; i<=num; i++){
            if(i%2==0)
                evenSum=evenSum+i; //method or logic with if else method
            else
                oddSum=oddSum+i;
        }
        System.out.println("Sum of all odd numbers are: "+oddSum); //this will print if the number is odd
        System.out.println("Sum of all even numbers are: "+evenSum); //this will print if the number is even
    }
}


