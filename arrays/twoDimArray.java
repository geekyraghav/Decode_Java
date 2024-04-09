package arrays;
public class twoDimArray {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4},{5,6,7,8}};
        int m = arr.length;
        int n = arr[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
