package Array;

public class Array_Alternative_2_dimension {
    public static void main(String[] args)
    {
        int a[][] = {{2,3,4,4},{9,8,6,7},{5,6,4,7},{2,9,5,8}};
        for(int i=0; i<a.length; i++)
        {
            for(int j=0; j<a[i].length; j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println( );
        }
    }
}
