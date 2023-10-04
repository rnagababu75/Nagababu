import java.util.Scanner;
public class Biggest_Of_Three_Numbers {
    public static void main(String[] args)
    {
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three number");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        if(b<a && c<a)
        {

            System.out.println("A is big");

        }
        else if(c<b)
        {
            System.out.print("B is big");
        }
        else
        {
            System.out.println("C is big");
        }






    }
}
