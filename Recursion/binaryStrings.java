package Recursion;
import java.util.Scanner;
public class binaryStrings {
    public static void printStrings(String s, int n){
        int m = s.length();
        if(m==n){
            System.out.println(s);
            return;
        }
        if(m==0 || s.charAt(m-1)=='0'){
            printStrings(s+1,n);
            printStrings(s+0,n);
        }
        else printStrings(s+0,n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printStrings("",n);
    }
}
