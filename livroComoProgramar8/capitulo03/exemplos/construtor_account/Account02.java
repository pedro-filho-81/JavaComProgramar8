package construtor_account;

public class Account02 {
   /*
    * Classe Account que contém uma variável de instância name
    * e métodos para configurar e obter seu valor
    */

   // variável de instância
   private String name;

   // o construtor inicializa name com nome do parâmetro
   // O nome do construtor (Account02) é o nome da classe
   public Account02(String name) {
      this.name = name; // layout
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
