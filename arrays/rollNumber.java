package arrays;

public class rollNumber {
    public static void main(String[] args) {
        int[] arr = {81,45,17,100,12,34};

        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if(arr[i]<35)
                System.out.print(i+" ");
        }
    }
}
