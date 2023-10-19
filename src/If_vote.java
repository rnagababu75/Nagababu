import java.util.Scanner;
public class If_vote {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age ");
        int age = sc.nextInt();

        if(age>=18)
        {
            System.out.println("Your age is eligible for vote");
        }
        else
        {
            System.out.println("Your age is not eligible for vote ");
        }
    }
}
