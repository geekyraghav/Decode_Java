package BinarySearch;

public class bs {
    public static void main(String[] args) {
        int[] arr = {10,23,46,89,91,97,107,140,264};
        int n = arr.length;
        int target = 45;
        int lo = 0, hi = n-1;
        boolean flag = false; // false means not present
        while(lo<=hi){
            int mid = (lo+hi)/2;
            if(arr[mid]==target){
                flag = true; break;
            }
            else if(arr[mid]>target) hi = mid - 1;
            else if(arr[mid]<target) lo = mid + 1;
        }
        if(flag==true) System.out.println("Target present");
        else System.out.println("Target not found");
    }
}
