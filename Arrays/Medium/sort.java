public class sort {
    public static int[] color(int[] arr){
       int n=arr.length;
       int low=0;
       int mid=0;
       int high=n-1;
       while(mid<=high){
        if(arr[mid]==0){
            swap(arr,low,mid);
            low++;
            mid++;
        }
        if(arr[mid]==1){
            mid++;
        }if(arr[mid]==2){
            swap(arr,mid,high);
            high--;
        }
       }
       return arr;
    }
    public static void swap(int[] arr,int x,int y){
        int temp=arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }
    public static void main(String args[]){
        int[] arr={0,0,0,2,2,1,0,1};
        int[] res=color(arr);
        for(int x:res){
            System.out.println(x);
        }
    }
}
