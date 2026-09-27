public class missing {
    public static int[] mElelemnt(int[] arr){
        int n=arr.length;
       boolean[] present=new boolean[n+1];
       for(int i=0; i<n; i++){
        present[arr[i]] = true;
       }
       int k=0;
       for(int i=0; i<=n; i++){
        if(!present[i]){
            k++;
        }
        
       }
       int[] ans=new int[k];
       int j=0;
       for(int i=0; i<=n; i++){
        if(!present[i]){
         ans[j]=i;
         j++;
        }
       }
       return ans;
    }
    public static void main(String args[]){
        int[] arr={1,0,3};
        int[] res=mElelemnt(arr);
        for(int x:res){
            System.out.println(x);
        }
    }
}
