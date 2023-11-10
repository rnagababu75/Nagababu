import java.util.*;
//1. Write a program to accept 5 employee IDs and the corresponding names and their salaries-
// -from the user and store them in three arrays.Pass these arrays to a function display() as arguments.
// This display() will display the content of the arrays in the following format.

public class Array_e_ass_one {
    public static void main(String[] args)
    {
       int k = Array_e_ass_one.display();
       System.out.println(k);


    }
    public static int display()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a any five employee Id's Name's Salarie's");
        int ids[] = new int[5];
        String names[] = new String[5];
        float salary[] = new float[5];
        for(int i = 0; i < 4; i++)
        {
            System.out.print("Enter employee ids ");
            ids[i] = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter employee names here ");
            names[i] = sc.nextLine();

            System.out.print("Enter employee salaries ");
            salary[i] = sc.nextFloat();
            sc.nextLine();

        }
        System.out.println("Ids "+"Names "+"Salary ");
        for(int i = 0; i < 5; i++)
        {
            System.out.println(ids[i]+" "+names[i]+" "+salary[i]);
        }
        return 0;
    }
}
