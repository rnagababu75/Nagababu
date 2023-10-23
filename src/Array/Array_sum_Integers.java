import java.util.*;
// Sum of the integers and average in an array;
public class Array_sum_Integers {

    public static void main(String[] args)
    {
        int i,sum=0;
        float average;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements ");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter all elements here ");
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            sum=sum+a[i];
            System.out.println(a[i]+"sum is "+sum);
        }
        System.out.println("sum is "+sum);
        average = (float)sum / n;
        System.out.println("Average "+average);
    }
}
