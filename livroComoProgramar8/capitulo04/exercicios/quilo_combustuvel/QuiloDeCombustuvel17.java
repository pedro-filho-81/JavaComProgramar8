package exercicios.quilo_combustuvel;

/*
 * 4.17 (Quilometragem de combustível) Os motoristas se preocupam 
 * com a quilometragem obtida por seus automóveis. Um motorista 
 * monitorou várias viagens registrando a quilometragem dirigida e 
 * a quantidade de combustível em litros utilizados para cada 
 * tanque cheio. 
 * Desenvolva um aplicativo Java que receba como entrada os 
 * quilômetros dirigidos e os litros de gasolina consumidos (ambos 
 * como inteiros) para cada viagem. O programa deve calcular e 
 * exibir o consumo em quilômetros/litro para cada viagem e 
 * imprimir a quilometragem total e a soma total de litros de 
 * combustível consumidos até esse ponto para todas as viagens. 
 * Todos os cálculos de média devem produzir resultados de ponto 
 * flutuante. Utilize classe Scanner e repetição controlada por 
 * sentinela para obter os dados do usuário.
 */
import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

class QuiloDeCombustuvel17 {
   public static void main(String[] args) {
      // Scanner object
      Scanner input = new Scanner(System.in);

      // variáveis
      double KmDirigidos = 0.0;
      double combustivel = 0.0;
      double consumo = 0.0;
      double totalConsumo = 0.0;
      double totalKm = 0.0;

      // data input
      System.out.println("\nConsumo de combustível");
      System.out.print("Entre com a quilometragem (-1 para sair): ");
      KmDirigidos = input.nextDouble();

      // enquanto km dirigidos for diferente de -1 faça
      while (KmDirigidos != -1) {

         // entrada do combustível
         System.out.print("Quantidade de combustível consumido: ");
         combustivel = input.nextDouble();

         // calcular consumo na viagem
         consumo = KmDirigidos / combustivel;
         totalConsumo += consumo;
         totalKm += KmDirigidos;

         // resumo da viagem
         System.out.printf("Km/litros deste tanque: %.5f%n", consumo);
         System.out.printf("Total de Kms rodados: %.0f%n", totalKm);
         System.out.printf("Total Km/litros: %.5f%n", totalConsumo);

         // data input
         System.out.println("\nConsumo de combustível");
         System.out.print("Entre com a quilometragem (-1 para sair): ");
         KmDirigidos = input.nextDouble();

      } // end while
   } // end main
} // end class