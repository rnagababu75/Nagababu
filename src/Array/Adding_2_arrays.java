package Array;

public class Adding_2_arrays {
    public static void main(String[] args)
    {
        int i,j,k,l;
        int a[][] = {{3,4,2},
                {7,6,8},
                {9,3,6}};

       int b[][] = {{9,3,7},
                {7,4,2},
                {4,7,5}};


        for(i=0;i<a.length;i++ )
        {
            for(j=0; j<a[i].length;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("                 ");

        for(k=0; k<b.length; k++)
        {
            for(l=0; l<b[k].length; l++)
            {
                System.out.print(b[k][l]+" ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.print(a[0][0]+b[0][0]+" ");
        System.out.print(a[0][1]+b[0][1]+" ");
        System.out.print(a[0][2]+b[0][2]+" ");

        System.out.println();
        System.out.print(a[1][0]+b[1][0]+" ");
        System.out.print(a[1][1]+b[1][1]+" ");
        System.out.print(a[1][2]+b[1][2]+" ");

        System.out.println();
        System.out.print(a[2][0]+b[2][0]+" ");
        System.out.print(a[2][1]+b[2][1]+" ");
        System.out.print(a[2][2]+b[2][2]+" ");


    }
}
