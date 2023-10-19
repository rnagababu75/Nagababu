import java.util.Scanner;
public class If_Even_Odd {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Here you can check whether the number is even or odd ");
        int num = sc.nextInt();
        if(num%2==0)
        {
            System.out.println("It is a even number ");
        }
        else {
            System.out.println("It is a odd number ");
        }
    }
}
