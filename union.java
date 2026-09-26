public class union{
    public static int[] find(int[] arr1, int[] arr2){
          int n=arr1.length;
          int m=arr2.length;
         int[] arr3=new int[m+n];
          int i=0;
          int j=0;
          int k=0;
          while(i<n && j<m){
            if(arr1[i]<arr2[j]){
                arr3[k]=arr1[i];
                i++;
                k++;
            }else if(arr1[i]>arr2[j]){
                arr3[k]=arr2[j];
                j++;
                k++;
            }else{
                arr3[k]=arr1[i];
                i++;
                j++;
                k++;
            }
            
          }
          while(i<n){
            arr3[k]=arr1[i];
            i++;
            k++;
          }
          while(j<m){
            arr3[k]=arr2[j];
            j++;
            k++;
          }
          int[] ans=new int[k];
          for(i=0; i<k; i++){
            ans[i]=arr3[i];
          }
          return ans;

    }

    public static void main(String args[]){
        int[] arr1={1,2,3,4  };
        int[] arr2={2,4,5};
        int[] res=find(arr1, arr2);
        for(int X:res){
            System.out.println(X);
        }
    }
}