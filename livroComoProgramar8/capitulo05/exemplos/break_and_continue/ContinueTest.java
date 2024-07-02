/*
 * Instrução continue que termina uma interação de uma instrução for
 */
package exemplos.break_and_continue;

public class ContinueTest {
    public static void main(String[] args) {
        
        for(int count = 1; count <= 10; count++) {
            // se count igual a 5 faça
            if (count == 5) {

                continue; // pula o código no corpo do loop 
                // quando a contagem for igual a 5

            } // end if
            
            // exibe o valor do contador
            System.out.printf("%d ", count);
        } // end for
        
        System.out.print("\nUsed continue to skip printing 5%n");
    } // end main
} // end class
