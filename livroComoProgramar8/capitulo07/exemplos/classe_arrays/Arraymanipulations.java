package classe_arrays;

import java.util.Arrays;

public class Arraymanipulations {
    public static void main(String[] args) {
            
        // classifica doubleArray em ordem crescente
        double[] doubleArray = {8.4, 9.3, 0.2, 7.9, 3.4};
        // cabeçalho
        System.out.print("Original: ");
        System.out.printf("%ndoubleArray: ");
        
        // loop para mostrar os valores do array
        for (double value : doubleArray) {
            System.out.printf("%.1f ", value);
        } // end for

        // organiza doubleArray em ordem crescente
        Arrays.sort(doubleArray); 
        
        // cabeçalho
        System.out.print("\n\nArrays.sort(doubleArray)\nOrganiza Arrays: ");
        System.out.printf("%ndoubleArray: ");

        // loop para mostrar os valores do array
        for (double value : doubleArray) {
            System.out.printf("%.1f ", value);
        } // end for

        // preenche o array de 10 elementos com o número 7
        int[] filledArray = new int[10];
        // preenche o array com 7
        Arrays.fill(filledArray, 7);
        
        System.out.print("\n\nArrays.fill(filledArray, 7)\nPreenche o array com o valor 7\nfilledArray: ");
        // loop para mostrar os valores do array
        
        for (int value : filledArray) {
            System.out.printf("%d ", value);
        } // end for

        // copia array intArray em array intArrayCopy
        int[] intArray = { 1, 2, 3, 4, 5, 6 };
        int[] intArrayCopy = new int[intArray.length];
        System.arraycopy(intArray, 0, intArrayCopy, 0, intArray.length);
        displayArray(intArray, "intArray");
        displayArray(intArrayCopy, "intArrayCopy");

    } // end main

    // gera saída de valores em cada array
    public static void displayArray(int[] intArray, String description)
    { 
        System.out.printf("%n%s: ", description);
    
        for (double value : intArray)
            System.out.printf("%d ", value);
    } // end displayArray

} // end class
