import java.util.*;
public class VectorTest {
    public static void main(String[] args)
    {
        Vector v1 = new Vector();
       v1.add("Naga");
       v1.add("babu ");
       v1.add(0,"rebel");

       Vector v2 = new Vector();
       v2.add("kamal");
       v2.add("mohan ");
       v2.add("Kiran");
       v2.add("lahari");
        System.out.println("before adding v2 to v1 "+v1);
       v1.addAll(v2);
       System.out.println("After adding v2 to v1"+v1);
       System.out.println(v2.get(1));
        v1.remove(2);
        System.out.println(v1);
        v2.remove(3);
        System.out.println("v2 values "+v2);
        System.out.println(v1.contains(v2));
        System.out.println("before removing v2 to v1 "+v1);
        v1.removeAll(v2);
        System.out.println("after removing v2 to v1 "+v1);
        System.out.println(v1);
        System.out.println(v2);

        System.out.println(v1.contains("babu"));
        System.out.println(v2.contains("kamal"));
        System.out.println(v1.contains(v2));
    }
}
