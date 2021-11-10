package String;

public class PatterSearch {
  public static void main(String []args){
      String txt = "geek for geeks";
      String pat = "geek";

      int pos = txt.indexOf(pat);
      while( pos >= 0){
        System.out.print(pos+ " ");
        pos = txt.indexOf(pat, pos + 1);
      }
  }
}
