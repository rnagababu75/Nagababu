import java.util.*;
//package Array;

public class Array_word_Length {
    public static void main(String[] args)
    {
        String a[] = {"Naga","Babuu","Rachamalla","ppt","java"};
        int  Min = a[0].length();
        for(int i=0;i<a.length;i++)
        {

           // System.out.print(a[i]);
            String word = a[i];
            int length = word.length();
            //int length = a[i].length();
            System.out.println(word+" "+i+" "+length);
            if(Min > length)
            {
                 Min = length;

            }
            //System.out.println(a[3]+Min);


        }
        System.out.println("Min Length is: "+Min+" "+a[3]);

        //int g = a.length;
        //System.out.println(g);
    }
}
