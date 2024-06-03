package ciencia_da_computacao.exercicios.section1_2;

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
