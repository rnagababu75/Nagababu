import java.util.Scanner;

public class If_Positive_Negative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any +ve,-ve number ");
        int x = sc.nextInt();
        if (x > 0) {
            System.out.println("It is +ve number " + x);
        } else {
            System.out.println("It is a -ve number " + x);
        }
    }
}
