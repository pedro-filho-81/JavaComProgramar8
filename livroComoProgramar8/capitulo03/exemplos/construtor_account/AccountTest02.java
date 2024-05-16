package construtor_account;

public class AccountTest02 {
   /*
    * Cria e manipula um objeto Account
    */
   public static void main(String[] args) {

      // cria 2 objetos Account e o atribui a myAccount
      /*
       * Usando o construtor de Account para
       * inicializar a variável de instância name no
       * momento em que cada objeto Account é criado.
       */
      Account02 myAccount1 = new Account02("Jane Green");
      Account02 myAccount2 = new Account02("John Blue");

      // exibe o valor inicial do nome
      System.out.printf("Initial name is: %n%s%n%n", myAccount1.getName());

      // exibe o valor inicial do nome
      System.out.printf("Initial name is: %n%s%n%n", myAccount2.getName());
   } // end main
} // end class
