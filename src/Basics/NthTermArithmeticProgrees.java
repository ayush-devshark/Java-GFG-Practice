package Basics;

public class NthTermArithmeticProgrees {
  public static void main(String[] args) {
    int a = 2; //first term
    int d = 1; // differene b/w each term
    int n = 5; // Nth value

   int value = a + ((n-1)*d);
   System.out.print(value);
  }
}
