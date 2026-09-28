import java.lang.reflect.Array;
import java.util.Arrays;

public class Second_largest {
    public static int SLargest(int[] arr){
        int n=arr.length;
        int prev=-1;
        int curr=Integer.MIN_VALUE;
        for(int i=1; i<n; i++){
            if(arr[i]>curr){
                prev=curr;
                curr=arr[i];
            }
            else if(arr[i]>prev && arr[i] !=curr){
                prev=arr[i];
            }
        }
        return curr;
    }
    public static void main(String args[]){
        int[] arr={2,3,4,5,17,18};

        System.out.println(SLargest(arr));
    }
}
