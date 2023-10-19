import java.util.Scanner;
public class do_while_Adddigits {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number ");
        int j = sc.nextInt();
        int i,sum=0, rem;
        do
        {
            rem = j%10;
            sum = sum+rem;
            j = j/10;
        }
        while(j>0);
            {
                System.out.println(sum);
            }

    }
}
