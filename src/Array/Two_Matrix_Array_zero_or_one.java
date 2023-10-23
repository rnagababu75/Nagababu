package Array;

public class Two_Matrix_Array_zero_or_one {
    public static void main(String[] args)
    {
        int a[][] =  {{1,4,2},
                       {1,1,1},
                       {1,3,1}};

        int b[][] =  {{1,7,2},
                       {8,1,9},
                       {1,4,1}};


        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {

                if(a[i][j]==1 && b[i][j]==1)
                {
                    System.out.print("1  ");
                }
                else
                {
                    System.out.print("0 ");
                }

            }
            System.out.println();
        }
        System.out.println();
        for(int i=0;i<b.length;i++)
        {
            for(int j=0;j<b[i].length;j++)
            {
                System.out.print(a[i][j]+"  ");


            }
            System.out.println();
        }
        System.out.println();
        for(int i=0;i<a.length;i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(b[i][j]+"  ");
            }
            System.out.println();
        }
    }
}
