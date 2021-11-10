package Basics;

public class Fibonaci {
  public static void main(String[] args) {
    int num = 4;

    if(num == 0){
      System.out.print(1);
    }else if( num == 1){
      System.out.print(1);
    } else{
      System.out.print(1+" ");
      System.out.print(1+" ");
      int a = 1;
      int b = 1;

      for(int i = 2;i<=num;i++){
        int c = a+b;
        System.out.print(c+" ");
        a = b;
        b = c;
      }
    }
  }
}
