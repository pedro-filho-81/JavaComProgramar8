package for_para_array;
/*
 * Utilizando for aprimorado para somar os valores dos elementos do array
 */
public class ForAprimorado {
    public static void main(String[] args) {
        
        // array
        int[] array = {87, 68, 94, 100, 83, 78, 85, 91, 76, 87};

        // variável
        int total = 0;

        // loop for aprimorado para somar os valores do array
        for(int valor : array) {
            total += valor;
        } // end for aprimorado

        // exibe o array
        System.out.print("array = { ");
        // loop for para exibir os valores do array
        for(int valor : array) {
            // exibir
            System.out.printf("%d ", valor);
        } // end for
        System.out.print(" }\n");

        // exibe resultado
        System.out.println("O valor total do array é: " + total);
    
    } // end main
} // end class
