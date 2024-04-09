package strings;

public class lowerUpperCase {
    public static void main(String[] args) {
        String s = "Raghav Garg IS 24 Years Old";
        // System.out.println(s.toLowerCase());
        // s.toLowerCase(); -> nothing will happen
        s = s.toLowerCase();
        System.out.println(s);
        System.out.println(s.toUpperCase());

        String a = "abc";
        String b = "xyz";
        // a.concat(b); -> nothing
        System.out.println(a.concat(b));
        System.out.println(a);
        a = a.concat(b);
        System.out.println(a);

        String x = ""; // Empty String
        System.out.println(x.length());
    }
}
