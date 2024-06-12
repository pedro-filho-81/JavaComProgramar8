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
      int larget = 0;
      int seg_maior = 0;
      // int larget2 = 0;
      int num = 0;

      while (count < 5) {
         // entrada de dadps
         System.out.print("Digite um número inteiro: ");
         num = input.nextInt();
         larget = Math.max(larget, num);

         if (count == 0) {
            maior = larget;
            seg_maior = larget;
         } // end if count

         if (maior < larget) {
            maior = larget;
         } // end if

         if (larget != maior && seg_maior < larget) {
            seg_maior = larget;
         }
         count++;
      } // end while
        // resultado
      System.out.printf("O maior valor é %d%n", maior);
      System.out.println("O segundo maior valor é " + seg_maior);
   } // end main
} // end class