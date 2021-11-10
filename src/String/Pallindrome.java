package String;

public class Pallindrome {
  public static void main(String[] args) {
    String txt = "abba";

    int start = 0;
    int end = txt.length()-1;

    boolean isPal =  true;

    while(start < end){
      if(txt.charAt(start) != txt.charAt(end)){
        isPal = false;
        break;
      } 
      start++;
      end--;
    }

    if(isPal){
      System.out.print("Is Palladorm");
    } else{
      System.out.print("Not Palladorm");
    }
  }
}
