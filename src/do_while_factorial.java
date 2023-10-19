import java.util.Scanner;

public class do_while_factorial {
    public static void main(String[] args)
    {
        int fact=1, i=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number ");
        int x =sc.nextInt();
        do {
            fact=fact*i;
            i++;

        }
        while(i<=x);
        {
            System.out.println("Factorial "+fact);
        }

    }
}
