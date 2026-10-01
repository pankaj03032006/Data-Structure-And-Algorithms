public class Stock {
    public static int Maximum(int[] arr){
        int n=arr.length;
        int minPrice=arr[0];
        int ans=0;
        for(int i=0; i<n; i++){
            ans=Math.max(ans, arr[i]-minPrice);
            minPrice=Math.min(minPrice, arr[i]);
        }
        return ans;
    }
    public static void main(String args[]){
        int[] arr={1,3,4,5,6,10};
        System.out.print(Maximum(arr));
    }
}
