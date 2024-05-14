package account01;

public class Account01 {
   /*
    * Classe Account que contém uma variável de instância name
    * e métodos para configurar e obter seu valor
    */

   // variável de instância
   private String name;

   // método para configurar a variável de instância name
   public void setName(String name) {
      this.name = name; // armazena o nome
   } // end setName

   // método para recuperar o nome do objeto
   public String getName() {
      return name; // retorna o valor do nome para o chamador
   } // end getName
} // end class Account
