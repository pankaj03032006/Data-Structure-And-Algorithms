public class Set_matrix {
    public static int[][] matrix(int[][] arr){
        int n=arr.length;
        int m=arr[0].length;
        boolean[] row=new boolean[n];
        boolean[] col=new boolean[m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(arr[i][j]==0){
                  row[i]=true;
                  col[j]=true;
                   
                }
              
            }
        }
          for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(row[i] || col[j]){
                    arr[i][j]=0;
                }
            }
          }
        return arr;
    }
    public static void main(String args[]){
        int[][] arr={{1,2,0},{2,0,8},{2,4,5}};
        int[][] res=matrix(arr);
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                System.out.print(res[i][j] +" ");
            }
            System.out.println(" ");
        }
    }
}
