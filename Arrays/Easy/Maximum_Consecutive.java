public class Maximum_Consecutive{
  public static int result(int[] arr){
    int n=arr.length;
    int cnt=0;
    int max=0;
    for(int i=0; i<n; i++){
       if(arr[i]==1){
        cnt++;
        max=Math.max(max,cnt);
       }else{
        cnt=0;
       }
    }
    return max;
  }
  public static void main(String args[]){
    int[] arr={1,1,1,0,0,0,1,1,1,1,1,1,0,1,1,1,0};
    System.out.println(result(arr));
  }
}