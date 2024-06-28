/*
 * Condição de existência: | b - c | < a < b + c, 
 * onde a, b e c são os lados do triângulo. 
 * 4.35 (Lados de um triângulo) Escreva um aplicativo que 
 * lê três valores diferentes de zero inseridos pelo usuário, 
 * determina e imprime se eles poderiam representar 
 * os lados de um triângulo.
 */
package exercicios.lados_do_triangulo;

import java.util.Scanner;

public class LadosDoTriangulo35 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // cabeçalho
        System.out.println("Codição para ser um Triângulo");

        // entrada de dados
        System.out.print("Informe o lado AB: ");
        int ladoAB = input.nextInt();
        System.out.print("Informe o lado CD: ");
        int ladoCD = input.nextInt();
        System.out.print("Informe o lado EF: ");
        int ladoEF = input.nextInt();

        while (ladoAB != -1 || ladoCD != -1 || ladoEF != -1) {
                
            // se os lados forem maiores que zero faça
            if (ladoAB > 0 && ladoCD > 0 && ladoEF > 0) {

                // se a soma de 2 lados for maior que o terceiro
                // pode ser um triângulo
                if (((ladoAB + ladoCD) > ladoEF) &&
                        ((ladoAB + ladoEF) > ladoCD) &&
                        ((ladoCD + ladoEF) > ladoAB)) {
                    // imprima
                    System.out.print("É um triângulo: ");

                    // se todos os lados do triângulo forem diferentes
                    if (ladoAB != ladoCD &&
                            ladoAB != ladoEF &&
                            ladoCD != ladoEF) {
                        // imprima
                        System.out.print("Escaleno.");
                    } else if (ladoAB == ladoCD && // se todos os lados forem iguais
                            ladoAB == ladoEF &&
                            ladoCD == ladoEF) {
                        // imprima
                        System.out.print("Equilátero.");
                    } else { // se não
                        // imprima
                        System.out.println("Isóceles.");
                    } // end else tipo de triângulo

                } else { // se não
                    // Imprima
                    System.out.println("Não pode ser um triângulo.");
                }
            } // end if > 0
        } // end while


    } // end main
} // end class
