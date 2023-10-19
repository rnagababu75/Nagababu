import java.util.Scanner;
public class do_while_Reverse_of_a_number {
    public static void main(String[] args)
    {
        int rem,x,temp=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any digits");
        x = sc.nextInt();
        do {
            rem = x%10;
            temp = temp*10+rem;
            x = x/10;
        }
        while(x>0);
        {
            System.out.println(temp);
        }



    }

}
