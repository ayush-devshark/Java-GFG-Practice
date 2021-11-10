package Recursion;

public class Factorial {
  public static void main(String[] args) {
    int n = 5;

    System.out.println(fact(n,1));
    
  }

  public static int fact(int n, int k){
    if( n == 0 || n == 1){
      return k;
    }
    return fact(n-1, k*n);
  }
}
