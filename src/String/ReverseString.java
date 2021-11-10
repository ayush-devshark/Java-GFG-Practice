package String;

public class ReverseString {
  public static void main(String[] args) {
    
    String txt = "geeks";
    int pos = txt.length() - 1;
    String rev = "";

    while(pos >=0){
      rev = rev+txt.charAt(pos);
      pos--;
    }
    
    System.out.print(rev);
  }
}
