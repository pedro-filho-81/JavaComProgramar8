/*
 * 5.15 (Programa para impressão de triângulos) Escreva um aplicativo 
 * que exibe os seguintes padrões separadamente, um embaixo do outro. 
 * Utilize loops for para gerar os padrões. Todos os asteriscos (*) 
 * devem ser impressos por uma única instrução na forma System.out.
 * print('*'); o que faz com que os asteriscos sejam impressos lado a lado. 
 * Uma instrução na forma System.out.println(); pode ser utilizada para 
 * mover-se para a próxima linha. Uma instrução na forma System.out.print(' '); 
 * pode ser utilizada para exibir um espaço para os últimos dois padrões. 
 * Não deve haver outras instruções de saída no programa. 
 * [Dica: os dois últimos padrões requerem que cada linha inicie com um número 
 * adequado de espaços em branco.]
 * */
package exercicios.imprime_triangulos;

public class ImprimeTriangulos15 {
    public static void main(String[] args) {
        
        // cabeçalho
        System.out.printf("%n%s%16s%15s%16s%n", "(a)", "(b)", "(c)", "(d)");

        // loop for controlador
        for(int controle = 0; controle < 10; controle++) {
            
            // triangulo (a)
            for(int a = 0; a <= controle; a++) {
                System.out.print("*");
            } // end for 1
            
            // triângulo vazio ponta para baixo
            for(int b = 15; b > controle; b--) {
                System.out.print(" ");
            } // end for 2
            
            // triângulo (b)
            for(int b = 10; b > controle; b--) {
                System.out.print("*");
            } // end for 2
            
            // triângulo vazio ponta para cima
            for(int c = 0; c <= controle + 3; c++) {
                System.out.print(" ");
            } // end for
            // triângulo vazio
            for(int i = controle; i >= 0; i--) {
                System.out.print(" ");
            } // end for vazio
            
            // triângulo (c)
            for(int i = 10; i > controle; i--) {
                System.out.print("*");
            } // end for

            // triângulo vazio ponta para cima
            for(int c = 0; c < controle; c++) {
                System.out.print(" ");
            } // end for
            // triângulo vazio
            for(int i = 10; i > controle; i--) {
                System.out.print(" ");
            } // end for vazio
            // triângulo vazio
            for(int i = 10; i > controle; i--) {
                System.out.print(" ");
            } // end for vazio
            
            // triângulo (d)
            for(int i = 0; i <= controle; i++) {
                System.out.print("*");
            } // end for

            System.out.println(); // pula linha
        } // end for controle
    } // end  main
} // end class
