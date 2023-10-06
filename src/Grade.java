import java.util.Scanner;
public class Grade {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Tel, Eng, Hin, Mat, Sci, Soc");
        double Tel = sc.nextDouble();
        double Eng = sc.nextDouble();
        double Hin = sc.nextDouble();
        double Mat = sc.nextDouble();
        double Sci = sc.nextDouble();
        double Soc = sc.nextDouble();
        double total = (Tel+Eng+Hin+Mat+Sci+Soc);
        double percentage = (total/600)*100;
        System.out.println("Percentage "+percentage);
        if( percentage <= 30)
        {
            System.out.println("grade F-fail");
        }
        else if(percentage <= 35)
    {
        System.out.println("grade e-pass");
    }
        else if(percentage <= 40)
    {
        System.out.println("grade d-pass");
    }
        else if(percentage <= 50)
    {
        System.out.println("grade c-pass");
    }
        else if(percentage <= 60)
    {
        System.out.println("grade b-pass");
    }
        else if(percentage <= 70)
    {
        System.out.println("grade a-pass");
    }
        else if(percentage <= 80)
    {
        System.out.println("grade a+-pass");
    }
        else if(percentage <= 90)
    {
        System.out.println("grade a++-pass");
    }
        else if(percentage <= 100)
    {
        System.out.println("grade Excellent-pass");
    }

    }
}
