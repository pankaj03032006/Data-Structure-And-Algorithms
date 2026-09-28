public class elementOnes {

    public static int Missing(int[] arr){
        int n =arr.length;
        int xr=0;
        for(int i=0; i<n; i++){
            xr=arr[i]^xr;
        }
        return xr;

    }
    public static void main(String args[]){
       int[] arr={1,2,2,1,3,4,3};
       System.out.println(Missing(arr));
    }
}
