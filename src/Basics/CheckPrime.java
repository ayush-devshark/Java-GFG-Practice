package Basics;

public class CheckPrime {
  public static void main(String[] args) {
    int num = 1031;
    System.out.println(isPrime(num));
  }
  // time complexity = 0(sqrt n).

  public static boolean isPrime(int n){
    if( n == 1) return false;
    if( n == 2 || n == 3) return true;

    if( n%2 == 0 || n%3 ==0) return false;

    for(int i = 5; i*i<n; i=i+6){
      if(n%i == 0 || n%(i+2) ==0){
        return false;
      }
    }
    return true;
  }
}
