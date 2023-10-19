import java.util.Scanner;
public class StringInteger {
    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter any integer");
       int n = sc.nextInt();
       String convertedstring = Integer.toString(n);
       if(convertedstring.equals(String.valueOf(n)))
       {
           System.out.println("Good Job");
       }
       else {
           System.out.println("Wrong Answer");
       }
    }
}
