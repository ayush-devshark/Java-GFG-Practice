package Arrays;

public class SecondLargestElement {
  public static void main(String[] args) {
    int [] arr = {10,20,30,20};

    System.out.print(secondLargest(arr));
  }

  public static int secondLargest(int[] arr){

    int largest, second;

    largest = second = Integer.MIN_VALUE;

      for(int i = 0; i<arr.length;i++){
        largest = Math.max(largest, arr[i]);
      }

      for(int i = 0; i< arr.length;i++){
        if(arr[i]!= largest){
          second = Math.max(second, arr[i]);
        }
      }

      if(second == Integer.MIN_VALUE){
        return -1;
      }else{
        return second;
      }
  }
}
