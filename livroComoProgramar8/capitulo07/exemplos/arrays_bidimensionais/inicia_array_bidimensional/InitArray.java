/*
 * Inicializa array bidimencional
 */
package arrays_bidimensionais.inicia_array_bidimensional;

public class InitArray {

    public static void main(String[] args) {
        
        // cria e eincializa array bidimencionais
        int[][] array1 = {{1, 2, 3}, {4, 5, 6}};
        int[][] array2 = {{1, 2}, {3}, {4, 5, 6}};

        System.out.println("Values in array1 by row are:");
        outputArray(array1); // exibe array1 por linha

        System.out.println("\nValues is array2 by row are:");
        outputArray(array2); // exibe array2 por linha
    } // end main

    // cria método para exibir os valores dos arrays
    public static void outputArray(int[][] array) {

        // loop for pelas linhas dos arrays
        for(int i = 0; i < array.length; i++) {
            // loop for para as colunas do array
            for(int j = 0; j < array[i].length; j++) {
                System.out.printf("%d ", array[i][j]);
            } // end for 2
            System.out.println(); // pula linha
        } // end for 1
    } // end function outputArray
} // end class