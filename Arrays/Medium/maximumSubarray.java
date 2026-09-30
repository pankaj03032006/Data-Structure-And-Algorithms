public class maximumSubarray {
    public static int maximumm(int[] arr){
        int n=arr.length;
        int sum=0;
        int ans=Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            sum+=arr[i];
            ans=Math.max(ans, sum);
            if(sum<0){
                sum=0;
            }
        }
        return ans;
    }
    public static void main(String args[]){
        int[] arr={1,1,1,1,-5,2,4,2,-3};
        System.out.println(maximumm(arr));
    }
}
