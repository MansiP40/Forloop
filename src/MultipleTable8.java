import java.util.Scanner;
public class MultipleTable8 {
    public static void main(String[]args){
        int num; //variable declared
        System.out.println("Enter Any Number"); //the user can insert any number they want
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();
        for(int i=1; i<=10; i ++)
        {
            System.out.println(num+ "*" +i+ "=" +num*i); //logic to do this method
        }
    }
}
