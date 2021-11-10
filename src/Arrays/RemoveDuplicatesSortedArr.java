package Arrays;

public class RemoveDuplicatesSortedArr {
  public static void main(String[] args) {
    int [] arr = {10,20,20,10,90,10,30};

    System.out.println(removeDuplicates(arr));

    
  }

  public static int removeDuplicates(int []arr){
    int n = arr.length;
      int j = 1;

      for(int i = 1;i<n;i++){
        if(arr[i] != arr[j-1] ){
          arr[j] = arr[i];
          j++;
        }
      }
      return j;
  }
}
