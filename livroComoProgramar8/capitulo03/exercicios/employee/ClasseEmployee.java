package capitulo03.exercicios.employee;

/*
 * 3.13 (Classe Employee) Crie uma classe chamada 
 * Employee que inclua três variáveis de instância — 
 * um primeiro nome (tipo String), um 
 * sobrenome (tipo String) e um salário mensal 
 * (double). Forneça um construtor que inicializa as 
 * três variáveis de instância. Forneça um 
 * método set e um get para cada variável de 
 * instância. Se o salário mensal não for positivo, 
 * não configure seu valor. Escreva um aplicativo de
 * teste chamado EmployeeTest que demonstre as 
 * capacidades da classe Employee. Crie dois objetos 
 * Employee e exiba o salário anual
 * de cada objeto. Então dê a cada Employee um 
 * aumento de 10% e exiba novamente o salário anual 
 * de cada Employee.
 */
public class ClasseEmployee {

   // variáveis de instância
   private String nome;
   private String sobreNome;
   private double salarioMes;

   // construtor
   public ClasseEmployee(String nome, String sobreNome, double salarioMes) {
      this.nome = nome;
      this.sobreNome = sobreNome;
      this.salarioMes = salarioMes;
   } // end construct

   // setNome
   public void setNome(String nome) {
      this.nome = nome;
   } // end setNome

   // getNome
   public String getNome() {
      return nome;
   } // end getNome

   // setSobreNome
   public void setSobreNome(String sobreNome) {
      this.sobreNome = sobreNome;
   } // end setSobreNome

   // getSobreNome
   public String getSobreNome() {
      return sobreNome;
   } // end getSobreNome

   // setSalario
   public void setSalarioMes(double salarioMes) {
      this.salarioMes = salarioMes;
   } // end setSalarioMes

   // cria método status
   public void status() {
      System.out.println("\nNovo Empregdo:");
      System.out.printf("Nome: %s%nSobreNome: %s%nSalário R$: %.2f%n%n", this.nome, this.sobreNome, this.salarioMes);
   } // end status
} // end class
