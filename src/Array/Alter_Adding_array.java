package Array;

public class Alter_Adding_array {
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
                System.out.print(a[i][j]+b[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("                 ");

        for(i=0;i<b.length; i++) {
            for (j= 0; j < b[i].length; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }

}   }
