package String;

public class DigitAfterDecimalPoint {
  public static void main(String[] args) {
    
    String numStr = "12.5812";

    int pos = numStr.indexOf('.');

    if (pos <0){
      System.out.println("");
    }else{
      System.out.println(numStr.substring(pos+1));
    }
  }
}
