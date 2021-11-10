package Recursion;

public class PalindromeString {
  public static void main(String[] args) {
    String str = "abbva";

    System.out.println(isPalin(str, 0, str.length()-1));
  }

  public static boolean isPalin(String str, int start, int end){
    if(start >= end){
      return true;
    }
    return(str.charAt(start) == str.charAt(end)) && isPalin(str, start+1,end-1);

  }
}
