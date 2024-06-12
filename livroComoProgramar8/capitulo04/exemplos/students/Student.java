package exemplos.students;

/*
 * Classe Student armazena o nome e calcula a média das notas de um aluno
 */
public class Student {

   // variáveis de instncia
   private String name;
   private double average;

   // construtor
   public Student(String name, double average) {

      this.name = name;

      // valida a média é > 0.0 e <= 100; caso contrário
      // armazena o valor padrão da média da variável de instância (0.0)
      if (average > 0.0)
         if (average <= 100)
            this.average = average;
   } // construct

   // getLetterGrade
   public String getLetterGrade() {

      // inicializa com a string vazia
      String letterGrade = "";

      // verifica o valor da nota
      if (average >= 90)
         letterGrade = "A";
      else if (average >= 80)
         letterGrade = "B";
      else if (average >= 70)
         letterGrade = "C";
      else if (average >= 60)
         letterGrade = "D";
      else
         letterGrade = "F";

      return letterGrade;
   } // end getLetterGrade

   public void setName(String name) {
      this.name = name;
   } // end setName

   public String getName() {
      return name;
   } // end getName

   // setAverage
   public void setAverage(double average) {
      if (average > 0.0)
         if (average <= 100)
            this.average = average;
   } // end setAverage

   public double getAverage() {
      return average;
   } // end getAverage

} // end class