import java.util.Scanner;
public class For_Loop_Factorial {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no.");
        int x = sc.nextInt();
        int fact=1;
        for(int i=1;i<=x;i++)
        {
            fact=fact*i;

        }
        System.out.println(fact);

    }

}
