import java.util.Scanner;
public class While_Add_Digits {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number ");
        int x = sc.nextInt();
        int rem,temp=0;


        while(x>0)
        {
            rem=x%10;
            temp=temp+rem;
            x=x/10;

        }
        System.out.println(temp);





    }
}
