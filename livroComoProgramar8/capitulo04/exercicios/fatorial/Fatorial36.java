package exercicios.fatorial;

import java.util.Scanner;

public class Fatorial36 {
    public static void main(String[] args) {
        // objeto Scanner
        Scanner input = new Scanner(System.in);

        // variável
        int multiplicar = 1;
        int valor = 0;

        // entrada de dados
        System.out.print("Informe um inteiro para ver seu fatorial(-1 para sair): ");
        valor = input.nextInt(); // entrada do usuário

        // faça enquanto o valor diferente de -1
        while (valor != -1) {

            // verifica se o valor é maior que zero
            if (valor > 0) { // se verdade
                // imprime o valor
                System.out.printf("O fatorial de %d! = ", valor);
                // e atribui o valor ao contador
                int contador = valor;

                // enquanto contador maior ou igual a 2 faça
                while (contador >= 2) {
                    // calcule
                    multiplicar *= contador;
                    // exiba a multiplicação
                    System.out.printf("%d x ", contador);
                    // decrementa o contador
                    contador--;
                } // end while >= 2

                // verifica se o contador é menor que 2
                if (contador < 2) { // se verdade
                    // exibe o valor da multiplicação
                    System.out.printf("1 = %d%n", multiplicar);
                } // end if < 2

            } // end if > 0

            // entrada de dados
            System.out.print("Informe um inteiro para ver seu fatorial(-1 para sair): ");
            valor = input.nextInt(); // entrada do usuário

            // inicializa multiplicar
            multiplicar = 1;
        } // end while -1
    } // end main
} // end class
