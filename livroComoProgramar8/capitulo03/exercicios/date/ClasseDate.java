package capitulo03.exercicios.date;

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
