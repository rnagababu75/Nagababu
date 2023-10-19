import java.util.Scanner;
public class do_while_Fibnacci {
    public static void main(String[] args)
    {
        int i=0,fib1=0, fib2=1, fib3;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any number ");
        int x = sc.nextInt();
        System.out.println(fib1);
        System.out.println(fib2);

        do {

            fib3 = (fib1+fib2);
            fib1=fib2;
            fib2=fib3;
            ++i;

            System.out.println(fib3);

        }
        while(i<x);
        {
            System.out.println("Fabinacci Series ");
        }


    }
}
