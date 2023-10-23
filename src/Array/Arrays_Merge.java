import java.util.*;
public class Arrays_Merge {
    public static void main(String[] args)
    {
        String a[] = {"1 Hello ","Man ","How ","Are ","you; "};
        String b[] = {" 2 Can "," Please "," Do "," A "," Small "," Flavour "};
        //a[].appened(b[]);
        int i=0,j=0;
        while(i<a.length)

        {
            System.out.print(a[i]);
            i++;

        }
        while(j<b.length)
        {
            System.out.print(b[j]);

            j++;
        }
    }
}
