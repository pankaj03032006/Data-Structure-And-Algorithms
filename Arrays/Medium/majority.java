public class majority {
    public static int majorityElemt(int[] arr){
        int n=arr.length;
        int vote=1;
        int candidate=arr[0];
        for(int i=1; i<n; i++){
            if(vote<=0){
                candidate=arr[i];
            }
            if(arr[i]==candidate){
                vote++;
            }else{
            vote--;
            }
        }
        return candidate;
    }
    public static void main(String args[]){
        int[] arr={1,1,1,1,2,2,4,4};
        System.out.println(majorityElemt(arr));
    }
}
