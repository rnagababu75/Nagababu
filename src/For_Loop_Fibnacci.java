import java.util.Scanner;
public class For_Loop_Fibnacci {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two digits no.");
        int x = sc.nextInt();
        int fib=0,fib2=1,fib3;
        System.out.println(fib);
        System.out.println(fib2);
                for(int i=0;i<x;i++)
                {
                   fib3=fib+fib2;
                   fib=fib2;
                   fib2=fib3;
                    System.out.println(fib3);
                }

    }

}
