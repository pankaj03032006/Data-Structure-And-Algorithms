public class NumberOfOccurence {
    public static int result(int[] arr, int k){
        int n=arr.length;
        int start=0;
        int end=n-1;
        int ans=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==k){
                ans=mid;
                end=mid-1;
            }else if(arr[mid]>k){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }

        return ans;
    }
    public static int result1(int[] arr, int k){
        int n=arr.length;
        int start=0;
        int end=n-1;
        int ans=-1;
        while(start<=end){
            int mid=start +(end-start)/2;
            if(arr[mid]==k){
                ans=mid;
                start=mid+1;
            }else if(arr[mid]>k){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return ans;
    }
    public static int Fresult(int[] arr, int k){
        
        int first=result(arr, k);
        int second=result1(arr, k);

        int finalVal=(second-first)+1; 
       return finalVal;
    }
    public static void main(String[] args){
        int[] arr={1,2,2,2,2,2,2,2,2,3,4,4};
        int res=Fresult(arr,4 );
        System.out.println(res);
    }
}
