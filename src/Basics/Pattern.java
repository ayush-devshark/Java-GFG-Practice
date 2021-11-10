package Basics;

public class Pattern {
  public static void main(String[] args) {
    int n = 5;
    int i = 1; // rows

    while( i<= n){
        int j = 1; // cplumn
        while(j<=n){
          System.out.print("x ");
          j++;
        }
        System.out.println("");
        i++;
    }
  }
}
