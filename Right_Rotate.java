import java.util.Arrays;

public class Right_Rotate {
    public static void reverse(int[] arr, int start, int end){
        while(start<=end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        
       
    }
     public static int[] LRotate(int[] arr,int k){
            int n=arr.length;
            k=k%n;
            reverse(arr,0, k-1);
            reverse(arr, k, n-1);
            reverse(arr, 0, n-1);
            
            return arr;

        }
    public static int[] RRotate(int[] arr,int k){
        int n=arr.length;
         k=k%n;
         reverse(arr, 0, n-1);
         reverse(arr, 0, k-1);
         reverse(arr, k, n-1);
         return arr;

    }
    public static void main(String args[]){
        int[] arr={1,3,4,5,6,7,8,9};
        // int[] res=LRotate(arr, 3);
        int[] res2=RRotate(arr, 3);
        // for(int x:res){
        //     System.out.print(x+" ");
        // }
       
        for(int x:res2){
           System.out.print(x+" ");
        }
    }
}
