package exercicios.comissaodevendas;

/*
 * 4.19 (Calculador de comissão de vendas) Uma grande empresa paga 
 * seu pessoal de vendas com base em comissões. O pessoal de 
 * vendas recebe R$ 200 por semana mais 9% de suas vendas brutas 
 * durante esse período. Por exemplo, um vendedor que realiza um 
 * total de vendas de mercadorias de R$ 5.000 em uma semana recebe 
 * R$ 200 mais 9% de R$ 5.000, um total de R$ 650. Foi-lhe 
 * fornecida uma lista dos itens vendidos por cada vendedor. Os 
 * valores desses itens são como segue:
 * Item Value 
 * 1    239.99 
 * 2    129.75 
 * 3     99.95 
 * 4    350.89
 * Desenvolva um aplicativo Java que recebe entrada de itens 
 * vendidos por um vendedor durante a última semana e calcula e 
 * exibe os rendimentos do vendedor. Não existe nenhum limite para 
 * o número de itens que pode ser vendido.
 */
import java.util.Scanner;

public class ComissaoDeVendas19 {
   public static void main(String[] args) {
      // objeto
      Scanner input = new Scanner(System.in);

      // constante
      final double FIXO = 200.00;
      final double COmISSAO = 0.09;
      final double item1 = 239.99;
      final double item2 = 129.75;
      final double item3 = 99.15;
      final double item4 = 350.89;

      // Variável
      double valorVendas = 0.0;
      double salario = 0.0;
      double comissao = 0.0;
      int vendedor = 0;
      int quant1 = 0;
      int quant2 = 0;
      int quant3 = 0;
      int quant4 = 0;

      // entrada de dados
      System.out.print("Número do vendedor (-1 para sair): ");
      vendedor = input.nextInt();

      // enquanto vendedor diferente de -1 faça
      while (vendedor != -1) {

         System.out.print("Quantidade das vendas do item 1: ");
         quant1 = input.nextInt();
         System.out.print("Quantidade das vendas do item 2: ");
         quant2 = input.nextInt();
         System.out.print("Quantidade das vendas do item 3: ");
         quant3 = input.nextInt();
         System.out.print("Quantidade das vendas do item 4: ");
         quant4 = input.nextInt();

         // calcular itens
         valorVendas = (quant1 * item1) + (quant2 * item2) + (quant3 * item3) + (quant4 * item4);
         comissao = valorVendas * COmISSAO;
         salario = valorVendas * COmISSAO + FIXO;

         // exibe resultados
         System.out.println("\nComissão das vendas:");
         System.out.println("Vendedor: " + vendedor);
         System.out.printf("Produto 1 - %d unidade(s) R$ %.2f%n", quant1, quant1 * item1);
         System.out.printf("Produto 2 - %d unidade(s) R$ %.2f%n", quant2, quant2 * item2);
         System.out.printf("Produto 3 - %d unidade(s) R$ %.2f%n", quant3, quant3 * item3);
         System.out.printf("Produto 4 - %d unidade(s) R$ %.2f%n", quant4, quant4 * item4);
         System.out.printf("Valor das Vendas R$ %.2f%n", valorVendas);
         System.out.printf("Comissão R$ %.2f%n", comissao);
         System.out.printf("Salário R$ %.2f%n%n", salario);

         // entrada de dados
         System.out.print("Número do vendedor (-1 para sair): ");
         vendedor = input.nextInt();

      } // end while
   } // end main
} // end class
