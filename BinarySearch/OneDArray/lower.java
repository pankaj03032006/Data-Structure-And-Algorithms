import java.util.*;
public class lower {
    public static int[] lower(int arr[] ,int k){
        int n=arr.length;
        Arrays.sort(arr);
        int start=0;
        int end=n-1;
        int lb=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]<=k){
                lb=mid;
                
                start=mid+1;
                
            }else{
               end=mid-1;
            }
        }
        start=0;

        end=n-1;
        int up=-1;
        while(start<=end){
            int mid=start +(end-start)/2;
            if(arr[mid]>=k){
                up=mid;
                end=mid-1;
            }else{
                start=mid+1;
            }
        
        }
        return new int[]{lb,up};
    }
    public static void main(String args[]){
        int[] arr={1,7,3,5,2,8,9};
        int[] res=lower(arr,6);
        for(int x:res){
            System.out.println(x);
        }
    }
}
