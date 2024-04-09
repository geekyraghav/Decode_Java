package strings;

public class deleteAndInsert {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("abcdef");
        System.out.println(sb);
        sb.deleteCharAt(3);
        System.out.println(sb); // abcef
        sb.append("xyz");
        System.out.println(sb); // abcefxyz  , cefx (2,5)
        sb.delete(2,6); // deletes characters from 2 to 5
        System.out.println(sb); // abyz -> abgyz
        sb.insert(2,"svg");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);


    }
}
