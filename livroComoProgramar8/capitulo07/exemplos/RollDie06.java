import java.security.SecureRandom;

public class RollDie06 {
   /*
    * Programa de jogo de dados utilizando arrays em vez de switch.
    */
   public static void main(String[] args) {

      // create objeto randomSecure
      SecureRandom randomNumbers = new SecureRandom();
      // array frequency
      int[] frequency = new int[7];

      // lança dados várias vezes, usa o valor dos dados como indice da frequência
      for (int roll = 1; roll <= 600000; roll++) {
         ++frequency[1 + randomNumbers.nextInt(6)];
      } // end for

      // header
      System.out.printf("%s%12s%n", "Face", "Frequencys");

      // gera saída do valor de cada elemento do array
      for (int face = 1; face < frequency.length; face++)
         System.out.printf("%5d%10d%n", face, frequency[face]);
      System.out.println();
   } // end main
} // end class
