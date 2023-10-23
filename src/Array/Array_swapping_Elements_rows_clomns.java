package Array;

public class Array_swapping_Elements_rows_clomns {
    public static void main(String[] args)
    {
        int a[][] =  {{3,5,2},
                      {6,3,1},
                      {9,2,7}};
        for(int i=0; i<a.length; i++)
        {
            for(int j=0; j<a[i].length; j++)
            {
                System.out.print(a[j][i]+" ");
            }
            System.out.println();
        }
    }
}
