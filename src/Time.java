import java.util.Scanner;
public class Time {
    public static void main(String[] args)
    {
        Double time, Seconds, hours, remainder, mins, remainderr;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of seconds ");
        Seconds = sc.nextDouble();
        hours = (Seconds)/(3600);
        remainder = (Seconds)%(3600);
        mins = (remainder)/(60);
        Seconds = (remainder)%(3600);
        System.out.println("Hours "+hours+" Mins "+mins+" Seconds "+Seconds);




    }
}
