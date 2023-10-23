package Array;

public class Array_Squares {
    public static void main(String[] args)
    {
        int a[][] = {{8,5,4},
                {4,5,2},
                {5,3,1}};
        for(int i=0; i<a.length; i++)
        {
            for(int j=0; j<a[i].length; j++)
            {

                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        for(int i=0; i<a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {

                System.out.print(a[i][j] * a[i][j] + " ");
            }
            System.out.println();
        }
    }
    }
