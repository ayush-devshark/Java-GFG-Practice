package String;

public class BinaryToDecimal {
  public static void main(String[] args) {
    int m = 0;
    int k = 1;
    String binNum = "10001";
    for(int i = binNum.length()-1; i>=0;i--){
      // sunstracting char '0' to convert to int
      m += (binNum.charAt(i)-'0') * k; 
      k = k*2;
    }
    System.out.print(m);
  }
}
