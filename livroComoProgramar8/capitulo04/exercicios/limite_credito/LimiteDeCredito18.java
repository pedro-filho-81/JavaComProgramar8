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

   } // end main
} // end class
