package ciencia_da_computacao.exercicios.section1_2;
/*
 * 1.2.23 Escreva um programa que receba dois argumentos inteiros 
 * de linha de comando m e d e imprima verdadeiro se o dia d do 
 * mês m estiver entre 20/03 e 20/06, caso contrário, será falso.
 * Sedgewick, Robert; Wayne, Kevin. Ciência da Computação: Uma 
 * Abordagem Interdisciplinar (p. 46). Educação Pearson. 
 * Edição do Kindle.
 */

import java.util.Scanner;

public class DiaDoMes23 {
   public static void main(String[] args) {
      // input é o objeto Scanner
      Scanner input = new Scanner(System.in);
      // entrada de dadps
      System.out.print("Digite o dia do nascimento: ");
      int d = input.nextInt(); // dia do nascimento
      System.out.print("Informe o mês do nascimento: ");
      int m = input.nextInt(); // mês do nascimento
      // condições
      if (d >= 20 && m >= 3 && m <= 6) {
         System.out.printf("Data: %d/%d%n", (int) d, m);
      } else {
         System.out.println("ERRADO! A data tem que está entre 20/03 e 20/06 inclusive.");
      } // end if
   } // end main
} // end class