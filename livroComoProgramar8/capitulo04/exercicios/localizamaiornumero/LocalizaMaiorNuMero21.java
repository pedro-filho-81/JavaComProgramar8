/*
 * 4.21 (Localize o maior número) O processo de localizar o maior 
 * valor é muito utilizado em aplicativos de computador. Por 
 * exemplo, um programa que determina o vencedor de uma competição 
 * de vendas inseriria o número de unidades vendidas por cada 
 * vendedor. O vendedor que vende mais unidades ganha a 
 * competição. Escreva um programa em pseudocódigo e, então, um 
 * aplicativo Java que aceita como entrada uma série de 10 
 * inteiros e determina e imprime o maior dos inteiros. Seu 
 * programa deve utilizar pelo menos as três variáveis a seguir:
 * a) counter: um contador para contar até 10 (isto é, monitorar 
 * quantos números foram inseridos e determinar quando todos os 10 
 * números foram processados).
 * b) number: o inteiro mais recentemente inserido pelo usuário.
 * c) largest: o maior número encontrado até agora.
 */
package exercicios.localizamaiornumero;

import java.util.Scanner;

public class LocalizaMaiorNuMero21 {
   public static void main(String[] args) {
      // objeto Scanner
      Scanner input = new Scanner(System.in);

      // variable
      int count = 0; // contador
      int number; // entrada do usuário
      int largest = 0; // compara o maior valor
      int maior = 0; // recebe o maior valor
      int smaller = 0;
      int menor = 1;

      // enquanto contador menor que 10 faça
      while (count < 10) {
         // data input
         System.out.printf("Digite o %dº valor inteiro: ", count + 1);
         number = input.nextInt(); // recebe valor do usuário
         largest = Math.max(largest, number); // compara maior
         // verifica se maior é menor que largest
         if (maior < largest) { // se verdade
            maior = largest; // maior recebe largest
         }
         count++; // pós-incrementa 1 a count
      } // end while
      System.out.printf("O maior valor é %d%n", maior);
   } // end main
} // end class