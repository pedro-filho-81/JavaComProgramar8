/*
 * 4.23 (Encontre os dois números maiores) Utilizando uma 
 * abordagem semelhante àquela do Exercício 4.21, encontre os dois 
 * maiores valores entre os 10 valores inseridos. [Observação: 
 * você só pode inserir cada número uma vez.]
 */
package exercicios.doisnumerosmaiores;

import java.util.Scanner;

class DoisNumerosMaiores23 {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      // variáveis
      int count = 0;
      int maior = 0;
      int seg_maior = 0;
      int num = 0;

      // entrada de dadps
      System.out.print(count + 1 + "º inteiro: ");
      num = input.nextInt();

      while (count < 10) {

         maior = Math.max(maior, num);

         if (num < maior) {
            seg_maior = Math.max(seg_maior, num);
         }
         count++;
         // entrada de dadps
         System.out.print(count + "º inteiro: ");
         num = input.nextInt();
      } // end while

      // resultado
      System.out.printf("O maior valor é %d%n", maior);
      System.out.println("O segundo maior valor é " + seg_maior);
   } // end main
} // end class