package Arrays;

public class ReverseAnArray {
  public static void main(String[] args) {
    int [] arr = {10,70,90,20};

    reverseArray(arr);

    for(int x: arr){
      System.out.print(x+" ");
    }
  }

  public static void reverseArray(int []arr){
      int l = 0;
      int r = arr.length -1;
      
      while( l < r){
        int temp = arr[r];
        arr[r] = arr[l];
        arr[l] = temp;
        l++;
        r--;
      }
  }
}
