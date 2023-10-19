public class Arthematic_Operation {
    public static void main(String[] args)
    {
        int num1=6, num2=7;
        int a = num1+num2;
        int b= num1-num2;
        int c = num1/num2;
        int d = num1%num2;
        int e = num1*num2;
        num1++;
        ++num1;
        num1--;
        --num1;

        System.out.println("Addition "+a);
        System.out.println("Substraction "+b);
        System.out.println("Division "+c);
        System.out.println("Percentage "+d);
        System.out.println("Multiplication "+e);
        System.out.println("post increment "+num1++);
        System.out.println("Pre increment "+ ++num1);
        System.out.println("post decrement "+num1--);
        System.out.println("pre decrement "+--num1);


    }
}
