package arrays;

public class smaxInArray {
    public static void main(String[] args) {
        int[] arr = {10,1,3,14,12,19,5,15,19};
        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                smax = max; // important
                max = arr[i];
            }
            else if(arr[i]>smax && arr[i]!=max){
                smax = arr[i];
            }
        }
        System.out.println(max+" "+smax);
    }
}
