import java.util.Scanner;
public class While_Factorial {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number ");
        int x = sc.nextInt();
        int fact=1,i=1,j;
        while(x>i)
        {
            fact = fact*i;
            ++i;

        }
        System.out.println(fact);

    }
}
