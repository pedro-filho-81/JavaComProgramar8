package ciencia_da_computacao.exercicios.section1_2;

/*
 * 1.2.20 Escreva um programa que imprima a soma 
 * de dois números inteiros aleatórios entre 1 e 6 
 * (como você obteria ao jogar dados). .0fSedgewick, 
 * Robert; Wayne, Kevin. Ciência da Computação: Uma 
 * Abordagem Interdisciplinar (p. 46). 
 * Educação Pearson. Edição do Kindle.
 */
public class SomaAleatorio {
   public static void main(String[] args) {

      // nuM aleatório
      double alea1 = (1 + Math.random() * 6);
      // nuM aleatório
      double alea2 = (1 + Math.random() * 6);

      // result
      System.out.printf("A soma de %.0f + %.0f é %.0f%n",
            alea1, alea2, alea1 + alea2);
   } // end main
} // end class