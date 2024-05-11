public class BarChar05 {
   /*
    * Programa de impressão de barras de asteriscos
    */
   public static void main(String[] args) {

      // array
      int[] array = { 7, 0, 5, 0, 3, 0, 1, 2, 4, 2, 1 };

      // print array
      System.out.print("int[] array = {");
      for (int counter = 0; counter < array.length; counter++)
         System.out.print(array[counter] + " ");
      System.out.println("};");

      // header
      System.out.println("Grade Distribution");

      // para cada elemento de array, gera saída de barras do gráfico.
      for (int counter = 0; counter < array.length; counter++) {
         // gera saída do rótulo de barra ("00-09", ...., "90-99", "100")
         if (counter == 10)
            System.out.printf("%5d", 100);
         else
            System.out.printf("%02d-%02d", counter * 10, counter * 10 + 9);

         // imprime barra de asteriscos
         for (int star = 0; star < array[counter]; star++) {
            System.out.print("*");
         }
         // new line
         System.out.println();
      } // end for
   } // end main
} // end class
