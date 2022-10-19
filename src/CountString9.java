public class CountString9
        /*Java Program to see user input string and in output it should come count total number of a in that String
 by using a for loop in program.
 */
{
    public static int count(String s, char c) //another method for string and chart
    {
        int res = 0; //Using for loop
        for (int i = 0; i <s.length(); i++)
        {
            if (s.charAt(i) == c)
                res++;
        }
        return res;
    }
    public static void main(String[] args) //Declaring Main method
    {
        String str = "Today is gonna be Sunny Day"; //this statement will consider and output will be from
        char c = 'a'; // particular a chart we want to count so
        System.out.println(count(str, c));
    }
}