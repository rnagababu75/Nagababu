import java.util.*;
public class Function_OverLoading {
    static float Multiplethree(float x)
    {
        return x*x*x;
    }
    static double Multiplethree(double x)
    {
        return x/3.0;
    }
    public static void main(String[] args)
    {
        float k = Function_OverLoading.Multiplethree(0.66f);
        double s = Function_OverLoading.Multiplethree(3.3);
        System.out.println("hello "+k);
        System.out.println("hey "+s);

    }
}

