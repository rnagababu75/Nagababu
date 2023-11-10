import java.util.*;
 /*3. Write another function named display() which takes 4 arguments.
        The arguments are named as String and 3 arrays (Employee id, name and salary).
        Function prototype looks like:display (String name, int regno[], String Empname[], double salary[]).
        This function will search for the name in the Empname array and will display its corresponding id and salary in the below given format.
        For example, if Divya is given as the name to search then display () function will display the following record.*/
public class Array_e_ass_3 {
 public static void main(String[] args)
 {
     Array_e_ass_3 obj = new Array_e_ass_3();
     obj.display();
 }
    public void display()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the employee Name: ");
        String name = sc.nextLine();

        String[] empname = {"Naga","babu","Nagu","Gimmu"};
        int[] regno = {231, 234, 232, 221};
        double[] salary =  {55.0000, 66.0000, 54.0000, 67.0000, 87.0000};

        for(int i=0; i<empname.length; i++ )
        {
            if(empname[i].equals(name))
            {
                System.out.println("Employee name "+empname[i]);
                System.out.println("Employee id "+regno[i]);
                System.out.println("Employee salary "+salary[i]);
            }

        }
    }
 }
