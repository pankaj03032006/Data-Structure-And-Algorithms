import java.util.HashMap;

public class SumIndex {

    public static int[] Index(int[] arr, int k) {
       HashMap<Integer,Integer> map=new HashMap<>();
       int sum=0; 
       int n=arr.length;
       for(int i=0; i<n; i++){
          int need=k-arr[i];
          if(map.containsKey(need)){
            return new int[]{map.get(need),i};
          }
          map.put(arr[i],i);
       }
       return new int[]{};
    }

    public static void main(String[] args) {

        int[] arr = {3,2,4,1,1};
        int k = 6;

        int[] result = Index(arr, k);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}