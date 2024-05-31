
/*
 * Programa para adição de dois números e mostra a soma deles
 */
import java.util.Scanner;

public class Addition5 {
   public static void main(String[] args) {
      // cria o objeto input da Class Scanner
      Scanner input = new Scanner(System.in);

      // variable
      int number1; // número 1
      int number2; // número2
      int sum;

      // entrada de dados
      System.out.print("Enter frist integer: ");
      number1 = input.nextInt();

      System.out.print("Enter secound integer: ");
      number2 = input.nextInt();

      // calcula
      sum = number1 + number2;

      // print result
      System.out.printf("Sum is: %d%n", sum);
   } // end main
} // end class
