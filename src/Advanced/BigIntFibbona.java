package Advanced;

import java.math.BigInteger;

public class BigIntFibbona {
  public static void main(String[] args) {
    int N = 100;
    System.out.println(fibbonaci(N));
  }

  public static BigInteger fibbonaci(int n){
    BigInteger A = BigInteger.valueOf(0);
    BigInteger B = BigInteger.valueOf(1);
    BigInteger C = BigInteger.valueOf(1);
    for(int i = 2;i<n;i++){
        C = A.add(B);
        A = B;
        B = C;
    }
    return B;
  }
}
