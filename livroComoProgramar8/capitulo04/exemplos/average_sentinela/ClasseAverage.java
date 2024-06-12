package exemplos.average_sentinela;

/*
 * Resolvendo o problema da média da classe usando a repetição controlada por sentinela
 */
import java.util.Scanner;

public class ClasseAverage {
   public static void main(String[] args) {

      // create object Scanner input
      Scanner input = new Scanner(System.in);

      // variáveis
      int total = 0; // som as notas
      int gradeCounter = 0; // conta as notas inseridas pelo usuário

      // entrada de dados
      System.out.print("Enter grade or -1 to quit: ");
      int grade = input.nextInt(); // entrada do usuário

      // loop while, enquanto grade diferente de -1
      while (grade != -1) {
         // soma as notas
         total = total + grade;
         gradeCounter = gradeCounter + 1; // conta as notas informadas

         // entrada de dados
         System.out.print("Enter grade or -1 to quit: ");
         grade = input.nextInt(); // notas informadas pelo usuário
      } // end while

      // fase de termino
      // se nota maior que zero
      if (gradeCounter != 0) {
         double average = (double) total / gradeCounter;

         // dysplay result
         System.out.printf("%nTotal of the %d grade entered is %d%n", gradeCounter, total);
         System.out.printf("Class average is %.2f%n", average);
      } // end if
      else {
         System.out.println("No grade were entered.");
      }
   } // end main
} // end class
