public class first_lastPos {
    public static int result(int[] arr,int target){
        int n=arr.length;
        int start=0;
        int end=n-1;
        int ans=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
               ans=mid;
               end=mid-1;

            }
      else if(arr[mid]>target){
                
                 end=mid-1;
            }else{
               start=mid+1;
            }
  
        }
        return ans;
    }
    public static int result2(int[] arr,int target){
        int n=arr.length;
        int start=0;
        int end=n-1;
        int ans=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
               ans=mid;
               start=mid+1;

            }
           else if(arr[mid]>target){
                
                 end=mid-1;
            }else{
               start=mid+1;
            }
  
        }
        return ans;
    }

    public static int[] Fresult(int[] arr,int target){
        int first=result(arr, target);
        int second=result2(arr, target);
        return new int[]{first,second};
    }
    public static void main(String[] args){
        int[] arr={1,2,3,4,4,4,4,4,5};
        int[] res=Fresult(arr, 4);
        for(int x:res){
        System.out.println(x);
        }
    }
}
