
/*
 * Compara inteiro usando a instrução if,
 * operadores relacionais e operadores de igualdade
 */
import java.util.Scanner;

public class Comparison6 {

   public static void main(String[] args) {
      // cria o objeto input da classe Scanner
      Scanner input = new Scanner(System.in);

      // variables
      int number1;
      int number2;

      // input data
      System.out.print("Enter first number: ");
      number1 = input.nextInt();
      System.out.print("Enter second number: ");
      number2 = input.nextInt();

      // operators
      if (number1 == number2) {
         System.out.printf("%d == %d%n", number1, number2);
      }
      if (number1 != number2) {
         System.out.printf("%d != %d%n", number1, number2);
      }
      if (number1 < number2) {
         System.out.printf("%d < %d%n ", number1, number2);
      }
      if (number1 > number2) {
         System.out.printf("%d > %d%n", number1, number2);
      }
      if (number1 <= number2) {
         System.out.printf("%d <= %d%n", number1, number2);
      }
      if (number1 >= number2) {
         System.out.printf("%d >= %d%n", number1, number2);
      }
   } // end main
} // end class