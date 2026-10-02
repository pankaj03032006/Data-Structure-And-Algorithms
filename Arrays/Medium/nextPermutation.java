public class nextPermutation {
    public static int[] next(int[] arr){
        int n=arr.length;
        int i=n-2;
        while(i>=0 && arr[i]>=arr[i+1]){
            i--;
        }
        if(i>=0){
            int j=n-1;
            while(arr[j]<=arr[i]){
                j--;
            }
            swap(arr,i,j);
        }
        reverse(arr,i+1,n-1);
    return arr;
    }
    public static void swap(int[] arr, int i, int j){
        int temp=arr[i];
          arr[i]=arr[j];
          arr[j]=temp;

    }
    public static void reverse(int[] arr, int i , int j){
       
        while(i<j){
            swap(arr, i, j);
            i++;
            j--;
        }
    }
    public static void main(String args[]){
        int[] arr={7,9,8,4,3};
        int[] res=next(arr);
        for(int x:res){
            System.out.print(x+" ");
        }
    }
}
