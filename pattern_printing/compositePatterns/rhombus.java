package pattern_printing.compositePatterns;
import java.util.Scanner;
public class rhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){ // rows
            for(int j=1;j<=n-i;j++){ // spaces
                System.out.print(" " + " ");
            }
            for(int j=1;j<=n;j++){ // stars
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}
