package capitulo03.exercicios.codigoduplicado;

import java.util.Scanner;

public class CodigoDuplicadoTest {
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

            // cria objeto myAccount1
            CodigoDuplicado myAccount1 = new CodigoDuplicado("Jane Green", 50.00, 0.00);
            // exibe myAccount1
            displayAccount(myAccount1);

            // cria objeto myAccount2
            CodigoDuplicado myAccount2 = new CodigoDuplicado("John Blue", -7.53, 0.00);
            // exibe myAccount2
            displayAccount(myAccount2);

            // cria o objeto Scanner input para obter entrada a partir da janela de comando
            Scanner input = new Scanner(System.in);

            // entrada de dados
            System.out.print("Enter deposit amount for account1: "); // prompt
            double depositAmount = input.nextDouble(); // obtém a entrada do usuário
            System.out.printf("%n adding %.2f to account1 balance%n%n",
                        depositAmount);
            myAccount1.deposit(depositAmount); // adiciona o saldo de account1

            // exibe os saldos
            displayAccount(myAccount1);

            System.out.print("Enter deposit amount for account2: "); // prompt
            depositAmount = input.nextDouble(); // obtém a entrada do usuárioÿ
            System.out.printf("%n adding %.2f to account2 balance%n%n",
                        depositAmount);
            myAccount2.deposit(depositAmount); // adiciona ao saldo de account2

            // exibe os saldos atuais
            displayAccount(myAccount2);

            // saque myAccount1
            System.out.println("myAccount1: Digite o valor do saque R$: ");
            double withdrawAccount = input.nextDouble();
            myAccount1.withdraw(withdrawAccount);

            // exibe o saldo
            displayAccount(myAccount1);

            // saque para myAccount2
            System.out.println("myAccount2: Digite o valor do saque R$: ");
            withdrawAccount = input.nextDouble();
            myAccount2.withdraw(withdrawAccount);

            // exibe o saldo
            displayAccount(myAccount2);
      } // end main

      // displayAccount
      public static void displayAccount(CodigoDuplicado displayToAccount) {
            // exibe os saldos atuais
            System.out.println("Saldo atual: ");
            System.out.printf("Nome: %s, Saldo: $%.2f, Saque: $%.2f %n%n",
                        displayToAccount.getName(),
                        displayToAccount.getBalance(),
                        displayToAccount.getWithdraw());
      } // end displayToAccount
} // end class