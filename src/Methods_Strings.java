import java.util.Arrays;
import java.lang.String;
public class Methods_Strings {
    public static void main(String[] args)
    {
        String s1 = "Hounslow";
        String s2 = "  Asus ";
        String s3 = "Laptop";
        String s4 = "hello london";
        String s5 = "java developer united kingdom hounslow ";
        String s6 = "Hello big boss season five";
        String s7 = "345";

        int k = 3453;
        String sc = new String("Babu");
        String sc1 = new String("LAPTOP");
        String sc2 = new String("rebel");
        String sc3 = new String("  ");

        System.out.println(s1.contains("un"));
        System.out.println(s2.startsWith("As"));
        System.out.println(sc.equalsIgnoreCase(s3));
        System.out.println(sc1.equalsIgnoreCase(s3));
        System.out.println(sc2.endsWith("bel"));

        System.out.println(s1.length()+s2.length());
        System.out.println(s2.length());
        System.out.println(s2.isEmpty());
        System.out.println(s2.trim().length());
        System.out.println(sc3.isBlank());

        System.out.println(s2.toLowerCase());
        System.out.println(s2.trim().toLowerCase());
        System.out.println(s1.toUpperCase());

        //char[] a = s1.toCharArray();
        System.out.println(s1.indexOf("s"));
        System.out.println(s1.indexOf(6)); // if they didn't find the character it will pass the -1
        System.out.println(s4.indexOf("o"));
        System.out.println(s4.lastIndexOf("o"));

        System.out.println(s4.substring(4));
        System.out.println(s4.substring(5,12));
        System.out.println(Arrays.toString(s5.split(" ")));
        System.out.println(Arrays.toString(s6.split("//^")));

        System.out.println(s4.charAt(8)); // giving index number it will through the character

        System.out.println(s5.replace("o","A"));
        System.out.println(s6.replace("five","seven"));

        System.out.println(Integer.valueOf(s7));

        System.out.println(String.valueOf(k));
        System.out.println(s3.replaceAll("Laptop","hello"));








    }
}
