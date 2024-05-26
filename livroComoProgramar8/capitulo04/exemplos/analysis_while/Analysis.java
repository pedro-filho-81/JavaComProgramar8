
/*
 * Analise dos resultados do exeme utilizando instruções de controle aninhados
 */
import java.util.Scanner;

public class Analysis {
   public static void main(String[] args) {
      // create object input of the class Scanner
      Scanner input = new Scanner(System.in);

      // inicializa variáveis nas declarações
      int passes = 0;
      int failures = 0;
      int studentCounter = 1;

      // while student less then or equal 10
      // processa 10 alunos com o loop controlado pelo contador
      while (studentCounter <= 10) {

         // entrada de dados
         System.out.print("Enter result (1 = pass and 2 = fail): ");
         int result = input.nextInt(); // entrada do usuário

         // if result equal 1
         if (result == 1)
            // passes receives passes plus one
            passes = passes + 1;
         else
            // failures receives failures plus one
            failures = failures + 1;

         // increment while
         studentCounter = studentCounter + 1;

      } // end while

      // show result
      System.out.printf("Passed: %d%nFailed: %d%n", passes, failures);

      // determina se mais de 8 alunos passaram
      if (passes > 8) {
         System.out.println("Bônus para o professor:");
      } // end if
   } // end main
} // end class