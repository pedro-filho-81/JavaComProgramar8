package capitulo02.exercicios;

/*
 * 2.15 (Aritmética) Escreva um aplicativo que 
 * solicite ao usuário inserir dois inteiros, 
 * obtenha dele esses números e imprima sua soma, 
 * produto, diferença e quociente (divisão). 
 * Utilize as técnicas mostradas na Figura 2.7
 */
import java.util.Scanner;

public class Aritimetica {
   public static void main(String[] args) {

      // cria o objeto input da class Scanner
      Scanner input = new Scanner(System.in);

      // variables
      int n1, n2;

      // enter data
      System.out.print("Entre first integer: ");
      n1 = input.nextInt();
      System.out.print("Second integer: ");
      n2 = input.nextInt();

      // calculos
      int sum = n1 + n2;
      int diferenca = n1 - n2;
      int produto = n1 * n2;
      int quociente = n1 / n2;
      int resto = n1 % n2;

      // print result
      System.out.printf("\nVariáveis\nint n1 = %d\nint n2 = %d%n", n1, n2);
      System.out.printf("\nResultado\nSum is %d%n", sum);
      System.out.printf("Produto is %d%n", produto);
      System.out.printf("Diferença is %d%n", diferenca);
      System.out.printf("Quociente is %d%n", quociente);
      System.out.printf("Resto is %d%n", n1 % n2);
   } // end main
} // end class
