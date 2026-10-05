public class lowerBound {
    public static int result(int[] arr, int target){
        int start=0;
        int end=arr.length-1;
        int ans=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
           if(arr[mid]<=target){
            ans=mid;
            start=mid+1;
           }else{
            end=mid-1;
           }

        }
        return ans;
    }
    public static void main(String args[]){
        int[] arr={1,2,3,4,5,6,9};
        System.out.println(result(arr, 8));
    }
}
