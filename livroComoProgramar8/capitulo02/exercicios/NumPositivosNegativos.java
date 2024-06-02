package capitulo02.exercicios;
/*
 * 2.32 (Valores negativos, positivos e zero) Escreva um programa que insira cinco 
 * números, além de determinar e imprimir quantos negativos, quantos positivos e 
 * quantos zeros foram inseridos.
 */

import java.util.Scanner;

public class NumPositivosNegativos {
   public static void main(String[] args) {

      Scanner input = new Scanner(System.in);

      // variables
      int numPositivo = 0;
      int numNegativo = 0;
      int contaZeros = 0;

      // entrada de dados
      System.out.print("Digite um inteiro: ");
      int num1 = input.nextInt();
      System.out.print("Segundo inteiro: ");
      int num2 = input.nextInt();
      System.out.print("Terceiro inteiro: ");
      int num3 = input.nextInt();
      System.out.print("Quarto inteiro: ");
      int num4 = input.nextInt();
      System.out.print("Quinto inteiro: ");
      int num5 = input.nextInt();

      // condições

      if (num1 == 0) {
         contaZeros++;
      }
      if (num2 == 0) {
         contaZeros++;
      }
      if (num3 == 0) {
         contaZeros++;
      }
      if (num4 == 0) {
         contaZeros++;
      }
      if (num5 == 0) {
         contaZeros++;
      }

      if (num1 > 0) {
         numPositivo++;
      }
      if (num1 < 0) {
         numNegativo++;
      }
      if (num2 > 0) {
         numPositivo++;
      }
      if (num2 < 0) {
         numNegativo++;
      }

      if (num3 > 0) {
         numPositivo++;
      }
      if (num3 < 0) {
         numNegativo++;
      }

      if (num4 > 0) {
         numPositivo++;
      }
      if (num4 < 0) {
         numNegativo++;
      }

      if (num5 > 0) {
         numPositivo++;
      }
      if (num5 < 0) {
         numNegativo++;
      }

      // resultado
      System.out.println("Total de números zeros: " + contaZeros);
      System.out.println("Total de números positivos: " + numPositivo);
      System.out.println("Total de números negativos: " + numNegativo);
   } // end main
} // end clss
