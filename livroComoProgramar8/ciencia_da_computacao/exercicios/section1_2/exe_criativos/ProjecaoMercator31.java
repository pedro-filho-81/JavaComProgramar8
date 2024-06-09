
/*
 * 1.2.31 Projeção de Mercator. A projeção Mercator é uma projeção 
 * conforme (preservação de ângulo) que mapeia a latitude φ e a 
 * longitude λ em coordenadas retangulares (x, y). É amplamente 
 * utilizado – por exemplo, em cartas náuticas e nos mapas que 
 * você imprime da web. A projeção é definida pelas equações
 * x = λ – λ0 e
 * y = 1/2 Em ((1 + sen φ) / (1 – sen φ)),
 * onde λ0 é a longitude do ponto no centro do mapa. Escreva um 
 * programa que pegue λ0 e a latitude e longitude de um ponto da 
 * linha de comando e imprima sua projeção.
 * 
 * Sedgewick, Robert; Wayne, Kevin. Ciência da Computação: Uma 
 * Abordagem Interdisciplinar (p. 48). 
 * Educação Pearson. Edição do Kindle.
 */
import java.util.Scanner;

public class ProjecaoMercator31 {
   public static void main(String[] args) {
      // objeto Scanner
      Scanner input = new Scanner(System.in);

      // entrada de dados
      System.out.println("Digite a latitude: ");
      double latitude = Double.parseDouble(args[0]);
      System.out.println("Digite a longitude: ");
      double longitude = Double.parseDouble(args[1]);
      System.out.println("");
   } // end main
} // end class
