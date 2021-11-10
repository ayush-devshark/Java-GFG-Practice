package Basics;

public class PyramidPattern {
  public static void main(String[] args) {
    int n = 5;

    int i = 1; // No.of rows

    while ( i<=n){

        int j = 1; // column
        while( j<= n-i){
          System.out.print(" ");
          j++;
        }

        int k = 1;
        while( k <= (2*i-1)){
          System.out.print("x");
          k++;
        }

        i++;
        System.out.println();
    }
  }
}
