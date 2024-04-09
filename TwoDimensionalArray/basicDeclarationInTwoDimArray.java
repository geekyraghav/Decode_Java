package TwoDimensionalArray;

public class basicDeclarationInTwoDimArray {
    public static void main(String[] args) {
        int[][] grid = new int[3][3];
        // 10 20 30
        // 40 50 60
        // 70 80 90
        grid[0][0] = 10;
        grid[0][1] = 20;
        grid[0][2] = 30;
        System.out.println(grid[2][2]);
        System.out.println(grid[0][1]);
    }
}
