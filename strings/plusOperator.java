package strings;

public class plusOperator {
    public static void main(String[] args) {
        String s = "abc";
        String t = "pqr";
        s += t; // s = abcpqr
        s = 10 + s;
        System.out.println(s);
        System.out.println("Hi i am "+10);

        System.out.println("abc"+10+20);
        System.out.println(10+20+"abc");

    }
}
