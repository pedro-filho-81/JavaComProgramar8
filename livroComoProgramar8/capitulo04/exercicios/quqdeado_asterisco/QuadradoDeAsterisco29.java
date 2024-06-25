/*
 * 4.29 (Quadrado de asteriscos) Escreva um aplicativo que solicita 
 * ao usuário que insira o tamanho do lado de um quadrado e, então, 
 * exibe um quadrado vazio desse tamanho com asteriscos. 
 * Seu programa deve trabalhar com quadrados de todos os comprimentos 
 * de lado possíveis entre 1 e 20
 */
package exercicios.quqdeado_asterisco;

import java.util.Scanner;

public class QuadradoDeAsterisco29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // variable
        int size = 0;
        int quadrado = 0;
        int linha1 = 0;
        int linha2 = 0;
        int linhaEsquerda = 0;
        int espacoVazio = 0;

        // enquanto o tamanho maior ou igual a zero e menor ou igual a 20
        while (size >= 0 && size <= 20) {

            // linha superior
            while (linha1 < size) {
                System.out.print("* ");
                linha1++;
            } // end while linha 1
            System.out.println(); // pula linha

            // linha esquerda
            while (linhaEsquerda < size - 2) {
                System.out.print("*");

                // espaço vazio
                while (espacoVazio < size - 2) {
                    System.out.print("  ");
                    espacoVazio++;
                } // end vazio
                System.out.print(" *");

                linhaEsquerda++;
                espacoVazio = 0;
                System.out.println();
            } // end linha esquerda

            // linha inferior
            while (linha2 < size) {
                System.out.print("* ");
                linha2++;
            } // end while linha 2

            // limpa as variáveis
            linha1 = 0;
            linha2 = 0;
            linhaEsquerda = 0;

            // entrada de dados
            System.out.print("\nInforme o tamanho do quadro entre 1 e 20 (-1 para sair): ");
            size = input.nextInt();

            // informa se o tamanho for menor que zero e maior que 20
            if (size > 20) {
                System.out.println("ERRADO! Valor maior que 20");
            } else {
                System.out.println("ERRADO! Valor menor que 0");
            } // end else

        } // end while size
    } // end main
} // end class
