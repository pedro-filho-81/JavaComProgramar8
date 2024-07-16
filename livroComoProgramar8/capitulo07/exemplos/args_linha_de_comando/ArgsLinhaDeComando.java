/*
 *  Inicializando um array com argumentos de linha de comando.
 */
package args_linha_de_comando;

public class ArgsLinhaDeComando {
    public static void main(String[] args) {

        // verifica número de argumentos na linha de comando
        if(args.length != 3) {
            System.out.printf(
                    "Error: Please re-enter the entire command, including%n" +
                    "an array size, initial value and increment.%n");
        } else {

            // obtém o tamanho do array a partir do argumento da linha de comando
            int arrayLength = Integer.parseInt(args[0]);
            int[] array = new int[arrayLength];

            // obtém o valor inicial e o incremento a partir 
            // do argumento da linha de comando
            int initialValue = Integer.parseInt(args[1]);
            int increment = Integer.parseInt(args[2]);

            // // calcula o valor de cada elemento do array
            for(int counter = 0; counter < arrayLength; counter++) {
                array[counter] = initialValue + increment * counter;
            } // end for 1

            // cabeçalho
            System.out.printf("%s%8s%n", "Index", "Value");

            // exibe os valores e os indices do array
            for(int counter = 0; counter < arrayLength; counter++) {
                System.out.printf("%5d%8d%n", counter, array[counter]);
            } // end for 2
        } // end else
    } // end main
} // end class
