package soma_elemento_array;
public class SumArray04 {

   public static void main(String[] args) {
      // declare, create and initialize an array
      int[] array = { 87, 68, 94, 100, 83, 78, 85, 91, 76, 87 };

      // variable
      int total = 0;

      // for loop to sum the values of the array
      for (int counter = 0; counter < array.length; counter++) {
         // sum the values fo the array
         total += array[counter];
      } // end for

      // print result
      System.out.printf("Total of the elements: %2d\n", total);
   } // end main
} // end class