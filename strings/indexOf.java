package strings;

public class indexOf {
    public static void main(String[] args) {
        String s = "Raghav Garg";
        System.out.println(s.indexOf('z'));
        System.out.println(s.indexOf('a'));
        System.out.println(s.lastIndexOf('a'));

        String a = "abc";
        String b = "abcggg";
        System.out.println(a.compareTo(b));

        String c = "Physics Wallah Skills";
        System.out.println(c.contains("lla"));
        System.out.println(c.startsWith("Phy"));
        System.out.println(c.endsWith("lls"));

        System.out.println();
    }
}
