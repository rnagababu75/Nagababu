import java.util.Scanner;
public class Speed {
    public static void main(String[] args)
    {
       Double distance, time;
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter distance and time ");
       distance = sc.nextDouble();
       time = sc.nextDouble();
       double speed_ms = distance/time;
       double speed_kmph = (distance/1000)/(time/3600);
       double speed_mls = speed_kmph*2.32;
       System.out.println("speed in ms "+speed_ms);
       System.out.println("speed in kmph "+speed_kmph);
       System.out.println("speed in mls "+speed_mls);


    }
}
