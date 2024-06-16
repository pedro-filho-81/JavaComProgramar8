package exercicios.exe26;

public class exe26 {
   public static void main(String[] args) {
      int row = 10;

      while (row >= 1) {
         int column = 1;

         while (column <= 10) {
            System.out.print(row % 2 == 1 ? "<" : ">");
            ++column;
         } // end while interno
         --row;
         System.out.println();
      } // end while externo
   } // end main
} // end class
