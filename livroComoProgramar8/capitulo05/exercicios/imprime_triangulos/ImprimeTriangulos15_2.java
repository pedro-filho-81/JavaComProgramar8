package exercicios.imprime_triangulos;

public class ImprimeTriangulos15_2 {
    public static void main(String[] args) {

        // triângulo 01
        System.out.println("(a)");
        // loop for controlador
        for(int linha = 0; linha < 10; linha++) {
            // loop for para imprimir os asteriscos com a ponta para cima
            for(int coluna = 0; coluna <= linha; coluna++) {
                System.out.print("*");
            } // end for asterisco
            // pula linha
            System.out.println();
        } // end for controle

        // triângulo 02
        System.out.println("\n(b)");        
        for(int linha = 0; linha < 10; linha++) {
            for(int coluna = 10; coluna > linha; coluna--) {
                System.out.print("*");
            } // end for coluna
            System.out.println();
        } // end for linha

        // triângulo 03
        System.out.println("\n(c)");
        for(int linha = 0; linha < 10; linha++) {
            // triàngulo vazio
            for(int coluna = 0; coluna < linha; coluna++) {
                System.out.print(' '); // exibe azio
            } // end for coluna
            // triângulo de asterisco
            for(int asterisco = 10; asterisco > linha; asterisco--) {
                System.out.print('*'); // exibe asterisco
            } // end for asterisco
            System.out.println(); // pula linha
        } // end for linha

        // Triângulo 04
        System.out.println("(d)");
        for(int linha = 0; linha < 10; linha++) {
            for(int coluna = 10; coluna > linha; coluna--) {
                System.out.print(' '); // exibe expaço
            } // end for vaio
            for(int asterisco = 0; asterisco < linha; asterisco++) {
                System.out.print('*'); // exibe asterisco
            } // end for asterisco
            System.out.println(); // pula linha
        } // end for linha

    } // end main
} // end class
