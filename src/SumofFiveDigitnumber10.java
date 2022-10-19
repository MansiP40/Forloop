import java.util.Scanner;
public class SumofFiveDigitnumber10
{
    public static void main(String[] args)
    {
        int i,n=0,s=0;  //variable declared
        double avg;
        {
            System.out.println("Input the 5 numbers : "); //input will take from user
        }
        for (i=0;i<5;i++ )
        {
            Scanner in = new Scanner(System.in);
            n = in.nextInt();
            s +=n;
        }
        avg=s/5; //average will show due to this method or logic
        System.out.println("The sum of 5 no is : " +s+"\nThe Average is : " +avg);
        //this is how it's going to print in console

    }
}