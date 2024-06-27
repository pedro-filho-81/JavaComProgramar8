package exercicios.decimal_para_binario;

import java.util.Scanner;

public class DecimalParaBinario31_2 {
    public static void main(String[] args) {

        // objeto Scanner
        Scanner input = new Scanner(System.in);

        // variáveis
        int numeroBinario = 0;
        int numeroDecimal = 0;
        int power = 0;
        int temp = 0;

        // entrada de dados
        System.out.println("Converte valor Binário em Decimal");
        System.out.print("Informe o valor binário (-1 para sair): ");
        // entrada do usuário
        numeroBinario = input.nextInt();

        // se número binário diferente de -1
        if (numeroBinario != -1) {
            // imprima
            System.out.printf("O valor binário %d%n", numeroBinario);
        } // end if

        // enquanto nùmero binário diferente de -1 faça
        while (numeroBinario != -1) {

            // enquanto número binário maior que zero faça
            while (numeroBinario > 0) {
                // pegando o dígito mais à direita do númerobinário
                temp = numeroBinario % 10;
                // agora multiplicando o dígito e adicionando-o
                // à variável decimalNumber
                numeroDecimal += temp * Math.pow(2, power);
                // removendo o dígito mais à direita da variável numeroBinario
                numeroBinario = numeroBinario / 10;
                // incrementando a variável de potência em 1 para ser usada como potência para 2
                power++;
            } // end while

            // exibe resultado
            System.out.printf("Equivale ao valor decimal: %d%n", numeroDecimal);

            // inicializa as variáveis após resolução
            power = 0;
            numeroDecimal = 0;

            // entrada de dados
            System.out.println("\nConverte valor Binário em Decimal");
            System.out.print("Informe o valor binário (-1 para sair): ");
            // entrada do usuário
            numeroBinario = input.nextInt();
            // se o número binário diferente de -1
            if (numeroBinario != -1) {
                // imprima
                System.out.printf("O valor binário %d%n", numeroBinario);
            } // end if
        } // end while -1
    } // end main
} // end class