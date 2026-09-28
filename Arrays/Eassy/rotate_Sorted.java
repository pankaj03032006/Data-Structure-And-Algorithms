public class rotate_Sorted{
    public static boolean sorted(int[] arr){
        int n=arr.length;
        int cnt=0;
        for(int i=0; i<n-1; i++){
            if(arr[i]>arr[i+1]){
                cnt++;
            }
        }
         if(cnt==0)
            return true;
         else if(cnt==1 && arr[0]>=arr[n-1])
            return true;
            
         return false;
}
    public static void main(String args[]){
        int[] arr={4,9,10,18,1,4};
        System.out.println(sorted(arr));
    }
}