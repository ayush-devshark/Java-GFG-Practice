package Basics;

public class PrimeFactorization {
  public static void main(String[] args) {
    int num = 100;

    for(int i = 2;i<num;i++){
      if(isPrime(i)){
      int   x = i;
      while(num%x == 0){
        System.out.print(i+ " ");
        x = x*i;
      }
      }
    }
  }

  public static boolean isPrime(int n){
    for( int i = 2;i<n;i++){
      if(n%i == 0){
        return false;
      }
    }
    return true;
  }
}
