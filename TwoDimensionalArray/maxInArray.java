package TwoDimensionalArray;

public class maxInArray {
    public static void main(String[] args) {
        int[][] arr = {{1,5,6},{2,-9,30},{5,10,3}};
        int mx = Integer.MIN_VALUE;
        int m = arr.length;
        int n = arr[0].length;
        int sum = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mx = Math.max(mx,arr[i][j]);
                sum += arr[i][j];
            }
        }
        System.out.println("Max is : "+mx);
        System.out.println("Sum is : "+sum);
    }
}
