package Searching;

public class BinaryRecursive{
  public static void main(String[] args) {
    int[] arr = {10,20,30,40,50,60,70};
    int x = 7;

    int low = 0;
    int high = arr.length-1;
System.out.println(binarySearch(arr, x, low,high ));
    
  }

  public static int binarySearch(int [] arr, int x, int low, int high){
    int mid = (low+high)/2;

    if( low > high){
      return -1;
    }
    if(x == arr[mid]) {
      return mid;
    }else if( x>arr[mid]){
      return binarySearch(arr, x, low+1, high);
    }else{
      return binarySearch(arr, x, low, high-1);
    }
  }
}