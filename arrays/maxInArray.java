package arrays;

public class maxInArray {
    public static void main(String[] args) {
        int[] arr = {-10,-8,430,12,-5234,-56};
        int n = arr.length;
        int mx = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            // if(arr[i]>mx) mx = arr[i];
            mx = Math.max(mx,arr[i]);
        }

        int smx = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>smx && arr[i]!=mx) smx = arr[i];
            // if(arr[i] != mx) smx = Math.max(smx,arr[i]);
        }
        System.out.println(mx);
        System.out.println(smx);
    }
}
