package pattern_printing.compositePatterns;

import java.util.Scanner;

public class numberPyramidPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();

        for(int i=1;i<=n;i++){ // rows
            for(int j=1;j<=n-i;j++){ // spaces
                System.out.print(" " + " ");
            }
            for(int j=1;j<=i;j++){ // stars
                System.out.print(j + " ");
            }
            for(int j=i-1;j>=1;j--){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
