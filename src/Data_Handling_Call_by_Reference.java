import java.util.*;

public class Data_Handling_Call_by_Reference {
    int data;

    public Data_Handling_Call_by_Reference(int data) {
        this.data = data;
    }

    private void call_reference() {
        data = data * 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. ");
        int n = sc.nextInt();

        Data_Handling_Call_by_Reference obj = new Data_Handling_Call_by_Reference(n);
        obj.call_reference();
        System.out.println(obj.data);
    }
}
