package Basics;

public class GeometricProgression {
  public static void main(String[] args) {
    int a = 2; // first term
    int r = 3; // common ratio
    int n = 5; // Nth term

    int value = a* (int)Math.pow(r, n-1);
    System.out.print(value);
  }
}
