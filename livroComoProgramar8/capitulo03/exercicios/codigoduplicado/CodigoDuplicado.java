package capitulo03.exercicios.codigoduplicado;
/*
 * 3.15 (Removendo código duplicado no método main) Na classe 
 * AccountTest da Figura 3.9, o método main contém seis instruções 
 * (linhas 13 e 14, 15 e 16, 28 e 29, 30 e 31, 40 e 41 e 42 e 43) 
 * e cada uma exibe name e balance do objeto Account. Estude essas 
 * instruções e você perceberá que elas só diferem no objeto 
 * Account sendo manipulado — account1 ou account2. Neste 
 * exercício, você definirá um novo método displayAccount que 
 * contém uma cópia dessa instrução de saída. O parâmetro do 
 * método será um objeto Account e o método irá gerar name e 
 * balance dele. Então você substituirá as seis instruções 
 * duplicadas em main por chamadas para displayAccount passando como argumento o objeto específico Account para saída.
 * Modifique a classe AccountTest da Figura 3.9 para declarar o 
 * seguinte método displayAccount após a chave direita de 
 * fechamento de main e antes da chave direita de fechamento da 
 * classe AccountTest:
 */

public class CodigoDuplicado {

   // variável de instância
   private String name; // variável de instância name
   private double balance; // variável de instância balance saldo
   private double withdrawal; // variável de instância retirada

   // o construtor inicializa name com nome do parâmetro
   // O nome do construtor (Account03) é o nome da classe
   // Classe Account03 com uma variável de instância balance do tipo double e um
   // construtor e o método deposit que executa a validação.
   public CodigoDuplicado(String name, double balance, double withdrawal) {
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
      else {
         System.out.println("WithDrawal amount exceeded account balance");
      }
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
