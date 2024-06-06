/*
 * 1.2.27 Números aleatórios gaussianos. Escreva um programa 
 * RandomGaussian que imprima um número aleatório r extraído da 
 * distribuição gaussiana. Uma maneira de fazer isso é usar a 
 * fórmula de Box-Muller r = sin(2 π v) (–2 ln você)1/2
 * onde uev são números reais entre 0 e 1 gerados pelo método Math.
 * random(). Sedgewick, Robert; Wayne, Kevin. Ciência da 
 * Computação: Uma Abordagem Interdisciplinar (p. 47). 
 * Educação Pearson. Edição do Kindle.
 */
public class RandomGausiano27 {
   public static void main(String[] args) {

      // constante
      final double PI = Math.PI;

      // variáveis
      double u = Math.random();
      double v = Math.random();
      double r = 1.0;

      // calcular
      r = Math.sin(2 * PI * v) * Math.pow((-2 * u), (1 / 2));

      System.out.println("Random Gaussiano: " + r);
   }
}
