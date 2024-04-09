package TwoDimensionalArray;
import java.util.Scanner;
public class outputUsingNestedLoops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[2][3];

        int m = arr.length; // no of rows
        int n = arr[0].length; // no of cols
        System.out.println(n);
        // Input of 2D Array
        for(int i=0;i<m;i++){ // rows
            for(int j=0;j<n;j++){ // cols
                arr[i][j] = sc.nextInt();
            }
        }

        // Output of 2D Array
        for(int i=0;i<m;i++){ // rows
            for(int j=0;j<n;j++){ // cols
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}
