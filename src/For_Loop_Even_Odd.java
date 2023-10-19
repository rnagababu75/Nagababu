import java.util.Scanner;
public class For_Loop_Even_Odd {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any no. ");
        int x = sc.nextInt();
        int i=0,j;
        for(i=0;i<=x;i=i+2)
        {

            System.out.println("Even number " +i);

            //i=i+2;
        }
        for(j=1;j<=x;j=j+2)
        {
            System.out.println("Odd number "+j);
        }


    }
}
