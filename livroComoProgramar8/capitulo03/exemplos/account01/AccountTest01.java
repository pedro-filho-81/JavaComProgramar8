package account01;

import java.util.Scanner;

public class AccountTest01 {
   /*
    * Cria e manipula um objeto Account
    */
   public static void main(String[] args) {
      // cria o objeto Scanner para a entrada de dados pelo usuário
      Scanner input = new Scanner(System.in);

      // cria o objeto Account e o atribui a myAccount
      Account01 myAccount = new Account01();

      // exibe o valor inicial do nome
      System.out.printf("Initial name is: %n%s%n%n", myAccount.getName());

      // entrada de dados
      System.out.print("Please entre the name:");
      String theName = input.nextLine(); // nome informado pelo usuário
      // objeto myAccount.setName recebe o valor de theName
      myAccount.setName(theName);
      System.out.println(); // new line

      // show result, exibe o nome armazenodo no objeto myAccount
      System.out.printf("Name in objeto myAccount is: %s%n%n", myAccount.getName());
   } // end main
} // end class
