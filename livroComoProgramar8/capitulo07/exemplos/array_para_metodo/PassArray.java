/*
 * Passando array e elementos do array individuais para métodos
 */
package array_para_metodo;

public class PassArray {
    public static void main(String[] args) {
        
        // array
        int[] array = {1, 2, 3, 4, 5, 6};

        System.out.printf("Effects of passing reference to entire array:%n" +
                        "The values of the original array are:%n");

        // gera saída de elementos do array original 
        for (int value : array)
            System.out.printf(" %d", value);
        
        modifyArray(array); // passa a referência do arrayÿ
        System.out.printf("%n%nThe values of the modified array are:%n");
        
        // gera saída de elementos do array modificado 
        for (int value : array)
            System.out.printf(" %d", value);
        
            System.out.printf("%n%nEffects of passing array element value:%n" +
                    "array[3] before modifyElement: %d%n", array[3]);
                
            modifyElement(array[3]); // tenta modificar o array[3]ÿ
            System.out.printf("array[3] after modifyElement: %d%n", array[3]);
    } // end main

    // multiplica cada elemento de um array por 2 ÿ
    public static void modifyArray(int[] array2)
    {
        // loop for para modificar os elementos do array por
        for (int counter = 0; counter < array2.length; counter++)
            // valores dos elementos do array multiplicado por dois
            array2[counter] *= 2;
    } // end modifyArray
    
    // multiplica argumento por 2 ÿ
    public static void modifyElement(int element)
    {
        element *= 2; // multiplica o elemento por dois
        // exibe o valor do elemento
        System.out.printf("Value of element in modifyElement: %d%n", element);
    } // end modyfyElement

} // end class
