import java.util.Scanner;
public class do_while_Tables {
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number ");
        int x = sc.nextInt();
        int i=1;
        do {
            //int i=1;
            System.out.println(x+"*"+i+"="+i*x);
            i++;

        }
        while(i<21);
        {


            System.out.println(" ");
        }


    }
}
