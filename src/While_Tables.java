import java.util.Scanner;
public class While_Tables {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number u like ");
        int x = sc.nextInt();
        int i=1;
        while(i<=20)
        {
            System.out.println(x+"*"+i+"="+x*i);
            ++i;
        }
    }
}
