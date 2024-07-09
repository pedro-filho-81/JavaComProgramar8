package declara_cria_inicializa;
public class InitArray02 {
   /*
    * Inicializando os elementos de um array com um
    * inicializador de array
    * Declara, cria e inicializa um array
    */
   public static void main(String[] args) {
      // declare, create and initialize an array with ten elements
      int[] array = { 33, 45, 26, 44, 99, 21, 15, 5, 9, 44 };

      // array header
      System.out.printf("%5s%8s%n", "Index", "Value");

      // for loop to print the elements of an array
      for (int counter = 0; counter < array.length; counter++) {
         // print the elements of an array
         System.out.printf("%5d%8d%n", counter, array[counter]);
      } // end for
   } // end main
} // end class
