package exercicios.decimal_para_binario;

import java.util.Scanner;

public class DecimalParaBinario31 {
    public static void main(String[] args) {
        // objeto Scanner
        Scanner input = new Scanner(System.in);

        // cabeçalho
        System.out.println("\nConverte o valor Binário em Decimal.");
        // entrada de dados
        System.out.print("Informe um valor binário: ");
        // entrada do usuário
        String numeroBinario = input.nextLine();

        // converte o valor binário em decimal
        int numeroDecimal = Integer.parseInt(numeroBinario, 2);

        // exibe os valores
        System.out.printf("O valor em binário: %s equivale ao número decimal: %d%n",
                numeroBinario, numeroDecimal);
    } // end main
} // end class