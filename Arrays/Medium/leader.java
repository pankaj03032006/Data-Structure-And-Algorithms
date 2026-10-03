import java.util.*;
public class leader {

public static ArrayList<Integer> result(int[] arr){
   ArrayList<Integer> ans=new ArrayList<>();
   int n=arr.length;
   ans.add(arr[n-1]);
   int max=arr[n-1];
   for(int i=n-2; i>=0; i--){
    if(arr[i]>max){
        ans.add(arr[i]);
        max=arr[i];
    }
   }
   Collections.reverse(ans);
   return ans;
}
public static void main(String args[]){
    int [] arr={1,7,5,6,1};
    ArrayList<Integer> res=result(arr);
    for(int x:res){
      System.out.println(x);
    }
    
}
}
