import java.util.Scanner;
public class UserInputObject {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        Float c = a*b*0.1f;
        System.out.println(c);
    }
}
