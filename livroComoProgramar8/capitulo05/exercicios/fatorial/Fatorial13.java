package exercicios.fatorial;

public class Fatorial13 {
    public static void main(String[] args) {
        
        // variável
        long fat = 1; // calcula o fatorial
        int i, j; // variável dos loops for

        // cabeçalho do fatorial
        System.out.printf("%s%20s%n", "Índice", "Fatorial");

        // loop for para controlador para 20 repetições
        for(i = 1; i <= 20; i++) {
            
            // loop for para calcular o fatorial
            for(j = i; j >= 1; j--) {

                // calcula o fatorial
                fat *= j;

            } // end for interno
            
            // exibe indice e o fatorial
            System.out.printf("%5d%20d%n", i, fat);

            // reinicializa o cálculo do fatorial
            fat = 1;

        } // end for externo
    } // end main
} // end class
