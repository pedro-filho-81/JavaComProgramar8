/*
 * A instrução break sai de um loop (while, for or do...while)
 */
package exemplos.break_and_continue;

public class BreakTest {
    public static void main(String[] args) {
        
        int count = 0; // variável de controle também utulizada depois que o loop termina

        // loop for conta até 10
        for(count = 1; count <= 10; count++) {
            // se o contador igual a 5
            if (count == 5) {
                // saia do loop
                break;
            } // end if

            // imprima o valor do contador
            System.out.printf("%d ", count);
        } // end for
        // exibe uma mensagem
        System.out.printf("\nBroke out of loop at count = %d%n", count);
    } // end main
} // end class
