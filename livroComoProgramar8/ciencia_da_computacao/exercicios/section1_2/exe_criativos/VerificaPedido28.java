
/*
 * 1.2.28 Verificação do pedido. Escreva um 
 * programa que receba três argumentos duplos de linha de comando 
 * x, y e z e imprima verdadeiro se os valores forem estritamente 
 * crescentes ou decrescentes (x < y < z ou x > y > z) e falso 
 * caso contrário. Sedgewick, Robert; Wayne, Kevin. Ciência da 
 * Computação: Uma Abordagem Interdisciplinar (p. 47). 
 * Educação Pearson. Edição do Kindle.
 */
import java.util.Scanner;

public class VerificaPedido28 {
   public static void main(String[] args) {
      // objeto Scanner
      Scanner input = new Scanner(System.in);

      // variáveis
      double x = 0.0, y = 0.0, z = 0.0;

      // entrada de dados
      System.out.print("Digite o valor de x: ");
      x = input.nextDouble();
      System.out.print("Digite o valor de y: ");
      y = input.nextDouble();
      System.out.print("Digite o valor de z: ");
      z = input.nextDouble();

      // condições
      boolean crescente = (x > y && y > z);
      boolean decrescente = (x < y && y < z);

      // exibe resultado
      System.out.println("x,y e z são crescente:" + crescente);
      System.out.println("x, y, z são decrescente:" + decrescente);
   } // end main
} // end class
