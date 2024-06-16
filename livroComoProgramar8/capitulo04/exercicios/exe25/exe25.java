package exercicios.exe25;

public class exe25 {
   public static void main(String[] args) {
      int count = 1;

      while (count <= 10) {
         System.out.println(count % 2 == 1 ? "****" : "++++++++");
         ++count;
      } // end while
   } // end main
} // end class
