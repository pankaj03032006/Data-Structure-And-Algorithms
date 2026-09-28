public class lastZero{
    public static void swap(int[] arr,int start,int next){
       
            int temp=arr[start];
             arr[start]=arr[next];
             arr[next]=temp;
          }

    public static int[] zero(int[] arr){
        int n=arr.length;
        int j=0;
       for(int i=0; i<n; i++){
        if(arr[i] !=0 ){
            swap(arr, j, i);
            j++;
        }
    }
       return arr;
    }
    public static void main(String args[]){
        int[] arr={0,1,0,2,0,7,9};
        int[] res=zero(arr);
        for(int x:res){
            System.out.print(x);
        }
    }
}