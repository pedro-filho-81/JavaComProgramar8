/*
 * 5.11 (Localize o menor valor) Escreva um aplicativo que localiza 
 * o menor de vários números inteiros. Suponha que o primeiro valor lido 
 * especifica o número de valores a serem inseridos pelo usuário.
 */
package exercicios.localiza_menor_valor;

import java.util.Scanner;

public class LocalizaMenorValor11 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // variáveis
        int valor;
        int menor = 0;

        // entrada de dados
        System.out.print("Informe o número de inteiro a cadastrar: ");
        int n = input.nextInt();

        // loop for para cadastrar inteiros
        for(int i  = 0; i < n; i++) {
        
            System.out.print("Digite um inteiro: ");
            valor = input.nextInt();
            if (i == 0) {
                menor = valor;
            } // end if
            menor = Math.min(menor, valor);

        } // end for
        System.out.printf("O menor valor é: %d%n ", menor);
    } // end main
} // end class
