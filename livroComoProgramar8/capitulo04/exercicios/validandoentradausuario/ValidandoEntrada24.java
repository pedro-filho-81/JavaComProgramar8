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

      while (valor != -1) {

         // entrada do usuário
         System.out.print("Digite o valor 1 ou 2 e (-1 para sair): ");
         valor = input.nextInt();

         if (valor == -1) {
            break;
         } else if (valor != 1) {
            if (valor != 2) {
               System.out.println("ERRADO! Você digitou: " + valor);
               continue;
            }
         } // end else
         System.out.println("Você digitou o valor: " + valor);
      } // end while
      System.out.println("Volte sempre!");
   } // end main
} // end class
