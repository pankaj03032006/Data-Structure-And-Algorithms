import java.util.*;

public class largest_element {
    public static int largest(int[] arr){
        int n=arr.length;
        int ans=Integer.MIN_VALUE;

        for(int i=0; i<n; i++){
        if(ans<arr[i]){
          ans=arr[i];
        }
    }
        return ans;
    }
    public static void main(String args[]){
        int[] arr={2,6,9,7,10,18};
        System.out.println(largest(arr));
    }
}
