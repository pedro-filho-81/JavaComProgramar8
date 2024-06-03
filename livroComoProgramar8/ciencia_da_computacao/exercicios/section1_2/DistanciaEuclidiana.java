package ciencia_da_computacao.exercicios.section1_2;

/*
 * Prints the distance from (x, y) to the origin, where x and y
 * are integers.
 * 1.2.18 Escreva um programa que receba dois argumentos de linha de comando 
 * inteiros x e y e imprima a distância euclidiana do ponto (x, y) até a origem 
 * (0, 0). Sedgewick, Robert; Wayne, Kevin. Ciência da Computação: Uma Abordagem 
 * Interdisciplinar (p. 46). Educação Pearson. Edição do Kindle.
 */
import java.util.Scanner;

public class DistanciaEuclidiana {
   public static void main(String[] args) {

      Scanner input = new Scanner(System.in);

      // entrada de dados
      int x = Integer.parseInt(args[0]);
      int y = Integer.parseInt(args[1]);

      // calcular
      double distancia = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));

      // exibir
      System.out.printf("A distância de (%d, %d) para (0, 0) = %f\n", x, y, distancia);
   } // end Main
} // end class
