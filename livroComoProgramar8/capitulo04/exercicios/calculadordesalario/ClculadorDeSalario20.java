/*
 * 4.20 (Calculador de salários) Desenvolva um aplicativo Java que 
 * determina o salário bruto de cada um de três empregados. A 
 * empresa paga as horas normais pelas primeiras 40 horas 
 * trabalhadas por cada funcionário e 50% a mais por todas as 
 * horas trabalhadas além das 40 horas. Você recebe uma lista de 
 * empregados, o número de horas trabalhadas por eles na semana 
 * passada e o salário-hora de cada um. Seu programa deve aceitar 
 * a entrada dessas informações para cada empregado e, então, 
 * determinar e exibir o salário bruto do empregado. Utilize a 
 * classe Scanner para inserir os dados.
 */
package exercicios.calculadordesalario;

import java.util.Scanner;

public class ClculadorDeSalario20 {
   public static void main(String[] args) {

      // objeto Scanner
      Scanner input = new Scanner(System.in);

      // constantes
      final int HORASNORmAIS = 40;
      final double HORASEXTRAS = 0.50;

      // variáveis
      double vlHorasTrabalhadas = 0.0;
      double vlHorasExtras = 0.0;
      double salario = 0.0;
      double salarioNormal = 0.0;
      int horasTrabalhadas = 0;

      // entrada de dados
      System.out.print("Informe às horas trabalhadas (-1 para sair): ");
      horasTrabalhadas = input.nextInt();

      while (horasTrabalhadas > 0) {

         System.out.print("Informe o valor das horas trabalhadas R$ ");
         vlHorasTrabalhadas = input.nextDouble();

         // calcular horas extras
         vlHorasExtras = (horasTrabalhadas - HORASNORmAIS) * (vlHorasTrabalhadas * HORASEXTRAS + vlHorasTrabalhadas);
         salarioNormal = HORASNORmAIS * vlHorasTrabalhadas;

         // condições para calcular
         if (horasTrabalhadas <= 40) {
            // calcular salário normal
            salario = horasTrabalhadas * vlHorasTrabalhadas;
         } else if (horasTrabalhadas > 40) {
            salario = vlHorasExtras + salarioNormal;
         }
         if (vlHorasExtras < 0) {
            vlHorasExtras = 0.0;
         }
         if (salario < 0.0) {
            salario = 0.0;
         }

         // exibe resultado
         System.out.println("\nExtrato de Pagamento");
         System.out.printf("Horas trabalhadas: %dh%n", horasTrabalhadas);
         if (horasTrabalhadas <= 0) {
            System.out.println("Horas trabalhadas deve ser maior que zero.");
         }
         System.out.println("Valor das horas trabalhadas R$ " + vlHorasTrabalhadas);
         System.out.printf("Valor das horas extras R$ %.2f%n", vlHorasExtras);
         System.out.printf("Salário R$ %.2f%n", salario);
         System.out.println();

         // entrada de dados
         System.out.print("Informe às horas trabalhadas (-1 para sair): ");
         horasTrabalhadas = input.nextInt();

      } // end while
   } // end main
} // end class
