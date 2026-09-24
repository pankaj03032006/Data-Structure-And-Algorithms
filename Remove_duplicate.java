public class Remove_duplicate {
    public static int[] remove(int[] arr){
        int n=arr.length;
        int j=0;
        for(int i=1; i<n; i++){
           if(arr[i] !=arr[j]){
              j++;
              arr[j]=arr[i];
           }
        }
           int[] ans=new int[j+1];
           for( int i=0; i<=j; i++){
            ans[i]=arr[i];
           }
        
        return ans;

    }
    public static void main(String args[]){
        int[] arr={1,1,1,1,2,2,3,4,5};
       int[] res=remove(arr);
       for(int x:res)
            System.out.println(x);
       
    }
}
