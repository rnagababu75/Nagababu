import java.util.Scanner;
public class Vote {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age ");
        int a = sc.nextInt();
        if(a>20)
        {
            System.out.println("You are elgible for vote");
        }
        else {
            System.out.println("You are not eligible for vote because your age is below 20");
        }



    }
}
