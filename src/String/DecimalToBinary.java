package String;

class DecimalToBinary {
  public static void main(String[] args) {
   int n = 10;
   String s = "";
   while(n > 0){
     s = (n%2)+s; // remainder

     n = n/2;
   }

   System.out.println(s);
  }
}