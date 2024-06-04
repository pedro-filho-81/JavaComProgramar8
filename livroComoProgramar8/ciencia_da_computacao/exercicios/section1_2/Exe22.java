package ciencia_da_computacao.exercicios.section1_2;

/*
 * 1.2.22 Escreva um programa que receba três 
 * argumentos duplos de linha de comando x0, v0 e t e imprima o 
 * valor de x0 + v0t – g t2 / 2, onde g é a constante 9,80665. 
 * (Nota: Este valor é o deslocamento em metros após t segundos 
 * quando um objeto é lançado para cima a partir da posição 
 * inicial x0 com velocidade v0 metros por segundo.)
 * Sedgewick, Robert; Wayne, Kevin. Ciência da Computação: Uma 
 * Abordagem Interdisciplinar (p. 46). Educação Pearson. Edição do 
 * Kindle.
 */
public class Exe22 {
   public static void main(String[] args) {

      // constante
      final double g = 9.80665;

      // variables
      double x0 = Double.parseDouble(args[0]); // posição inicial do objeto
      double v0 = Double.parseDouble(args[1]); // velocidade do objeto
      double t = Double.parseDouble(args[2]); // tempo em segundos

      // calcular
      double deslocamento = x0 + v0 * t - g * (t * 2 / 2);

      System.out.printf("Deslocamento = %f%n", deslocamento);
   } // end main
} // end class
