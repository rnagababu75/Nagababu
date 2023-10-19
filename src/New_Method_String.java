import java.util.Scanner;
import java.lang.String;
public class New_Method_String {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any two String");
        String A = sc.nextLine();
        String B = sc.nextLine();
        System.out.println(A.length()+B.length());

        if(A.compareTo(B)<0)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
       System.out.print(A.substring(0,1).toUpperCase()+A.substring(1)+" "+B.substring(0,1).toUpperCase()+B.substring(1));


    }

}
