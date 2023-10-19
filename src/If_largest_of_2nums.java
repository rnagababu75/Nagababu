import java.util.Scanner;
public class If_largest_of_2nums {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any 2 nums ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        if(num1>num2)
        {
            System.out.println("num1 is big "+num1);
        }
        else {
            System.out.println("num1 is small "+num2);
        }
    }
}
