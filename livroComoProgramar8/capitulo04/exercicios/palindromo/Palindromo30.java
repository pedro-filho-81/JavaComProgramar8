/*
 * 4.30 (Palíndromos) Um palíndromo é uma sequência de caracteres que 
 * é lida da esquerda para a direita ou da direita para a esquerda. 
 * Por exemplo, cada um dos seguintes inteiros de cinco dígitos 
 * é um palíndromo: 12321, 55555, 45554 e 11611. Escreva um aplicativo 
 * que lê em um inteiro de cinco dígitos e determina se ele é ou não 
 * um palíndromo. Se o número não for de cinco dígitos, exiba uma mensagem 
 * de erro e permita que o usuário insira um novo valor.
 */
package exercicios.palindromo;

import java.util.Scanner;

public class Palindromo30 {
    public static void main(String[] args) {

        // objeto Scanner
        Scanner input = new Scanner(System.in);

        // variáveis
        int valor = 0;
        int n1, n2, n3, n4, n5;

        // enquanto valor maior que 10000 e menor que 100000 faça
        while (valor < 10000 || valor < 100000) {
            // entrada de dados
            System.out.print("Informe um valor entre 10000 e 99999 ( >= 100000 para sair): ");
            valor = input.nextInt(); // entradda do usuário

            // se o valor for maior ou igual a 10.000 e menor ou igual a 99.999 faça
            if (valor >= 10000 && valor <= 99999) {

                // calcular separar o valor
                n1 = valor / 10000;
                n2 = valor % 10000 / 1000;
                n3 = valor % 1000 / 100;
                n4 = valor % 100 / 10;
                n5 = valor % 10 / 1;

                // se n1 igual a n5 e n2 igual a n4
                if (n1 == n5 && n2 == n4) {
                    // imprima
                    System.out.printf("%d é um palìndromo.\n", valor);
                } else { // se não
                    // imprima
                    System.out.printf("%d não é um palíndromo.\n", valor);
                } // end else
                
            } else if (valor < 10000) { // se valor menor que 10000
                // imprima
                System.out.println("ERRADO! Valor indevido.");
            } // end else if

        } // end while
        System.out.println("Volte sempre.");
    } // end main
} // end class
