import java.util.Scanner;
public class Fibonacci2 //programme for fibonacci which will be series of numbers
{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of terms"); //this will allow to user insert there choice of number
        int n= scanner.nextInt();
        int x =0,y=1,nextTerm;
        System.out.println("Fibonacci series is "); //this will show it is fibonacci number or not
        for(int c=0;c<n;c++)
        {
            if(c<=1) //ifelse logic has being used for thus
                nextTerm=c;
            else{
                nextTerm=x+y;
                x=y;
                y=nextTerm;
            }
            System.out.println(nextTerm);
        }
    }
}
