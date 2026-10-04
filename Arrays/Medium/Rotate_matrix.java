public class Rotate_matrix {
    public static int[][] Roatate(int[][] arr){
         int n=arr.length;
         int m=arr[0].length;
         for(int i=0; i<n; i++){
            for(int j=i+1; j<m; j++){
                swap(arr,i,j);
            }
         }
         for(int i=0; i<n; i++){
            int left=0;
            int right=m-1;
            while(left<right){
                int temp=arr[i][left];
                arr[i][left]=arr[i][right ];
                arr[i][right]=temp;
                left++;
                right--;
            }
        
         }
         return arr;
    }
    public static void swap(int[][] arr, int i, int j){
        int temp=arr[i][j];
        arr[i][j]=arr[j][i];
        arr[j][i]=temp;

        
    }
    public static  void main(String args[]){
        int[][] arr={{1,2,3},{2,5,6},{6,8,9}};
        int[][] res=Roatate(arr);
        for(int i=0; i<res.length; i++){
            for(int j=0; j<res[0].length; j++){
                System.out.print(res[i][j] +" ");

            }
            System.out.println(" ");
        }
    }
}
