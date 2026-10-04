public class spiral_traversal {
    public static  int[] spiral(int[][] arr){
        int n=arr.length;
        int m=arr[0].length;
        int[] res=new int[n*m];
        int index=0;
        int top=0;
        int left=0;
        int bottom=n-1;
        int right=m-1;
        while(top<=bottom && left<=right){
            for(int j=left; j<=right; j++){
                res[index++]=arr[top][j];
            }
            top++;
            for(int j=top; j<=bottom; j++){
                res[index++]=arr[j][right];
            }
            right--;
            if(top<=bottom){
            for(int j=right; j>=left; j--){
                res[index++]=arr[bottom][j];
            }
            bottom--;
         }
           if(left<=right){
            for(int i=bottom; i>=top; i--){
                res[index++]=arr[i][left];
            }
            left++;
           }
        }
        return res;
    }
    public static void main(String args[]){
        int[][] arr={{1,2,3},{2,5,6},{7,8,9}};
        int[] result=spiral(arr);
        for(int x:result){
            System.out.print(x+" ");
        }
    }
}
