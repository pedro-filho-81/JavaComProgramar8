/*
 * 4.22 (Saída no formato de tabela) Escreva um aplicativo Java 
 * que utiliza um loop para imprimir a seguinte tabela de valores
 */
package exercicios.formatodetabela;

import java.util.Scanner;

public class FormatoDeTabela22 {
   public static void main(String[] args) {
      // objeto Scanner
      Scanner input = new Scanner(System.in);

      // variável
      int count = 0;

      // entrada de dados
      System.out.print("Digite um inteiro: ");
      int inteiro = input.nextInt();

      System.out.println("N\t10*N\t100*N\t1000*N\n");
      while (count < inteiro) {

         System.out.println(count + 1 + "\t" + (count + 1) * 10 + "\t" + (count + 1) * 100 + "\t" + (count + 1) * 1000);
         count++;
      } // end while
   } // end main
} // ebd class
