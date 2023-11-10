import java.util.*;
//2. Write another function display() withEmployee ID array and Employee name array as arguments.-
//-(Note: here we are using concept of function overloading).-
//-This function will display the content of the 2 arrays in the following format
public class Array_e_ass_2_Function_Display {
    public static void display(int[] ids)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the ids and names ");

        for(int i=0; i<ids.length; i++)
        {
            System.out.println("Enter Employee Ids ");
           ids[i] = sc.nextInt();
           sc.nextLine();

        }


    }
    public static void display(String[] names)
    {
        Scanner sc = new Scanner(System.in);
System.out.println("Enter employee names ");
        for(int i=0; i<names.length; i++)
        {
            System.out.println("Employee names ");
            names[i] = sc.nextLine();
        }

    }
    public static void main(String[] args)
    {
        int ids[] = new int[5];
        String names[] = new String[5];

       Array_e_ass_2_Function_Display.display(ids);
        display(names);
        System.out.println("Id: "+"Names ");

        for(int i=0; i<5; i++)
        {
            System.out.println(ids[i]+" "+names[i]);
        }

    }

}
