package capitulo02.exercicios;

/*
 * 2.30 (Separando os dígitos em um inteiro) Escreva um aplicativo que insira um 
 * número consistindo em cinco dígitos a partir do usuário, separe o número em 
 * seus dígitos individuais e imprima os dígitos separados uns dos outros por três 
 * espaços. Por exemplo, se o usuário digitar o número 42339, o programa deve 
 * imprimir Suponha que o usuário insira o número correto de dígitos. O que 
 * acontece quando você insere um número com mais de cinco dígitos? O que acontece 
 * quando você insere um número com menos de cinco dígitos? [Dica: é possível 
 * fazer este exercício com as técnicas que aprendeu neste capítulo. Você 
 * precisará tanto das operações de divisão como das de resto para “selecionar” 
 * cada dígito.]
 */

import java.util.Scanner;

public class SeparaDigitoInteiro {
   public static void main(String[] args) {

      // objeto Scanner
      Scanner input = new Scanner(System.in);

      // entrada de dados
      System.out.print("Digite um inteiro menor que 100001: ");
      int num = input.nextInt();

      if (num < 0) {
         System.out.println("ERRO! Valor maior que 1000001 ou menor que 0.");
      }
      if (num > 1000001) {
         System.out.println("ERRO! Valor maior que 1000001 ou menor que 0.");
      }

      if (num < 1000001) {
         if (num > 0) {
            // calcula e separa o valor digitado
            int n1 = num / 100000;
            int n2 = num % 100000 / 10000;
            int n3 = num % 10000 / 1000;
            int n4 = num % 1000 / 100;
            int n5 = num % 100 / 10;
            int n6 = num % 10 / 1;

            // exibe o resultado
            System.out.printf("O número é %d   %d   %d   %d   %d   %d%n", n1, n2, n3, n4, n5, n6);
            System.out.println();
         } // end if interno
      } // end if externo

   } // end main
} // end class
