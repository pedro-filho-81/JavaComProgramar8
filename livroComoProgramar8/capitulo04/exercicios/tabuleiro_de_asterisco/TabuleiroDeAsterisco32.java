package exercicios.tabuleiro_de_asterisco;

import java.util.Scanner;

public class TabuleiroDeAsterisco32 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // variáveis
        int tamanho = 0;
        int contador = 0;
        int linha = 0;

        // entrada de dados
        System.out.print("Informe o tamabho do tabuleiro (-1 para sair): ");
        tamanho = input.nextInt(); // ENTRADA DO USUÁRIO

        // CONTROLA A EXECUÇÃO PARA CRIAR O TABULEIRO
        // Enquanto o tamanho diferente de -1 faça
        while (tamanho != -1) { // -1 valor do sentinela

            // DESENHA O TABULEIRO
            // enquanto contador menor que o tamanho faça
            while (contador < tamanho) {

                // CRIA A LINHA
                // enquanto linha menor que o tamanho faça
                while (linha < tamanho) {
                    // imprima uma linha de asteriscos
                    System.out.print("* ");
                    linha++; // incrementa 1 a linha
                } // end while interno

                System.out.println(); // pula linha
                contador++; // incrementa contador
                linha = 0; // inicializa a linha para criar nova linha

                if (contador % 2 == 1) { // verifica se contador é ímpar, se verdade
                    System.out.print(" "); // imprime um espaço vazio antes da linha de asterisco
                } // end if

            } // end while externo

            // entrada de dados
            System.out.print("Informe o tamabho do tabuleiro (-1 para sair): ");
            tamanho = input.nextInt();

            contador = 0; // inicializa o contador para fazer novo tabuleiro

        } // end while sentinela

    } // end main
} // end class
