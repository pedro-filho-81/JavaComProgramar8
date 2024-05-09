public class InitArray01 {
   /*
    * Inicializando os elementos do array com valores padrão como zeros
    */
   public static void main(String[] args) {
      // declare and create an array to 10 element
      int[] array = new int[10];
      // array title
      System.out.printf("%s%8s%n", "Index", "Value");

      // for loop for initialize array and print result
      for (int counter = 0; counter < 10; counter++) {
         // print result
         System.out.printf("%5s%8s%n", counter, array[counter]);
      }
   }
}
