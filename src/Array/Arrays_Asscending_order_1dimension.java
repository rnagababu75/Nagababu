package Array;

public class Arrays_Asscending_order_1dimension {
    public static void main(String[] args)
    {
        int a[] = {7,1,6,3,6,9,5};
        //int Small = a[0];
        int i;
        for(i=0;i<a.length;i++)
        {
          for(int j=0; j<a.length; j++)
          {
              if(a[j] > a[i])  //For descending order change the condition
              {
                  int temp;
                  temp = a[j];
                  a[j] = a[i];
                  a[i] = temp;

                  //System.out.println(a[i]);
              }

          }

        }
        for(int b : a)
        {
            System.out.println(b);

        }
    }
}
