package capitulo04.exemplos.average_contador;

/*
 * Resolvendo o problema da média da classe usando a repetição controlado por controlador
 */
import java.util.Scanner; // programa utiliza a classe Scanner

public class ClasseAverage {
   public static void main(String[] args) {

      // create object input of the Scanner
      Scanner input = new Scanner(System.in);

      // variáveis
      int total = 0; // inicializa a variável soma
      int gradeCounter = 1; // inicializa o nº da nota pelo usuário

      // fase de processamentoutuliza repetição controlada pelo contador
      // enquanto o contador menor que 10 faça
      while (gradeCounter <= 10) // faz o loop 10 vezes
      {
         System.out.print("Enter grade: ");
         int grade = input.nextInt(); // entrada do usuário
         total = total + grade; // soma as notas
         gradeCounter = gradeCounter + 1; // contagem do contador
      } // end while

      // calcula a média
      int average = total / 10;

      // dysplay result
      System.out.printf("%nTotal of all 10 grade is %d%n", total);
      System.out.printf("Class averrage is %d%n", average);
   } // end main
} // end class
