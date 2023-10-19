import java.util.Scanner;
public class For_Loop_Tables {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no.");
        int x = sc.nextInt();
        for(int i=0;i<=20;i++)
        {
            System.out.println(x+"*"+i+"="+x*i);
        }
    }
}
