package Array;

public class Array_Multi_Dimensional {
    public static void main(String[] args)
    {
        int a[][] = new int[4][3];
        a[0][0] = 6;
        a[0][1] = 3;
        a[0][2] = 9;

        a[1][0] = 4;
        a[1][1] = 10;
        a[1][2] = 16;

        a[2][0] = 5;
        a[2][1] = 1;
        a[2][2] = 12;

        a[3][0] = 17;
        a[3][1] = 18;
        a[3][2] = 23;



        for(int i=0; i<a.length; i++)
        {

            for(int j=0; j<a[i].length; j++)
            {
                System.out.print(a[i][j]+"   ");
            }
            System.out.println();
        }






    }
}
