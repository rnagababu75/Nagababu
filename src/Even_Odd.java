import java.util.Scanner;
public class Even_Odd {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int a = sc.nextInt();
        if(a/2 == 0)
        {
            System.out.println("It is a even number");
        }
        else {
            System.out.println("It is a odd number");
        }
        System.out.println("Last Line");
    }
}
