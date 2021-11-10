package Sorting;

public class QuickSortLomuto {
  public static void main(String[] args) {
    int [] arr = {8,4,7,9,3,10,5};

    quickSort(arr, 0, arr.length-1);

    for(int x:arr){
      System.out.print(x+ " ");
    }
  }

  public static void quickSort(int [] arr, int l, int h){
      if(l<h){
        int p = partition(arr, l,h);
        quickSort(arr, l, p-1);
        quickSort(arr, p+1, h);
      }
  }

  public static int partition(int[] arr, int l, int h){
      int pivot= arr[h];
      int i = l-1;
      for(int j =l;j<=h-1;j++ ){
        if(arr[j]< pivot){
          i++;
          int temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
        }
      }
      int temp = arr[i+1];
      arr[i+1]=arr[h];
      arr[h]=temp;
      return i+1;
  }
}
