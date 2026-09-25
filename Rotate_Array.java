public class Rotate_Array {
    public static int[] rotate(int[] arr){
        int n=arr.length;
        int temp=arr[0];
       for(int i=0;i<n-1; i++){
        arr[i]=arr[i+1];
       }
        arr[n-1]=temp;
       
        return arr;
    }
    public static void main(String args[]){
        int[] arr={2,4,5,6,9};
        int[] res=rotate(arr);
        for(int x:res){
            System.out.println(x);
        }
    }
}
