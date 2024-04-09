package arrays;

public class sumOfArray {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,-9,34,3,5,2,7,3,5,8,1,2,3,3,4};
        // int[] arr = {2,5,7,23,97,3,6,78,23,90};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
