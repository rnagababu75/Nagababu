import java.util.Scanner;
public class While_Even_Odd {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number ");
        int x = sc.nextInt();
        int num1=0,num2=1;
        while(num1<x||num2<x)
        {
            System.out.println("Even number "+num1);
            num1=num1+2;
            System.out.println("Odd numbers "+num2);
            num2=num2+2;
        }

    }

}
