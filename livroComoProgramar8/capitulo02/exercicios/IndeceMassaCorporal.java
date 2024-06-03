package capitulo02.exercicios;
/*
 * 33 (Calculadora de índice de massa corporal) Introduzimos a calculadora de 
 * índice de massa corporal (IMC) no Exercício 1.10. As fórmulas para calcular o 
 * IMC Crie um aplicativo de calculadora IMC que leia o peso do usuário em libras 
 * e a altura em polegadas (ou, se preferir, o peso em quilogramas e a altura em 
 * metros) e, então, calcule e exiba o índice de massa corporal dele. Além disso, 
 * que exiba as seguintes informações do Department of Health and Human Services/
 * National Institutes of Health, assim o usuário pode avaliar o seu I
 * [Nota: neste capítulo, você aprendeu a utilizar o tipo int para representar 
 * números inteiros. Os cálculos de IMC, quando feitos com valores int, produzirão 
 * resultados com números inteiros. No Capítulo 3, você aprenderá a utilizar o 
 * tipo double para representar números com pontos decimais. Quando os cálculos de 
 * IMC são realizados com doubles, eles produzirão números com pontos decimais — 
 * esses são chamados de números de “ponto flutuante”.]
 */

import java.util.Scanner;

public class IndeceMassaCorporal {

   public static void main(String[] args) {

      // objeto Scanner
      Scanner input = new Scanner(System.in);
      // variable
      double pesoEmQuilograma = 0.0;
      double alturaEmMetros = 0.0;
      double indeceMassaCorporal = 0.0;

      // entrada de dados
      System.out.println("Índice de Massa Corporal:");
      System.out.print("Informe o peso em quilograma: ");
      pesoEmQuilograma = input.nextDouble();
      System.out.print("Informe sua altura em metros: ");
      alturaEmMetros = input.nextDouble();

      // condições para calcular
      if (pesoEmQuilograma > 0.0) {
         if (alturaEmMetros > 0.0) {
            indeceMassaCorporal = pesoEmQuilograma /
                  Math.pow(alturaEmMetros, 2);
         } // end if interno
      } // end if externo

      // show result
      System.out.printf("IMC = %.2f kg/m²%n", indeceMassaCorporal);

      // tabela
      if (indeceMassaCorporal >= 16) {
         if (indeceMassaCorporal <= 16.9) {
            System.out.println("16 a 16,9 kg/m² - Muito abaixo do peso");
         }
      }
      if (indeceMassaCorporal >= 17) {
         if (indeceMassaCorporal <= 18.4) {
            System.out.println("17 a 18,4 kg/m² - Abaixo do peso");
         }
      }
      if (indeceMassaCorporal >= 18.5) {
         if (indeceMassaCorporal <= 24.9) {
            System.out.println("18,5 a 24,9 kg/m² - Peso Normal");
         }
      }
      if (indeceMassaCorporal >= 25) {
         if (indeceMassaCorporal <= 29.9) {
            System.out.println("25 a 29,9 kg/m² - Acima do peso");
         }
      }
      if (indeceMassaCorporal >= 30) {
         if (indeceMassaCorporal <= 34.9) {
            System.out.println("30 a 34,9 kg/m² - Obesidade grau I");
         }
      }
   }
// end Main