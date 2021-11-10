package Basics;

public class GCD {
  public static void main(String[] args) {
    int num1 = 10;
    int num2 = 15;
    int ans = 1;
    int x = Math.min(num1,num2);

    for(int i = 1; i<=x; i++){
      if( num1 % i == 0 && num2 % i == 0){
        ans = i;
      }
    }
    System.out.print(ans);
  }
}
