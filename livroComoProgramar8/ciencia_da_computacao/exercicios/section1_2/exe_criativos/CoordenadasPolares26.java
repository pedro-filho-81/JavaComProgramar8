
/*
 * 1.2.26 Polar coordinates. Write a program that 
 * converts from Cartesian to polar coordinates. Your program 
 * should accept two double command-line arguments x and y and 
 * print the polar coordinates r and θ. Use the method Math.atan2
 * (y, x) to compute the arctangent value of y/x that is in the 
 * range from -π to π. 
 * Sedgewick, Robert; Wayne, Kevin. Computer Science: An 
 * Interdisciplinary Approach (p. 47). Pearson Education. 
 * Edição do Kindle. 
 */
import java.util.Scanner;

public class CoordenadasPolares26 {
   public static void main(String[] args) {

      // objeto Scanner
      Scanner input = new Scanner(System.in);

      // variáveis
      double x = 0.0;
      double y = 0.0;

      // entrada de dados
      System.out.print("Informe a coordenada x: ");
      x = input.nextDouble();
      System.out.print("Informe a coordenada y: ");
      y = input.nextDouble();

      // calcular
      double r = Math.sqrt(x * x + y * y);
      double theta = Math.atan2(y, x);

      // exibe resultado
      System.out.println("r     = " + r);
      System.out.println("theta = " + theta);
   } // end main
} // end class
