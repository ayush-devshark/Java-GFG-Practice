package Recursion;

public class Subset {
  public static void main(String[] args) {
    String str = "ABC";
    
    generateSubset(str, "",0);
  }

  public static void generateSubset(String str, String curr, int i){
      if( i == str.length()){
        System.out.println(curr);
        return;
      }
      generateSubset(str, curr,i+1);
      generateSubset(str, curr+str.charAt(i),i+1);

  }
}
