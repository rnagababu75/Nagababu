import java.util.Scanner;
public class While_Fibnacci {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number ");
        int x = sc.nextInt();
        int fib=0,fib1=1,fib3=1,i=1;
        System.out.println(fib);
        System.out.println(fib1);
        while(x>i)
        {
            fib3=fib+fib1;
            fib = fib1;
            fib1 = fib3;
            ++i;
            System.out.println(fib3);

        }


    }
}
