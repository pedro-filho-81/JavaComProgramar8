package capitulo02.exercicios;

/*
 * 2.16 (Comparando inteiros) Escreva um 
 * aplicativo que solicite ao usuário inserir dois 
 * inteiros, obtenha dele esses números e exiba o número 
 * maior seguido pelas palavras “is larger". Se os números forem 
 * iguais, imprima a mensagem “These numbers are equal". Utilize 
 * as técnicas mostradas na Figura 2.15
 */
import java.util.Scanner;

public class ComparandoInteiros {
   public static void main(String[] args) {

      // objeto input da class Scanner
      Scanner input = new Scanner(System.in);

      // enter data
      System.out.print("Digite um inteiro: ");
      int number1 = input.nextInt();
      System.out.print("Outro inteiro: ");
      int number2 = input.nextInt();

      System.out.println("\nComparando os números: ");
      // condições
      if (number1 > number2) {
         System.out.printf("%d é maior que %d%n", number1, number2);
      }
      if (number2 > number1) {
         System.out.printf("%d é maior que %d%n", number2, number1);
      }
      if (number1 == number2) {
         System.out.printf("%d é igual a %d%n", number1, number2);
      }
   } // end main
} // end class
