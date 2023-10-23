package Array;

public class jagged_Array {
    public static void main(String[] args)
    {
        int a[][] = new int[4][];
        a[0]= new int[3];
        a[1]= new int[5];
        a[2]= new int[2];
        a[3]= new int[3];

        a[0][0]= 3;
        a[0][1]= 1;
        a[0][2]= 4;

        a[1][0]= 9;
        a[1][1]= 4;
        a[1][2]= 3;
        a[1][3]= 8;
        a[1][4]= 1;

        a[2][0]= 2;
        a[2][1]= 13;

        a[3][0]= 9;
        a[3][1]= 7;
        a[3][2]= 3;

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
