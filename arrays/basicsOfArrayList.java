package arrays;
import java.util.ArrayList;
public class basicsOfArrayList {
    public static void main(String[] args) {
//        int[] arr = new int[6];
//        double[] brr = {3.14,2.87,5.6};
        ArrayList<Integer> arr = new ArrayList<>(6);
        arr.add(0,10); // arr[0] = 10
        arr.add(1,20); // initialize
        arr.add(2,30);
        arr.add(3,40);
        arr.add(4,50);
        arr.add(5,60);
        // System.out.println(arr.size());
        System.out.println(arr);
        arr.set(2,300); // modify
        System.out.println(arr);
        arr.add(90); // push back
        // System.out.println(arr.size());
        System.out.println(arr);
    }
}
