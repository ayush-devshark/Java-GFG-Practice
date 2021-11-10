package Sorting;

public class QuickSortHoares {
  public static void main(String[] args) {
    int [] arr = {8,4,7,9,3,10,5};

    quickSort(arr, 0, arr.length-1);

    for(int x:arr){
      System.out.print(x+ " ");
    }
  }

  public static void quickSort(int [] arr, int l, int h){
      if(l<h){
        int p = partition(arr,l,h);
        quickSort(arr, l, p);
        quickSort(arr, p+1, h);
      }
  }

  public static int partition(int arr[], int l, int h){
    int pivot = arr[l];
    int i = l-1;
    int j = h+1;
    while(true){

      do{
          i++;
      } while(arr[i]<pivot);

      do{
          j--;
      }while(arr[j]>pivot);

      if(i>=j)return j;
      
      int temp=arr[i];
      arr[i]=arr[j];
      arr[j]=temp;
  }
  }
}
