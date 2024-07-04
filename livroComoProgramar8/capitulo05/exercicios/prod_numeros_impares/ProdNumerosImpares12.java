/*
 * 5.12 (Calculando o produto de números inteiros ímpares) 
 * Escreva um aplicativo que calcula o produto dos números 
 * inteiros ímpares de 1 a 15
 */
package exercicios.prod_numeros_impares;

public class ProdNumerosImpares12 {
    public static void main(String[] args) {
   
        // variável
        int produto = 1;

        System.out.print("Números impares = ");
        // loop for dos números de 1 a 15
        for(int i = 1; i <= 15; i++) {
            // se os números forem ímpares
            if (i % 2 != 0) {
                // calcule
                produto *= i;
                System.out.printf("%d ", i);
            } // end if
        } // end for
        // exibe resultado
        System.out.printf("\nProduto dos números ímpares = %d%n", produto);
    } // end main
} // end class
