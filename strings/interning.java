package strings;

public class interning {
    public static void main(String[] args) {
        String s = "Raghav";
        String q = "Raghav";
        String t = new String("Raghav");
        // Raghav -> Madhav
        // s.charAt(0) = 'M'; Error
        // s.charAt(2) = 'd'; Error
        //s = "Madhav";
        System.out.println(s);

    }
}
