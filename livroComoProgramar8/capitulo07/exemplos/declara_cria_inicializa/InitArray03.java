package declara_cria_inicializa;
public class InitArray03 {
   /*
    * Calculando os valores a serem colocados no array
    * 4 cria um array de 10 elementos e atribui a cada elemento um dos inteiros
    * pares de 2 a 20 (2, 4, 6, …,
    * 20). Em seguida, o aplicativo exibe o array em formato tabular. A instrução
    * for nas linhas 12 e 13 calcula o valor de um elemento
    * do array multiplicando o valor atual da variável de controle counter por 2 e
    * adicionando 2
    */
   public static void main(String[] args) {
      final int ARRAY_LENGTH = 10; // VARIABLE CONSTant
      // declare and create an array
      int[] array = new int[ARRAY_LENGTH];

      // calculates the value of each element of the array
      for (int counter = 0; counter < ARRAY_LENGTH; counter++) {
         array[counter] = 2 + 2 * counter;
      } // end for

      // print header
      System.out.printf("%s%8s%n", "Index", "value");

      // gera saída de cada elemento do array
      // for loop to print the elements of the array
      for (int counter = 0; counter < ARRAY_LENGTH; counter++) {
         // print result
         System.out.printf("%5s%8s%n", counter, array[counter]);
      } // end for
   } // end main
} // end class
