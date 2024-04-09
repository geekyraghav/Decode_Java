package pattern_printing.specialPatterns;
import java.util.Scanner;
public class binaryTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();

        for(int i=1;i<=n;i++){ // rows
            for(int j=1;j<=i;j++){ // cols
                if((i+j)%2==0) System.out.print(1 + " ");
                else System.out.print(0 + " ");
            }
            System.out.println();
        }
    }
}
