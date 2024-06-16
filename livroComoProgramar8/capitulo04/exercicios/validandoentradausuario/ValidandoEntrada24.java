/*
 * 4.24 (Validando entrada de usuário) Modifique o programa na 
 * Figura 4.12 para validar suas entradas. Para qualquer entrada, 
 * se o valor entrado for diferente de 1 ou 2, continue o loop até 
 * o usuário inserir um valor correto.
 */
package exercicios.validandoentradausuario;

import java.util.Scanner;

public class ValidandoEntrada24 {
   public static void main(String[] args) {

      Scanner input = new Scanner(System.in);

      // variável
      int valor = 0;
      int count1 = 0;
      int count2 = 0;
      int count_erro = 0;
      int soma = 0;

      while (valor != -1) {

         // entrada do usuário
         System.out.print("Digite o valor 1 ou 2 e (-1 para sair): ");
         valor = input.nextInt();
         if (valor == -1) {
            break;
         } // end break
           // se valor igual a 1
         if (valor == 1) {
            // conte 1
            count1++;
         } else
         // se valor igual a 2
         if (valor == 2) {
            // conte 2
            count2++;
         } else { // se não
            // conte erro
            count_erro++;
            // imprima
            System.out.println("ERRADO! Você digitou: " + valor);
            continue; // continue
         } // end else if
         soma = count1 + count2 + count_erro;
         // exiba o resultado
         System.out.println("Você digitou o valor: " + valor);
      } // end while

      // exibe o resultado
      System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-");
      System.out.printf("você digitou %d números 1:\n", count1);
      System.out.printf("Digitou %d números 2:\n", count2);
      System.out.printf("Números errados: %d\n", count_erro);
      System.out.printf("Total de números digitados: %d\n", soma);
      System.out.println("Volte sempre!");
   } // end main
} // end class
