package exercicios.multiplus_de_dois;

import java.util.Scanner;

public class MultiplosDeDois33 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // variáveis
        long multiplos = 2; // recebe
        // enquanto multiplos menor igual a 200.000.000,00
        while (multiplos <= 2000000000) {
            // imprime o valor
            System.out.printf("%d, ", multiplos);
            multiplos *= 2; // calcula o número
        } // end while

    } // end main
} // end class
