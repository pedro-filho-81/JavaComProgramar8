package ciencia_da_computacao.exercicios.section1_2;

/*
 * 1.2.19 Escreva um programa que receba dois argumentos inteiros 
 * de linha de comando aeb e imprima um inteiro aleatório entre a 
 * e b, inclusive. 
 * Sedgewick, Robert; Wayne, Kevin. Ciência da Computação: Uma 
 * Abordagem Interdisciplinar (p. 46). Educação Pearson. Edição do 
 * Kindle.
 */
public class Aleatorio {
   public static void main(String[] args) {

      // entrada de dados
      int a = Integer.parseInt(args[0]);
      int b = Integer.parseInt(args[1]);

      // nuM aleatório
      double alea = (a + Math.random() * (b - a));

      System.out.printf("O Número soteado entre %d e %d foi: %.0f", a, b, alea);
   } // end main
} // end class
