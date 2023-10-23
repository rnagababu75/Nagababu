package Array;

public class Alter_jagged_array {
    public static void main(String[] args)
    {
        int a[][] = {{4,5,2,6,9},
                {5,7,8,9},
                {4,8,9,},
                {5,7,2},
                {9,2},
                {6}};
        for(int i=0; i<a.length; i++)
        {
            for(int j=0; j<a[i].length;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
