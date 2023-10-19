import java.util.Scanner;
public class do_while_Even_Odd {
    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter any number ");
       int x = sc.nextInt();
       int k=0,j=1;
       do {
           System.out.println("Even number "+k);
           k=k+2;
           System.out.println("odd number "+j);
           j=j+2;
       }
       while(x>k || x>j);
        {
            System.out.println("This ");
        }

       //int i=0;
       /*do {

           System.out.println("Even number "+i);
           i=i+2;

       }
       while(x>i);
        {
           System.out.println("j ");
        }
        i=1;
        do
        {
            System.out.println("Even number "+i);
            i=i+2;
        }
        while(x>i);
        {
            System.out.println("kk");
        }

        */










    }


}
