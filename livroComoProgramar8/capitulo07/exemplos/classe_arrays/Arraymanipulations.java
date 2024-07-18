/*
 * Métodos da classe Arrays e System.arraycopy.
 */
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

        // loop para mostrar os valores do array em ordem crescente
        for (double value : doubleArray) {
            // exibe os valores do array 
            System.out.printf("%.1f ", value);
        } // end for

        // declara e cria o array de 10 elementos
        int[] filledArray = new int[10];
        // preenche o array filedArray com 7
        Arrays.fill(filledArray, 7);
        
        // cabeçalho
        System.out.print("\n\nArrays.fill(filledArray, 7)\nPreenche o array com o valor 7\nfilledArray: ");
        // loop para mostrar os valores do array filledArray
        for (int value : filledArray) {
            // exibe o valor 7
            System.out.printf("%d ", value);
        } // end for

        // copia array intArray em array intArrayCopy
        int[] intArray = { 1, 2, 3, 4, 5, 6 };
        // recebe a copia do array intArray
        int[] intArrayCopy = new int[intArray.length];
        // copia intArray para intArrayCopy
        System.arraycopy(intArray, 0, intArrayCopy, 0, intArray.length);

        // chama a função displayArray
        displayArray(intArray, "intArray");
        displayArray(intArrayCopy, "intArrayCopy");

        // verifica a igualdade de intArray e intArrayCopy 
        boolean b = Arrays.equals(intArray, intArrayCopy);
        // exibe == se igual ou != se diferente
        System.out.printf("%n%nintArray %s intArrayCopy%n",
                        (b ? "==" : "!="));

        // verifica a igualdade de intArray e filledIntArray 
        b = Arrays.equals(intArray, filledArray);
        // exibe == se igual ou != se diferente
        System.out.printf("intArray %s filledIntArray%n", 
                (b ? "==" : "!="));

        // pesquisa o valor 5 em intArray
        int location = Arrays.binarySearch(intArray, 5);
        
        if (location >= 0)
            System.out.printf("Found 5 at element %d in intArray%n", location); 
        else
            System.out.println("5 not found in intArray"); 
        
        // pesquisa o valor 8763 em intArray
        location = Arrays.binarySearch(intArray, 8763);
        
        if (location >= 0)
            System.out.printf( "Found 8763 at element %d in intArray%n", location); 
        else
            System.out.println("8763 not found in intArray"); 
    } // end main

    // gera saída de valores em cada array
    public static void displayArray(int[] intArray, String description)
    { 
        System.out.print("\n\nFunção displayArray:");
        System.out.printf("%n%s: ", description);
    
        for (int value : intArray)
            System.out.printf("%d ", value);
    } // end displayArray

} // end class
