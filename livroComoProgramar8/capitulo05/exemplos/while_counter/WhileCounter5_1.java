/*
 * Repetição controlada por contador com a instrução while
 */
public class WhileCounter5_1 {
    public static void main(String[] args) {

        int count = 1; // inicializa o contador
        while (count <= 10) { // enquanto contador menor ou igual a dez faça
            System.out.printf("%d ", count); // exibe os valores do cotador
            ++count; // soma 1 ao contador
        } // end while
    } // end main
} // end class