/*
 * 1.2.32 Conversão de cores. Vários formatos diferentes são 
 * usados ​​para representar cores. Por exemplo, o formato 
 * primário para monitores LCD, câmeras digitais e páginas da web, 
 * conhecido como formato RGB, especifica o nível de vermelho (R), 
 * verde (G) e azul (B) em uma escala inteira de 0 a 255. . O 
 * formato principal para publicação de livros e revistas, 
 * conhecido como formato CMYK, especifica o nível de ciano (C), 
 * magenta (M), amarelo (Y) e preto (K) em uma escala real de 0,0 
 * a 1,0. Escreva um programa RGB para CMYK que converta RGB em 
 * CMYK. Pegue três números inteiros – r, g e b – da linha de 
 * comando e imprima os valores CMYK equivalentes. Se os valores 
 * RGB forem todos 0, então os valores CMY serão todos 0 e o valor 
 * K será 1; caso contrário, use estas fórmulas: w = max (r/255, g/
 * 255, b/255) 
 * c = (w – (r / 255)) / w
 * m = (w – (g / 255)) / w
 * y = (w – (b / 255)) / w
 * k = 1 – w
 * Sedgewick, Robert; Wayne, Kevin. Ciência da Computação: Uma 
 * Abordagem Interdisciplinar (pp. 48-49). 
 * Educação Pearson. Edição do Kindle.
 */

import java.util.Scanner;

public class ConversorDeCores32 {
   public static void main(String[] args) {
      // objeto Scanner
      Scanner input = new Scanner(System.in);

      // entrada de dados
      System.out.print("Digite um valor entre 0 e 255: ");
      int r = input.nextInt(); // red
      System.out.print("Segundo valor entre 0 e 255: ");
      int g = input.nextInt(); // green
      System.err.print("Terceiro valor entre 0 e 255: ");
      int b = input.nextInt(); // blue

      // converte RGB em CmYK
      double w = Math.max((r / 255), Math.max((g / 255), (b / 255)));
      double c = (w - (r / 255)) / w;
      double m = (w - (g / 255)) / w;
      double y = (w - (b / 255)) / w;
      double k = 1 - w;

      // Mostra os valores
      System.out.println("w = " + w);
      System.out.println("r = " + r);
      System.out.printf("C = %f%nM = %f%nY = %f%nK = %f%n", c, m, y, k);
   } // end main
} // end class
