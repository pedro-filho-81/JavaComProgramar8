import java.util.Scanner;

/*
 * 1.2.24 Juros compostos continuamente. Escreva um programa que 
 * calcule e imprima a quantidade de dinheiro que você teria após 
 * t anos se investisse P dólares a uma taxa de juros anual r 
 * (composta continuamente). O valor desejado é dado pela fórmula 
 * Pert. Sedgewick, Robert; Wayne, Kevin. Ciência da Computação: 
 * Uma Abordagem Interdisciplinar (p. 47). 
 * Educação Pearson. Edição do Kindle.
 */

import java.util.Scanner;

public class JurosCompostos24 {
   public static void main(String[] args) {

      // objeto Scanner
      Scanner input = new Scanner(System.in);

      // variáveis
      double montante = 0.0; // valor total
      double capital = 0.0; // valor inicial
      double taxaAnual = 0.0; // taxa de juros anal
      int tempoAplicado = 0; // tempo em anos aplicado

      // entrada de dados
      System.out.print("Informe o capital inicial R$ ");
      capital = input.nextDouble();
      System.out.print("Taxa anual: ");
      taxaAnual = input.nextDouble();
      System.out.print("Tempo aplicado (anos): ");
      tempoAplicado = input.nextInt();

      // calcular
      /*
       * A fórmula para calcular os juros compostos é:
       * M = C.(1-i)^n, sendo M o montante, C o capital inicial,
       * i a taxa de juros e n o tempo.
       */
      montante = capital * Math.pow((1 + (taxaAnual / 100)), tempoAplicado);

      // exibe o resultado
      System.out.println("\nJuros compostos:");
      System.out.printf(
            "Capital R$ %.2f %nInvestido em %d anos %nTaxa de %.2f%% %nJuros R$ %.2f %nmontante R$ %.2f%n%n",
            capital, tempoAplicado, (taxaAnual / 100), montante - capital, montante);
   } // end main
} // end class
