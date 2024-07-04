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
        int valor; // para entrada dos valores
        int menor = 0; // para o menor valor encontrado

        // entrada de dados
        System.out.print("Informe o número de inteiro a cadastrar: ");
        int n = input.nextInt(); // usuário informa quantos valores vão ser cadastrados

        // loop for para cadastrar (n) inteiros
        for(int i  = 0; i < n; i++) {
        
            // entrada dos valores para comparação
            System.out.printf("Digite o %dº inteiro: ", i + 1);
            valor = input.nextInt(); // entrada do usuário
            // se for a primeira contagem
            if (i == 0) {
                // var menor recebe o primeiro valor
                menor = valor;
            } // end if
            // menor recebe a verificação se o número digitado é o menor valor
            menor = Math.min(menor, valor); // usando o método min da classe Math

        } // end for
        // exibe o menor valor processado
        System.out.printf("O menor valor é: %d%n ", menor);
    } // end main
} // end class
