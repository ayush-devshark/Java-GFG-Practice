package Advanced;

import java.math.BigInteger;

public class BigIntegerFactorial {
  public static void main(String[] args) {
    int N = 100;
    System.out.println(factorial(N));
  }

  public static BigInteger factorial(int n){
    BigInteger f = new BigInteger("1");
    for(int i = 2; i< n ;i++){
      BigInteger x = BigInteger.valueOf(i);
      f = f.multiply(x);
    }
    return f;
  }
}
