import java.util.Scanner;
public class For_Loop_Reverse_Digits {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. for reversing");
        int x = sc.nextInt();
        int i,j,temp=0;
        for(i=0;i<x;i++)
        {
           // j = x%10;
            temp = x%10+temp*10;
            x=x/10;
        }
        System.out.println("reverse of a number is "+temp);
    }
}
