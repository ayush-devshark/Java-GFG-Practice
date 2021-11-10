package Arrays;

import java.util.Scanner;

public class CountDistinctNumbers {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int [] arr = new int[n];

    for(int i = 0;i<n;i++){
      arr[i] = sc.nextInt();
    } 

    countDistinct(arr,n);
    sc.close();
  }

  public static void countDistinct(int [] arr, int n){

    int count = 0; boolean isDistinct = true;

    for(int i = 0; i < n; i++){

      for(int j = (i-1); j >= 0; j--){
        if(arr[i] == arr[j]){
          isDistinct = false;
          break;
        }
      }
      if(isDistinct == true){
        count++;
      }
      isDistinct = true;
    }

    System.out.println(count);

  }
}