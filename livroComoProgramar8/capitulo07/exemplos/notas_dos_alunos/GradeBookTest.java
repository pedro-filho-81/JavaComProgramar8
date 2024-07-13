/*
 * GradeBookTest cria o objeto GradeBook utilizando um array de notas
 * e, então, invoca o método processGrades para analizalas
 */
package notas_dos_alunos;

public class GradeBookTest {
    public static void main(String[] args) {
        
        // array de notas do aluno
        int[] gradesArray = {87, 68, 94, 100, 83, 45, 85, 91, 76, 87};

        // cria o objeto GradeBook
        GradeBook myGradeBook = new GradeBook(
                "CS101 Introduction to Java Programming", gradesArray);
        
        System.out.printf("\nWelcome to the grade book for%n%s%n%n", 
            myGradeBook.getCourseName());

        myGradeBook.processGrades();
    } // end main
} // end class
