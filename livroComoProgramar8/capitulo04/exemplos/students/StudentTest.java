package capitulo04.exemplos.students;

/*
 * Cria e testa o objeto Student 
 */
public class StudentTest {
   public static void main(String[] args) {

      // cria o objeto account1 da class Student
      Student account1 = new Student("Jane Green", 93.5);
      displayStudent(account1);

      Student account2 = new Student("Jonh Blue", 72.75);
      displayStudent(account2);

   } // end main

   // create method display Student
   public static void displayStudent(Student displayToStudent) {
      // show result
      System.out.printf("%s's, average %.1f, letter grade is: %s%n",
            displayToStudent.getName(), // nome
            displayToStudent.getAverage(), // média
            displayToStudent.getLetterGrade()); // nota
   } // end displayStudent
} // end class StudentTest
