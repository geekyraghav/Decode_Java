package Recursion;

import java.util.ArrayList;
import java.util.Arrays;

public class subsets {
    static ArrayList<String> arr = new ArrayList<>(); // global
    public static void printSubsets(int i, String s, String ans){
        if(i==s.length()){
            arr.add(ans);
            return;
        }
        printSubsets(i+1,s,ans); // not take
        ans += s.charAt(i);
        printSubsets(i+1,s,ans); // take
    }
    public static void main(String[] args) {
        String s = "abcd";
        arr = new ArrayList<>(); // reset
        printSubsets(0,s,"");
        System.out.println(arr);
    }
}
