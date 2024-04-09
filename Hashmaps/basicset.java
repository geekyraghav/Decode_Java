package Hashmaps;

import java.util.HashSet;

public class basicset {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        System.out.println(set);
        System.out.println(set.contains(10));
        System.out.println(set.size());
        set.remove(10);
        System.out.println(set.contains(10));
        System.out.println(set.size());
        set.add(20);
        System.out.println(set.size());
    }
}
