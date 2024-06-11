package exercicios.limite_credito;

/*
 * 4.18 (Calculador de limite de crédito) Desenvolva um aplicativo 
 * Java que determina se um cliente de uma loja de departamentos 
 * excedeu o limite de crédito em uma conta-corrente. Para cada 
 * cliente, os seguintes dados estão disponíveis:
 * a) Número de conta. 
 * b) Saldo no início do mês. 
 * c) Total de todos os itens cobrados desse cliente no mês.
 * d) Total de créditos aplicados ao cliente no mês.
 * e) Limite de crédito autorizado.
 * O programa deve inserir todos esses dados como inteiros, 
 * calcular o novo saldo (= saldo inicial + despesas – créditos), 
 * exibir o novo saldo e determinar se o novo saldo excede ao 
 * limite de crédito do cliente. Para aqueles clientes cujo limite 
 * de crédito foi excedido, o programa deve exibir a mensagem 
 * "Limite de crédito excedido".
 */

import java.util.Scanner;

public class LimiteDeCredito18 {
   public static void main(String[] args) {

      // objeto Scanner
      Scanner input = new Scanner(System.in);

      // variáveis
      int conta = 0;
      int saldoInicial = 0;
      int totalTaxas = 0;
      int totalCreditos = 0;
      int limiteCredito = 0;
      int novoSaldo = 0;

      // entrada de dados
      System.out.println("\nLimite de crédito:");
      System.out.print("Entre com o número da conta (-1 para sair): ");
      conta = input.nextInt();

      // enquanto conta diferente de -1 faça
      while (conta != -1) {

         // entrada do usuário
         System.out.print("Entre com o saldo inicial R$ ");
         saldoInicial = input.nextInt();
         System.out.print("Entre com o total de taxas R$ ");
         totalTaxas = input.nextInt();
         System.out.print("Entre com o total de créditos R$ ");
         totalCreditos = input.nextInt();
         System.out.print("Entre com o limite de crédito R$ ");
         limiteCredito = input.nextInt();

         // calcular
         novoSaldo = saldoInicial + totalTaxas - totalCreditos;

         // exibe resultado
         if (novoSaldo > limiteCredito) {
            System.out.println("Novo saldo R$ " + novoSaldo);
            System.out.println("Conta: " + conta);
            System.out.println("Limite de crédito R$ " + limiteCredito);
            System.out.println("Saldo R$ " + novoSaldo);
            System.out.println("Limite de crédito excedido.");
         } else {
            System.out.println("Novo saldo R$ " + novoSaldo);
         } // end else

         // entrada de dados
         System.out.println("\nLimite de crédito:");
         System.out.print("Entre com o número da conta (-1 para sair): ");
         conta = input.nextInt();

      } // end while
      System.out.println("Volte sempre.");
   } // end main
} // end class
