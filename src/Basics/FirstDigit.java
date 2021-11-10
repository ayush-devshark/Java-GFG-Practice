package Basics;

public class FirstDigit {
  public static void main(String[] args) {
    int num = 3212;

    while( num > 10){
      num = num/10;

    }
    System.out.print(num);
  }
}
