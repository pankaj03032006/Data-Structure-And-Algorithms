

class Check_Sort {
 public static boolean check(int[] arr, int low ,int high){
  if(low>=high){
    return true;
  }
  int mid=low+(high-low)/2;
  if(arr[mid]<=arr[mid+1] &&check(arr, low, mid) && check(arr, mid+1, high) ){
    return true;
  }
  return false;

 }
 public static void main(String[] args){

    int[] arr={1,3,4,5,6,7};

    System.out.println(check(arr,0,4));
 }
    
}