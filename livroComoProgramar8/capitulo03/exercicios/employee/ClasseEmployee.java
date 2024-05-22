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

      // this.salarioMes = salarioMes;
      this.setSalarioMes(salarioMes);
   } // end construct

   // método para calcular o salário anual
   private double salarioAnual() {
      double salarioAnual = this.getSalarioMes() * 12;
      return salarioAnual;
   } // end salarioanual

   // método para calcular o aumento de 10%
   // sobre o salário anual
   private double aumento() {
      // retorna o salário com 10% de aumento
      return salarioAnual() * 0.10;
   } // end aumento

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
      if (salarioMes > 0.0)
         this.salarioMes = salarioMes;
   } // end setSalarioMes

   // getSalarioMes
   public double getSalarioMes() {
      return salarioMes;
   } // end getSalarioMes

   // cria método status
   public void status() {
      System.out.println("\nNovo Empregdo:");
      System.out.printf("Nome: %s%nSobreNome: %s%nSalário mensal: R$ %.2f%n",
            this.getNome(),
            this.getSobreNome(),
            this.getSalarioMes());

      // exibe o salario anual
      System.out.printf("Salário anual: R$ %.2f%n", salarioAnual());
      // exibe aumento de 10%
      System.out.printf("Aumento de 10%%: R$ %.2f%n", aumento());
      // exibe salário anual com o aumento de 10%
      System.out.printf("Salário anual: R$ %.2f%n", (salarioAnual() + aumento()));

   } // end status
} // end class
