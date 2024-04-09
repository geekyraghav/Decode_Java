package pattern_printing.compositePatterns;
import java.util.Scanner;
public class starBridge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();

        for(int i=1;i<=2*n-1;i++){
            System.out.print("*" + " ");
        }
        System.out.println();
        n--;
        int nsp = 1;
        for(int i=1;i<=n;i++){ // rows
            for(int j=1;j<=n+1-i;j++){ // stars
                System.out.print("*" + " ");
            }
            for(int j=1;j<=nsp;j++){ // spaces
                System.out.print(" " + " ");
            }
            nsp += 2;
            for(int j=1;j<=n+1-i;j++){ // stars
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}
