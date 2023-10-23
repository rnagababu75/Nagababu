package Array;

public class Array_sum {
    public static void main(String[] args)
    {
        int a[][] = {{3,2,1},
                {8,7,5},
                {3,5,9}};
        int sum =0;
        for(int i=0; i<a.length; i++)
        {
            for(int j=0; j<a[i].length; j++)
            {
                System.out.print(a[i][j]+" ");
                sum += a[i][j];
            }
            System.out.println();
        }
        System.out.println(sum);

        System.out.println(a[0][0]+a[0][1]+a[0][2]+
                a[1][0]+a[1][1]+a[1][2]+
                a[2][0]+a[2][1]+a[2][2]);

    }
}
