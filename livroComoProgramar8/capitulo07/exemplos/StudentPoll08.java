public class StudentPoll08 {
   /*
    * Vinte estudantes foram solicitados a
    * classificar em uma escala de 1 a 5 a qualidade
    * da comida no refeitório
    * estudantil, com
    * 1 sendo “horrível” e 5 sendo “excelente”. Coloque as 20 respostas em um array
    * de inteiros e determine a frequência de cada
    * classificação.
    */
   public static void main(String[] args) {

      // array de respostas dos alunos (mais tipicamente inseridos pelos alunos)
      int[] response = { 1, 2, 5, 4, 3, 5, 2, 1, 3, 3, 1, 4, 3, 3, 3, 2, 3, 3, 2, 14 };

      // array para contar a frequência
      int[] frequency = new int[6];

      System.out.println(); // new line

      // para cada resposta, seleciona o elemento de resposta e utilia esse valor
      // COmo índice de frequênciapara determinar o elemento
      for (int answer = 0; answer < response.length; answer++) {

         try {
            ++frequency[response[answer]];
         } // end try
         catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e); // invoca o método toString()
            System.out.printf("response[%d] = %d%n%n", answer, response[answer]);
         } // end catch
      } // end for

      // header
      System.out.printf("%s%10s%n", "Rating", "Frequency");

      // gera seída dos valores de cada elemento do array
      for (int rating = 1; rating < frequency.length; rating++) {
         System.out.printf("%6d%10d%n", rating, frequency[rating]);
      } // end for
   } // end main
} // end class
