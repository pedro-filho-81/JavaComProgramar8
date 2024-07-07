/*
 * 5.16 (Gráfico de barras do programa de impressão) 
 * Uma aplicação interessante dos computadores é exibir 
 * diagramas e gráficos de barras. Escreva um aplicativo 
 * que leia cinco números entre 1 e 30. Para cada número 
 * que é lido, seu programa deve exibir o mesmo número de 
asteriscos adjacentes. Por exemplo, se seu programa lê 
o número 7, ele deve exibir *******. Exiba as barras dos 
asteriscos depois de ler os cinco números.
 */
package exercicios.barra_de_asteriscos;

public class BarraDeAsteriscos16 {
    public static void main(String[] args) {
        
        // loop for para determinar a quantidade de númeroa aleatótio
        for(int i = 0; i < 10; i++) {
            // gerar x números aleatótios entre 1 e 30
            int alea = (int) (1 + Math.random() * 30);
            // imprime o valor inteiro aleatório
            System.out.printf("%3d ", alea);
            // loop for para criar barras de asterisos
            for(int j = 0; j < alea; j++) {
                // imprime barra de asteriscos
                System.out.printf("%s", "*");
            } // end for asteriscos
            System.out.println(); // pula linha
        } // end for controlador

    } // end main
} // end class
