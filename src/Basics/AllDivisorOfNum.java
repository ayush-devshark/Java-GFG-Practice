package Basics;

public class AllDivisorOfNum {
  public static void main(String[] args) {
    int n = 56;
    int i;
    // Diviors always appear in pairs
    // There is always a divisor which is less than sqrt of n
   // sqrt n time complexity. Theta 1 Aux space.
    for( i = 1; i*i <n;i++){
      if(n%i == 0){
        System.out.println(i);
      }
    }

    for( ;i>=1; i--){
      if( n%i == 0){
        System.out.println(n/i);
      }
    }
  } 
}
