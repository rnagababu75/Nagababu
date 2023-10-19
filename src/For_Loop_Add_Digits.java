import java.util.Scanner;
public class For_Loop_Add_Digits {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number ");
        int x = sc.nextInt();
        int i,j,temp=0;
        for(i=0; i<=x; i++)
        {
            j = x%10;
            temp = temp+j;
            x = x/10;

        }
        System.out.println(temp);


    }

}
