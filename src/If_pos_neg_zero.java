import java.util.Scanner;
public class If_pos_neg_zero {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any +ve,-ve or zero number ");
        int x = sc.nextInt();
        if(x>0)
        {
            System.out.println("It is +ve number "+x);
        }
        else if(x==0)
        {
            System.out.println("It is Zero "+x);
        }
        else {
            System.out.println("It is a -ve number "+x);
        }
    }
}
