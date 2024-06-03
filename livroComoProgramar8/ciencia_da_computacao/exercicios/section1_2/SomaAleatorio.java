package ciencia_da_computacao.exercicios.section1_2;

/*
 * 
 */
public class SomaAleatorio {
   public static void main(String[] args) {

      // nuM aleatório
      double alea1 = (1 + Math.random() * 6);
      // nuM aleatório
      double alea2 = (1 + Math.random() * 6);

      // result
      System.out.printf("A soma de %.0f + %.0f é %.0f%n", alea1, alea2, alea1 + alea2);
   } // end main
} // end class