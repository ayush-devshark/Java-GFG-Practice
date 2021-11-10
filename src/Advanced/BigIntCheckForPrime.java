package Advanced;

import java.math.BigInteger;

public class BigIntCheckForPrime {
  public static void main(String[] args) {
    int N = 23;
    System.out.println(checkPrime(N));
    System.out.println(checkNextPrime(N));
  }

  public static boolean checkPrime(int n){
    BigInteger A = BigInteger.valueOf(n);
    return A.isProbablePrime(1);
  }

  public static int checkNextPrime(int n){
    BigInteger A = BigInteger.valueOf(n);
    String a = A.nextProbablePrime().toString();
    return Integer.parseInt(a); 
  }

}
