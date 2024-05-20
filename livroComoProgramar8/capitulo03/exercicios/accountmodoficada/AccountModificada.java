package capitulo03.exercicios.accountmodoficada;
/*
 * 3.11 (Classe Account modificada) Modifique a
 * 
 * classe Account (Figura 3.8) para
 * fornecer um método chamado withdraw que retira dinheiro de uma Account.
 * Assegure que o valor de débito não exceda o saldo de Account. Se exceder, o
 * saldo deve ser deixado inalterado
 * e o método deve imprimir uma mensagem que indica
 * "Withdrawal amount exceeded account balance" [Valor de débito
 * excedeu o saldo da conta]. Modifique a classe AccountTest (Figura 3.9) para
 * testar o método withdraw
 */

public class AccountModificada {

   // variável de instância
   private String name; // variável de instância name
   private double balance; // variável de instância balance saldo
   private double withdrawal; // variável de instância retirada

   // o construtor inicializa name com nome do parâmetro
   // O nome do construtor (Account03) é o nome da classe
   // Classe Account03 com uma variável de instância balance do tipo double e um
   // construtor e o método deposit que executa a validação.
   public AccountModificada(String name, double balance, double withdrawal) {
      this.name = name; // recebe o nome
      // valida que o balance é maior que 0.0; se não for,
      // a variável de instância balance mantém seu valor inicial padrão de 0.0
      // se balance maior ou igual a zero
      if (balance >= 0.0) {
         this.balance = balance; // variável de instância balance recebe valores
      } // end if

      // se retirar menor ou igual ao saldo
      if (withdrawal >= 0.0) {
         // retirar recebe o valor restante do saldo
         this.withdrawal = withdrawal;
      } // end if
   } // end construct

   // método que retira valores da conta caso haja saldo maior que zero
   public void withdraw(double withdrawAccount) {
      // se retirar menor ou igual ao saldo
      if (withdrawAccount <= balance) {
         this.balance = balance - withdrawAccount;
         // retirar recebe o valor restante do saldo
         this.withdrawal = withdrawAccount;
      } // end withdraw
   } // end withdrawal

   public double getWithdraw() {
      return withdrawal; // recebe o valor do saldo
   } // end get

   // método que deposita (adiciona) apenas uma quantia válida no saldo
   public void deposit(double depositAmount) {
      if (depositAmount > 0.0) { // se depositAmount for válido
         balance = balance + depositAmount; // o adiciona ao saldo
      }
   } // end deposit

   // método retorna o saldo da conta ÿ
   public double getBalance() {
      return balance; // retorna o valor do saldo
   }

   // método para configurar a variável de instância name
   public void setName(String name) {
      this.name = name; // armazena o nome
   } // end setName

   // método para recuperar o nome do objeto
   public String getName() {
      return name; // retorna o valor do nome para o chamador
   } // end getName
} // end class Account
