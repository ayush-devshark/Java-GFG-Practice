package Basics;

public class LCM {
 public static void main(String[] args) {
   int num1 = 10;
   int num2 = 15;
   
  int val = num1*num2;
  int maxNum = Math.max(num1,num2);
  int ans = val;

  for( int i = maxNum; i <= val; i++ ){
    if( i % num1 == 0 & i%num2 == 0){
      ans = i;
      break;
    }
  }
  System.out.print(ans);
 } 
}
