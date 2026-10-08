public class StrictlyGreater {
    public static int result(int[] arr){
        int n=arr.length;
        int start=0;
        int end=n-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]<arr[mid+1]){
                start=mid+1;
               
            } 
            end=mid;
        }
       return start;

    }

    public static void main(String[] args){
        int[] arr={1,2,3,4,7,2,1};
        System.out.println(result(arr));
    }
}
