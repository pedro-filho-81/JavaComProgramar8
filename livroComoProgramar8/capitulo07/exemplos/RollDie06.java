import java.security.SecureRandom;

public class RollDie06 {
   /*
    * Programa de jogo de dados utilizando arrays em vez de switch.
    */
   public static void main(String[] args) {

      // create objeto randomNumbers
      SecureRandom randomNumbers = new SecureRandom();
      // array frequency to seven elements
      int[] frequency = new int[7];

      // lança dados várias vezes, usa o valor dos dados como índice da frequência
      for (int roll = 1; roll <= 600000; roll++) {
         // contador frequency soma 1 para cada valor gerado em randomNumber
         ++frequency[1 + randomNumbers.nextInt(6)];
      } // end for

      // header
      System.out.printf("%s%12s%n", "Face", "Frequency");

      // gera saída do valor de cada elemento do array
      for (int face = 1; face < frequency.length; face++)

         // printf the header
         System.out.printf("%5d%10d%n", face, frequency[face]);
      System.out.println(); // new line
   } // end main
} // end class
