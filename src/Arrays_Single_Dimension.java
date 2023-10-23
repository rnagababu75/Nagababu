//import java.util.*;

public class Arrays_Single_Dimension {
    public static void main(String[] args)
    {
        int i;
        int[] a  = {4,5,3,2,8};
        int Max = a[0];
        for(i=0; i<a.length; i++) {

            if (Max < a[i]) {

                Max = a[i];
                String index = String.valueOf(i);

            }

        }
        System.out.println("maximum number " + Max);
        System.out.println("Index of max is: "+String.valueOf(i));



    }
}
