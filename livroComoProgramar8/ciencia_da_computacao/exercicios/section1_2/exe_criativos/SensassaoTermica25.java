
/*
 * 1.2.25 Sensação térmica. Dada a temperatura T (em graus 
 * Fahrenheit) e a velocidade do vento v (em milhas por hora), o 
 * Serviço Meteorológico Nacional define a temperatura efetiva (a 
 * sensação térmica) da seguinte forma: w = 35,74 + 0,6215 T + (0,
 * 4275 T – 35,75) v0.16 Escreva um programa que receba dois 
 * argumentos duplos de linha de comando, temperatura e 
 * velocidade, e imprima a sensação térmica. Use Math.pow(a, b) 
 * para calcular ab. Nota: A fórmula não é válida se T for maior 
 * que 50 em valor absoluto ou se v for maior que 120 ou menor que 
 * 3 (você pode assumir que os valores obtidos estão nesse 
 * intervalo). Sedgewick, Robert; Wayne, Kevin. Ciência da 
 * Computação: Uma Abordagem Interdisciplinar (p. 47). 
 * Educação Pearson. Edição do Kindle.
 */
import java.util.Scanner;

public class SensassaoTermica25 {
   public static void main(String[] args) {

      // objeto Scanner
      Scanner input = new Scanner(System.in);

      // variáveis
      double senTermica = 0;
      int veloDoVento = 0;
      int temperatura = 0;

      // entrada de dados
      System.out.print("Digite a velocidade do vento em km/h: ");
      veloDoVento = input.nextInt();
      System.out.print("Digite a temperatura em Cº: ");
      temperatura = input.nextInt();

      // calcular
      senTermica = 35.74 + 0.6215 * temperatura + (0.4275 * temperatura - 35.75) * veloDoVento * 0.16;

      // exibe resultado
      System.out.printf("\nSensassão termica: %.2fCº%n", senTermica);
   } // end main
} // end class