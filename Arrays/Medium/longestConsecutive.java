import java.util.*;
public class longestConsecutive {
    public static int result(int[] arr){
        HashSet<Integer> set=new HashSet<>();
        for(int x:arr){
          set.add(x);
        }
        int longest=0;
        for(int x:set){
            if(! set.contains(x-1)){
                int current=x;
                int cnt=1;
                while(set.contains(current+1)){
                    current++;
                    cnt++;
                }
                longest=Math.max(longest,cnt);
             }
        }
      return longest;
        
    }
    public static void main(String args[]){
        int[] arr={1,2,3,6,5,4,7,8,9};
        System.out.println(result(arr));
    }
}
