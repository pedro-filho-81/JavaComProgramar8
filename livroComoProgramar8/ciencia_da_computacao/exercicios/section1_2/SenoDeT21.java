package ciencia_da_computacao.exercicios.section1_2;

/*
 * 1.2.21 Escreva um programa que receba um argumento duplo de 
 * linha de comando t e imprima o valor de sin(2t) + sin(3t).
 * Sedgewick, Robert; Wayne, Kevin. Ciência da Computação: Uma 
 * Abordagem Interdisciplinar (p. 46). Educação Pearson. Edição do 
 * Kindle.
 */
public class SenoDeT21 {
   public static void main(String[] args) {

      // variable entrada de dados
      double t = Integer.parseInt(args[0]);

      // exibe resultado
      System.out.printf("O seno de 2t é: %f%n", Math.sin(2 * t));
      System.out.printf("O seno de 3t é: %f%n", Math.sin(3 * t));
   } // end main
} // end class
