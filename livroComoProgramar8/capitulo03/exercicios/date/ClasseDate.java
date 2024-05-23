package capitulo03.exercicios.date;

/*
 * 3.14 (Classe Date) Crie uma classe chamada Date que inclua três 
 * variáveis de instância — mês (tipo int), dia (tipo int) e ano 
 * (tipo int). Forneça um construtor que inicializa as três 
 * variáveis de instância supondo que os valores fornecidos 
 * estejam corretos. Ofereça um método 
 * set e um get para cada variável de instância. Apresente um 
 * método displayDate que exiba mês, dia e ano separados por 
 * barras normais (/). Escreva um aplicativo de teste chamado 
 * DateTest que demonstre as capacidades da classe Date.
 */
public class ClasseDate {

   // variáveis de instância
   private int dia;
   private int mes;
   private int ano;

   // construtor
   public ClasseDate(int dia, int mes, int ano) {
      this.dia = dia;
      this.mes = mes;
      this.ano = ano;
   } // end construct

   public void setDia(int dia) {
      this.dia = dia;
   } // end setDia
     // getDia

   public int getDia() {
      return dia;
   } // end getDia

   // setmes
   public void setMes(int mes) {
      this.mes = mes;
   } // end mes
     // getmes

   public int getMes() {
      return mes;
   } // end getmes

   // setAno
   public void setAno(int ano) {
      if (ano > 1900)
         if (ano < 2030)
            this.ano = ano;
   } // end setAno
     // getAno

   public int getAno() {
      return ano;
   } // end getAno

   // displayDate
   public void displayDate() {
      System.out.printf("Data: %d/%d/%d%n%n", dia, mes, ano);
   }
} // end class
