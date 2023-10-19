import java.util.*;
public class Data_Handling_Function {
     static int square(int x)
    {

        int y =x*x;
        return y;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number ");
        int n = sc.nextInt();
        int result =    Data_Handling_Function.square (n);
        System.out.println(" Suquare of a number is "+result);
    }
}



