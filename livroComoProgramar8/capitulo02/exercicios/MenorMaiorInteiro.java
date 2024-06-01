package capitulo02.exercicios;

/*
 * 2.17 (Aritmética, menor e maior) Escreva um 
 * aplicativo que insira três inteiros digitados 
 * pelo usuário e exiba a soma, média, produto e 
 * os números menores e maiores. Utilize as 
 * técnicas mostradas na Figura 2.15. [Observação: 
 * o cálculo da média neste exercício deve 
 * resultar em uma representação de inteiro. 
 * Assim, se a soma dos valores for 7, a média 
 * deverá ser 2, não 2,3333...]
 */
import java.util.Scanner;

public class MenorMaiorInteiro {
   public static void main(String[] args) {

      Scanner input = new Scanner(System.in);

      // enter data
      System.out.print("Digite o primeiro inteiro: ");
      int number1 = input.nextInt();
      System.out.print("Segundo inteiro: ");
      int number2 = input.nextInt();
      System.out.print("Terceiro inteiro: ");
      int number3 = input.nextInt();

      // calculos
      int soma = number1 + number2 + number3;
      int media = soma / 3;
      int produto = number1 * number2 * number3;

      // condições para o maior valor
      if (number1 > number2) {
         if (number1 > number3) {
            System.out.printf("%d é o maior.", number1);
         }
      }
      if (number2 > number1) {
         if (number2 > number3) {
            System.out.printf("%d é o maior.", number2);
         }
      }
      if (number3 > number1) {
         if (number3 > number2) {
            System.out.printf("%d é o maior.", number3);
         }
      }

      System.out.println(); // nova linha

      // condições para o menor valor
      if (number1 < number2) {
         if (number1 < number3) {
            System.out.printf("%d é o menor.", number1);
         }
      }
      if (number2 < number1) {
         if (number2 < number3) {
            System.out.printf("%d é o menor.", number2);
         }
      }
      if (number3 < number1) {
         if (number3 < number2) {
            System.out.printf("%d é o menor.", number3);
         }
      }
   } // end main
} // end class
