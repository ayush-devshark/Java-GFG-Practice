package Arrays;

public class LeftRotateArrByOne{
  public static void main(String[] args) {
    int [] arr = {10,20,40,50};

    leftRotate(arr);

    for(int x:arr){
System.out.print(x+ " ");
    }
  }

  public static void leftRotate(int[] arr){
    int n = arr.length;
    int temp = arr[0];

    for(int i = 1; i<n;i++){
      arr[i-1] = arr[i];
    }
    arr[n-1] = temp;
  }
}