package Recursion;

public class TowerOfHanoi {
  public static void main(String[] args) {
    int n = 4;

    towerOfHanyoi(n, 'A','B','C');
  }

  public static void towerOfHanyoi(int n, char src, char aux , char tar){
    if(n==1){
      System.out.println("Move 1 from "+src + " to " + tar);
      return;
    }
    towerOfHanyoi(n-1, src, tar, aux);
    System.out.println("Move "+ n + " from " +src + " to " + tar);
    towerOfHanyoi(n-1, aux, src, tar);
  }
}
