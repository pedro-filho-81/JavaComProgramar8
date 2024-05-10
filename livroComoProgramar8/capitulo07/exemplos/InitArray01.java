public class InitArray01 {
   /*
    * Inicializando os elementos do array com valores padrão de zeros
    */
   public static void main(String[] args) {
      // declare and create an array to 10 element
      int[] array = new int[10];
      // array header
      System.out.printf("%s%8s%n", "Index", "Value");

      // for loop to initialize array and print result
      for (int counter = 0; counter < 10; counter++) {
         // print result index and zeros with element
         System.out.printf("%5s%8s%n", counter, array[counter]);
      } // end for
   } // end main
} // end class
