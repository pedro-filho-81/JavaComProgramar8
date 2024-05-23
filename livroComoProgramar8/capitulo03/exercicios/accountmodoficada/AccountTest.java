package capitulo03.exercicios.accountmodoficada;

import java.util.Scanner;

import capitulo03.exercicios.date.ClasseDate;

public class AccountTest {
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
            AccountModificada myAccount1 = new AccountModificada("Jane Green", 50.00, 0.00);
            // exibe myAccount1
            myAccount1.status();

            // cria objeto myAccount2
            AccountModificada myAccount2 = new AccountModificada("John Blue", -7.53, 0.00);
            // exibe myAccount2
            myAccount2.status();

            // cria o objeto Scanner input para obter entrada a partir da janela de comando
            Scanner input = new Scanner(System.in);

            // entrada de dados
            System.out.print("Enter deposit amount for account1: "); // prompt
            double depositAmount = input.nextDouble(); // obtém a entrada do usuário
            System.out.printf("%n adding %.2f to account1 balance%n%n",
                        depositAmount);
            myAccount1.deposit(depositAmount); // adiciona o saldo de account1

            // exibe os saldos
            myAccount1.status();

            System.out.print("Enter deposit amount for account2: "); // prompt
            depositAmount = input.nextDouble(); // obtém a entrada do usuárioÿ
            System.out.printf("%n adding %.2f to account2 balance%n%n",
                        depositAmount);
            myAccount2.deposit(depositAmount); // adiciona ao saldo de account2

            // exibe os saldos atuais
            myAccount2.status();

            // saque myAccount1
            System.out.println("myAccount1: Digite o valor do saque R$: ");
            double withdrawAccount = input.nextDouble();
            myAccount1.withdraw(withdrawAccount);

            // exibe o saldo
            myAccount1.status();

            // saque para myAccount2
            System.out.println("myAccount2: Digite o valor do saque R$: ");
            withdrawAccount = input.nextDouble();
            myAccount2.withdraw(withdrawAccount);

            // exibe o saldo
            myAccount2.status();
      } // end main
}
// end class
