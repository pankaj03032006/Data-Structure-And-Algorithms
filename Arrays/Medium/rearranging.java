public class rearranging {
    public static int[] Reaaran(int[] arr){
        int n=arr.length;
        int pos=0;
        int j=1;
        int[] ans=new int[n];
        for(int i=0; i<n; i++){
          if(arr[i]>=0){
            ans[pos]=arr[i];
            pos+=2;
          }else{
            ans[j]=arr[i];
            j+=2;
          }
            
        }
        return ans;
    } 
  public static void main(String args[]){
    int[] arr={1,2,4,-1,2,-4,-7,-8};
    int[] res=Reaaran(arr);
    for(int x:res){
        System.out.println(x);
    }
  }
}
