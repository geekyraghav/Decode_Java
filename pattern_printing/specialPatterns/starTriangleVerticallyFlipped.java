package pattern_printing.specialPatterns;
import java.util.Scanner;
public class starTriangleVerticallyFlipped {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();

        for(int i=1;i<=n;i++){ // rows
            for(int j=1;j<=n;j++){ // cols
                if(i+j > n) System.out.print("*" + " ");
                else System.out.print(" " + " ");
            }
            System.out.println();
        }
    }
}
