package pattern_printing.compositePatterns;
import java.util.Scanner;
public class numberBridge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();

        for(int i=1;i<=2*n-1;i++){
            System.out.print(i + " ");
        }
        System.out.println();
        n--;
        int nsp = 1;
        for(int i=1;i<=n;i++){ // rows
            int a = 1;
            for(int j=1;j<=n+1-i;j++){ // number
                System.out.print(a + " ");
                a++;
            }
            for(int j=1;j<=nsp;j++){ // spaces
                System.out.print(" " + " ");
                a++; // very important
            }
            nsp += 2;
            for(int j=5;j<=n+5-i;j++){ // numbers
                System.out.print(a + " ");
                a++;
            }
            System.out.println();
        }
    }
}
