package account_com_saldo;

public class Account03 {
   /*
    * Classe Account03 que contém duas variáveis de instância name e balance
    * e métodos para configurar e obter seu valor
    */

   // variável de instância
   private String name;
   private double balance;

   // o construtor inicializa name com nome do parâmetro
   // O nome do construtor (Account03) é o nome da classe
   // Classe Account03 com uma variável de instância balance do tipo double e um
   // construtor e o método deposit que executa a validação.
   public Account03(String name, double balance) {
      this.name = name; // recebe o nome

      // valida que o balance é maior que 0.0; se não for,
      // a variável de instância balance mantém seu valor inicial padrão de 0.0
      // se balance maior ou igual a zero
      if (balance >= 0.0) {
         this.balance = balance; // variável de instância balace recebe valores
      } // end if
   } // end construct

   // método que deposita (adiciona) apenas uma quantia válida no saldo ÿ
   public void deposit(double depositAmount) {
      if (depositAmount > 0.0) // se depositAmount for válido
         balance = balance + depositAmount; // o adiciona ao saldo
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
   } // end getName public class Account03 {
   /*
    * Classe Account03 que contém duas variáveis de instância name e balance
    * e métodos para configurar e obter seu valor
    */

   // variável de instância
   private String name;
   private double balance;

   // o construtor inicializa name com nome do parâmetro
   // O nome do construtor (Account03) é o nome da classe
   // Classe Account03 com uma variável de instância balance do tipo double e um
   // construtor e o método deposit que executa a validação.
   public Account03(String name, double balance) {
      this.name = name; // recebe o nome

      // valida que o balance é maior que 0.0; se não for,
      // a variável de instância balance mantém seu valor inicial padrão de 0.0
      // se balance maior ou igual a zero
      if (balance >= 0.0) {
         this.balance = balance; // variável de instância balace recebe valores
      } // end if
   } // end construct

   // método que deposita (adiciona) apenas uma quantia válida no saldo ÿ
   public void deposit(double depositAmount) {
      if (depositAmount > 0.0) // se depositAmount for válido
         balance = balance + depositAmount; // o adiciona ao saldo
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

} // end class Account
