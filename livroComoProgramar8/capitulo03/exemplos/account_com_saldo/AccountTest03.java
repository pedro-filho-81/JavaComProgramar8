package account_com_saldo;

import java.util.Scanner;

public class AccountTest03 {
   /*
    * Cria e manipula um objeto Account
    * Entrada e saída de números de ponto
    * flutuante com objetos Account.
    */
   public static void main(String[] args) {

      // cria 2 objetos Account e o atribui a myAccount
      /*
       * Usando o construtor de Account para
       * inicializar a variável de
       * instância name e balance no
       * momento em que cada objeto Account é criado.
       */
      Account03 myAccount1 = new Account03("Jane Green", 50.00);
      Account03 myAccount2 = new Account03("John Blue", -7.53);

      // exibe saldo inicial de cada objeto
      System.out.printf("\n%s balance: $%.2f%n",
            myAccount1.getName(), myAccount1.getBalance());
      System.out.printf("%s balance: $%.2f %n%n",
            myAccount2.getName(), myAccount2.getBalance());

      // cria um Scanner para obter entrada a partir da janela de comando
      Scanner input = new Scanner(System.in);

      System.out.print("Enter deposit amount for account1: "); // prompt
      double depositAmount = input.nextDouble(); // obtém a entrada do usuário
      System.out.printf("%n adding %.2f to account1 balance%n%n",
            depositAmount);
      myAccount1.deposit(depositAmount); // adiciona o saldo de account1

      // exibe os saldos
      System.out.printf("%s balance: $%.2f %n",
            myAccount1.getName(), myAccount1.getBalance());
      System.out.printf("%s balance: $%.2f %n%n",
            myAccount2.getName(), myAccount2.getBalance());

      System.out.print("Enter deposit amount for account2: "); // prompt
      depositAmount = input.nextDouble(); // obtém a entrada do usuárioÿ
      System.out.printf("%n adding %.2f to account2 balance%n%n",
            depositAmount);
      myAccount2.deposit(depositAmount); // adiciona ao saldo de account2

      // exibe os saldos
      System.out.printf("%s balance: $%.2f %n",
            myAccount1.getName(), myAccount1.getBalance());
      System.out.printf("%s balance: $%.2f %n%n",
            myAccount2.getName(), myAccount2.getBalance());

   } // end main
} // end class
