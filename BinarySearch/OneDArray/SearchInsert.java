public class SearchInsert {
    public static int result(int[] arr,int k){
        int n=arr.length;
        int start=0;
        int end=n-1;
        int ans=-1;
        while(start<=end){
            int mid=start +(end-start)/2;
            if(arr[mid]==k){
                ans=mid;
                break;
            }else if(arr[mid]>k){
               ans=mid;
               end=mid-1;
               
            
            }else{
               start =mid+1;
            }
        }
        return ans;
    }
    public static void main(String args[]){
      int[] arr={1,2,3,5,6};
      System.out.println(result(arr, 4));
    }
}
