package Searching;

public class BinarySearch {
  public static void main(String[] args) {
    int[] arr = {10,20,30,40,50,60,70};
    int x = 70;


    int low = 0;
    int high = arr.length-1;
    

    while( low<=high){
      int mid = (int)((low+high)/2);
      if(x == arr[mid]){
       System.out.print(mid);
       return;
      } else if( x > arr[mid]){
        low = mid+1;
      } else {
        high = mid-1;
      }
    }
  }
}
