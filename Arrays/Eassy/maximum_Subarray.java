public class maximum_Subarray{
    public static int res(int[] arr,int K){
        int n=arr.length;
        int cnt=0;
        int sum=0;
        int max=0;
        int j=0;
        for(int i=0; i<n; i++){
            sum=sum+arr[i];
         while(sum>K){
            sum=sum-arr[j];
            j++;
          }
          if(sum==K){
            cnt=i-j+1;
            max=Math.max(max,cnt);
          }
        }
       return max;
    }
    public static void main(String args[]){
        int[] arr={1,2,4,1,1,1,1,3};
        int result=res(arr, 3);
        System.out.println(result);
    }
}