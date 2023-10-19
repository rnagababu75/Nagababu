import java.util.Scanner;
public class While_Reverse {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter digits of a number ");
        int x = sc.nextInt();
        int rem=0,rev=1,i=1;
        while(x>i)
        {
            rem=x%10;
            x=x/10;
            ++i;
            System.out.print(rem);

        }


    }
}
