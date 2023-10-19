public class Strings {
    public static void main(String[] args )
    {
        String s1 = "London";
        String s2 = "hello";
        String s3 = "Developer";
        String s4 = "London";
        String sc = new String("hello");
        String sc1 = new String("babu");
        String sc2 = new String("hello");
        System.out.println(s1==s2);
        System.out.println(sc==sc2);
        System.out.println(s1.equals(s4));
        System.out.println(sc2.equals(sc));
        System.out.println(s2.equals(sc2));
    }
}
