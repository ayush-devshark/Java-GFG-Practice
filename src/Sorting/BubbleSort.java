package Sorting;

public class BubbleSort {
  public static void main(String[] args) {
    int [] arr = {10,8,20,5};
    bubbleSort(arr);

    for (int x: arr){
      System.out.print(x+" ");
    }
  }


  public static void bubbleSort(int[] arr){
    int n = arr.length;
    for(int i = 0;i <n;i++){
        boolean swapped = false;
      for(int j = 0; j<n-1-i; j++){

        if(arr[j] > arr[j+1]){
          int temp = arr[j];
          arr[j] = arr[j+1];
          arr[j+1] = temp;

          swapped = true;
        }
      }
      if(swapped == false){
        break;
      }
    }



  }
}
